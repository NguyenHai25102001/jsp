package jsoft.gui.basic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jsoft.ConnectionPool;
import jsoft.ShareControl;



public interface Basic extends ShareControl { // có thể có nhiều basic , chỉ basic sử dụng connection pool
	
	
		
		public ResultSet get(String sql, int value);
		public ResultSet get(String sql, String name, String pass);
		
		//Lấy nhiều
		public ResultSet gets(String sql);
		
		/*
		 * //Chức năng chia sẻ bộ quản lí giữa các basic public ConnectionPool getCP();
		 * 
		 * //Chức năng thu hồi và trả lại kết nối public void releaseConnection();
		 */
		

}
