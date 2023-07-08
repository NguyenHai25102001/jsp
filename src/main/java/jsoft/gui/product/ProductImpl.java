package jsoft.gui.product;

import java.sql.ResultSet;

import jsoft.ConnectionPool;
import jsoft.gui.basic.BasicImpl;
import jsoft.objects.ProductObject;

public class ProductImpl extends BasicImpl implements Product  {

	public ProductImpl(ConnectionPool cp) {
		super("Product", cp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getProduct(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblproduct ";
		//sql += "INNER JOIN ";
		sql += "";
		sql += "WHERE product_id = ?";
		return this.get(sql, id);
	}

	@Override
	public ResultSet getProducts(ProductObject similar, ProductSort ps, int at, byte total) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblproduct ";
		sql += "LEFT JOIN tblpc ON product_pc_id = pc_id ";
		sql += "LEFT JOIN tblpg ON product_pc_id = pg_id ";
		sql += "LEFT JOIN tblps ON product_pg_id = ps_id ";
		
		sql += "";
		
		switch (ps) {
		case ID:
			sql += "ORDER BY product_id ASC ";
			break;
		case NAME:
			sql += "ORDER BY product_name ASC ";
			break;
		case PRICE:
			sql += "ORDER BY product_price DESC ";
			break;
		default:
			break;
		}
		sql += "LIMIT "+at+", "+total;
		return this.gets(sql);
	}

}
