<%@page import="jsoft.library.Utilities"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


    <!-- news -->
		<div class="container-lg my-5">
			<div class="row my-3">
				<div class="col-md-12 text-center">
					<h3>Tin tức mới <span class="badge bg-secondary">New</span></h3>
				</div>
			</div>
			
		<% 
		//Tìm cấu trúc hiển thị do trang data.jsp truyền cho ở trong session
		
		//Tìm id xem chi tiết nếu có
		int id = Utilities.getIntParam(request, "id");
		if(id > 0){
			String detail = (String)session.getAttribute("detail");
			if(detail != null){
				out.print(detail);
			}
		}else{
			int at = request.getRequestURI().substring(6).indexOf("/");
			String news = "";
			if(at != -1){
				news = (String)session.getAttribute("subnews");
			}else{
				news = (String)session.getAttribute("homenews");
			}
			
			
			if(news!=null){
				out.print(news);
			}
		}
		
		
		
		
		%>
			
		</div>