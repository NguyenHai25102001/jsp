<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="wrapper">


	<div class="container">

		<div class="row g-1">
		<%
		String products=(String)session.getAttribute("listproducts");
		if(products!=null){
			out.print(products);
		}
		
		%>

	
		</div>
		

	</div>


</div>