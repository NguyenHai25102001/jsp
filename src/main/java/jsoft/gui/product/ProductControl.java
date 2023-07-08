package jsoft.gui.product;

import java.util.ArrayList;

import jsoft.ConnectionPool;
import jsoft.objects.ProductObject;

public class ProductControl {
	private ProductModel pm;
	
	public ProductControl(ConnectionPool cp) {
		this.pm = new ProductModel(cp);
	}
	
	protected void finalize() throws Throwable{
		this.pm = null;
	}
	
	public ConnectionPool getCP() {
		return this.pm.getCP();
	}
	
	public void releaseConnection() {
		this.pm.releaseConnection();
	}
	//----------------------------------------------
	public ProductObject getProductObject(short id) {
		return this.pm.getProductObject(id);
	}
	
	
	//-----------------------
	public String viewProducts(ProductObject similar, byte total) {
		//Lấy danh sách bài viết cần hiển thị
		ArrayList<ProductObject> items = this.pm.getProductObjects(similar, ProductSort.ID, (byte)1, total);
		
		//Trả về cấu trúc
		return ProductLibrary.viewProducts(items);
	}
	public static void main(String[] args) {
		//khởi tạo đối tượng thực thi chức năng mức control
		ProductControl pc=new ProductControl(null);
		
		//laaysdanh sách hiển thị dạng HTML
		String view=pc.viewProducts(null,(byte)1);
		
		pc.releaseConnection();
		//hjiee thi
		System.out.println(view);
	}
}
