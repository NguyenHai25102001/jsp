
package jsoft.gui.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jsoft.ConnectionPool;
import jsoft.*;

public class BasicImpl implements Basic {

	// đối tượng làm việc với Basic
	private String objectName;

	// bộ quản lý kết nối riêng của basic
	private ConnectionPool cp;

	// kết nối để Basic làm việc với CSDL
	protected Connection con;

	public BasicImpl(String objectName, ConnectionPool cp) {
		// xác định đói tượng làm việc với Basic
		this.objectName = objectName;

		// xác định bộ quản lý kết nối
		if (cp == null) {
			this.cp = new ConnectionPoolImpl();
		} else {
			this.cp = cp;
		}
		// xin kết nối để làm việc
		try {
			this.con = this.cp.getConnection(this.objectName);

			// Kiểm tra chế độ thực thi tự động của kết nối
			if (this.con.getAutoCommit()) {
				// chấm dứt chế độ thực thi tự động
				this.con.setAutoCommit(false);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	

	@Override
	public ResultSet get(String sql, int value) {
		// TODO Auto-generated method stub

		// thực hiện biên dịch câu lệnh sql
		try {
			PreparedStatement preGet = this.con.prepareStatement(sql);
			if (value > 0) {
				preGet.setInt(1, value);
			}

			// Trả về kết quả
			return preGet.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			try {
				this.con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {

		}
		return null;
	}

	@Override
	public ResultSet get(String sql, String name, String pass) {
		// TODO Auto-generated method stub

		// thực hiện biên dịch câu lệnh sql
		try {
			PreparedStatement preGet = this.con.prepareStatement(sql);
			preGet.setString(1, name);
			preGet.setString(2, pass);

			// trả về kết quả
			return preGet.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			try {
				this.con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {

		}
		return null;
	}

	@Override
	public ResultSet gets(String sql) {
		// TODO Auto-generated method stub
		return this.get(sql, 0);
	}

	@Override
	public ConnectionPool getCP() {
		// TODO Auto-generated method stub
		return this.cp;
	}

	@Override
	public void releaseConnection() {
		// TODO Auto-generated method stub
		try {
			this.cp.releaseConnection(this.con, this.objectName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}