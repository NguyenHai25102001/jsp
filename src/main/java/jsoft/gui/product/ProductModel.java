package jsoft.gui.product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jsoft.ConnectionPool;
import jsoft.objects.ProductObject;

public class ProductModel {
	private Product p;
	
	public ProductModel(ConnectionPool cp) {
		this.p = new ProductImpl(cp);
	}
	
	protected void finallize() throws Throwable{
		this.p = null;
	}
	
	//Chia sẻ bộ quản lí kết nối
	public ConnectionPool getCP() {
		return this.getCP();
	}
	
	//Thu hồi và trả về kết nối
	public void releaseConnection() {
		this.p.releaseConnection();
	}
	
	//----------------------------------------------
	public ProductObject getProductObject(int id) {
		
		ProductObject item = null;
		ResultSet rs = this.p.getProduct(id);
		if(rs != null) {
			try {
				if(rs.next()) {
					item = new ProductObject();
					item.setProduct_id(rs.getInt("product_id"));
					item.setProduct_name(rs.getString("product_name"));
					item.setProduct_image(rs.getString("product_image"));
					item.setProduct_price(rs.getInt("product_price"));
					item.setProduct_notes(rs.getString("product_notes"));
					item.setProduct_created_date(rs.getString("product_created_date"));
					item.setProduct_modified_date(rs.getString("product_modified_date"));
					item.setProduct_intro(rs.getString("product_intro"));
				}
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return item;
		
	}
	
	public ArrayList<ProductObject> getProductObjects(ProductObject similar, ProductSort ps, short page, byte total){
		
		ArrayList<ProductObject> items = new ArrayList<>();
		ProductObject item = null;
		
		int at = (page - 1) * total;
		ResultSet rs = this.p.getProducts(similar, ps, at, total);
		if(rs != null) {
			try {
				while(rs.next()) {
					item = new ProductObject();
					item.setProduct_id(rs.getInt("product_id"));
					item.setProduct_name(rs.getString("product_name"));
					item.setProduct_image(rs.getString("product_image"));
					item.setProduct_price(rs.getInt("product_price"));
					item.setProduct_notes(rs.getString("product_notes"));
					item.setProduct_created_date(rs.getString("product_created_date"));
					item.setProduct_modified_date(rs.getString("product_modified_date"));
					item.setProduct_intro(rs.getString("product_intro"));
					items.add(item);
				}
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return items;
	}
}
