package jsoft;

public interface ShareControl {
	
	//Chức năng chia sẻ bộ quản lí kết nối giữa các basic
	public ConnectionPool getCP();
	
	//Chức năng yêu cầu trả về kết nối
	public void releaseConnection();
}
