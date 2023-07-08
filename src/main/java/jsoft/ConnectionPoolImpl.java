package jsoft;

import java.sql.*;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPoolImpl implements ConnectionPool {
	
	//Tài khoản làm việc với CSDL
	private String userName;
	private String userPass;
	
	//Trình điều khiển làm việc với CSDL MySQL
	private String driver;
	
	//Đường dẫn thực thi của MySQL
	private String url;
	
	//Đối tượng lưu trữ kết nối
	private Stack<Connection> pool;
	
	public ConnectionPoolImpl() {
		//Xác định tài khoản 
				this.userName = "root";
				this.userPass = "Haivip10";
				
				//Xác định trình điều khiển
				this.driver = "com.mysql.jdbc.Driver";
				
				//Xác định đường dẫn thực thi
				this.url = "jdbc:mysql://localhost:3306/ip223_data";
				
		
		//Khởi tạo đối tượng lưu trữ
		this.pool = new Stack<>();
		
		//nạp trình điều khiển
		this.loadDrive();
		
	}
	

	
	private void loadDrive() {
		try {
			Class.forName(this.driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Connection getConnection(String objectName) throws SQLException {
		
		if(this.pool.isEmpty()) {
			//Khởi tạo kết nối mới
			System.out.println(objectName + " have created a new connnection.");
			return DriverManager.getConnection(this.url, this.userName, this.userPass);
		}else {
			//lấy kết nối đã được lưu trữ trc đó
			System.out.println(objectName + " have popped the Connection");
			return this.pool.pop();
		}
		
	}

	@Override
	public void releaseConnection(Connection con, String objectName) throws SQLException {
		
		//Yêu cầu đối tượng trả về kết nối
		System.out.println(objectName+ " have pushed the connection");
		this.pool.push(con);

	}
	
	protected void finalize() throws Throwable{
		//Giải phóng giữ liệu
		this.url = null;
		this.userName = null;
		this.userPass = null;
		this.driver = null;
		
		this.pool.clear();
		this.pool = null;
		
		System.out.println("CP is closed");
		
		
	}
	
	//tại sao sử dúng stack mà k sử dụng vector?

}
