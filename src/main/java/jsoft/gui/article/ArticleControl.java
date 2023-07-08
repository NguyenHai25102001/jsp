package jsoft.gui.article;

import java.util.ArrayList;


import jsoft.ConnectionPool;

import jsoft.objects.ArticleObject;

public class ArticleControl {

	private ArticleModel am;
	public ArticleControl(ConnectionPool cp) {
		this.am = new ArticleModel(cp);
	}
	protected void finalize() throws Throwable{
		this.am = null;
	}
	public ConnectionPool getCP() {
		return this.am.getCP();
	}
	
	public void  releaseConnection() {
		this.am.releaseConnection();
	}
	
	
	//----------------
	public ArticleObject getArticleObject(short id) {
		return this.am.getArticleObject(id);
	}
	//-----------------------
	public String viewNews(ArticleObject similar, byte total, boolean isHomeView) {
		//Lấy danh sách bài viết cần hiển thị
		ArrayList<ArticleObject> items = this.am.getArticleObjects(similar, ArticleSort.ID, (byte)1, total);
		
		//Trả về cấu trúc
		if(isHomeView) {
			return ArticleLibrary.viewNews(items, isHomeView);
		}else {
			return ArticleLibrary.viewSubNewsV2(items);
		}
		
	}
	
	public String viewArticleDetail(short id) {
		ArticleObject item = this.am.getArticleObject(id);
		
		return ArticleLibrary.viewArticleDetail(item);
	}
	public static void main(String[] args) {
		//khởi tạo đối tượng thực thi chức năng mức control
				ArticleControl pc=new ArticleControl(null);
				
				//laaysdanh sách hiển thị dạng HTML
				String view=pc.viewArticleDetail((byte)4);
				
				pc.releaseConnection();
				//hjiee thi
				System.out.println(view);
	}
	
}
