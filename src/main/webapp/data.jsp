<%@page import="jsoft.library.Utilities"%>
<%@page import="jsoft.gui.product.ProductControl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jsoft.*, jsoft.objects.*"%>
<%@ page import="jsoft.gui.article.*, jsoft.gui.product.*"%>


<%
//Xác định mã hóa trang
request.setCharacterEncoding("utf-8");

//TÌm bộ quản lý kết nối 
ConnectionPool cp = (ConnectionPool) application.getAttribute("CPool");

//khai báo đối tượng lọc thông tin
ArticleObject similar = new ArticleObject();

//Lấy chuyên mục tin tức
similar.setArticle_section_id((short) 2);
//lấy những bài viết không xóa
similar.setArticle_delete(false);

//Lấy đường đẫn thực thi
String uri = request.getRequestURI().substring(6);//Lọi bỏ"/home/"
//Xác định menu con
int at = uri.indexOf("/");

String menu = "";
//Tổng sood bài viết cần lấy

if (at != -1) {
	menu = uri.substring(0, at);
	
	if (menu.equalsIgnoreCase("news")) {

		//Lấy cấu trúc hiển thị news
		
		//Tạo đối tượng thực thi chức năng
		ArticleControl ac = new ArticleControl(cp);
		if (cp == null) {
			application.setAttribute("CPool", ac.getCP());
		}
		
		//Tim id xem chi tiet neu co
		int id = Utilities.getIntParam(request, "id");
		
		if(id > 0){
			String detail = ac.viewArticleDetail((short)id);
			session.setAttribute("detail", detail);
		}else{
			String news = ac.viewNews(similar, (byte) 9, false);
			//Truyền vào vị trí hiển thị ở news.jsp thông qua phiên làm việc (session)
			session.setAttribute("subnews", news);
		}
		
		
		//Trả về kết nối
		ac.releaseConnection();
		

	}else if(menu.equalsIgnoreCase("product")){
		//Lấy cấu trúc hiển thị
		
		String products = (String)session.getAttribute("listproducts");
		if(products == null){
			ProductControl pc = new ProductControl(cp);
			if(cp == null){
				application.setAttribute("CPool", pc.getCP());
			}
			
			products = pc.viewProducts(null, (byte)12 );
			
			session.setAttribute("listproducts", products);
			
			pc.releaseConnection();
		}
	}
} else {
	String news = (String) session.getAttribute("homenews");
	if (news == null) {
		//Tạo đối tượng thực thi chức năng
		ArticleControl ac = new ArticleControl(cp);
		if (cp == null) {
	application.setAttribute("CPool", ac.getCP());
		}
		news = ac.viewNews(similar, (byte) 3, true);
		//Truyền vào vị trí hiển thị ở news.jsp thông qua phiên làm việc (session)
		session.setAttribute("homenews", news);
		//Trả về kết nối
		ac.releaseConnection();
	}
}
%>