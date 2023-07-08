<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hi form</title>
</head>
<body>

	

	<%
	request.setCharacterEncoding("utf-8");
	
	//tìm tham số để lấy ra tên nếu có
	String name = request.getParameter("txtName");
	if(name != null && !name.equalsIgnoreCase("")){
		out.print("<h3>Xin chào: "+name+"</h3>");
		out.print("<a href=\"/home/hiform.jsp\"> Trở lại</a>");
	}else{
		
	
	
	%>

	<form action="hiform.jsp" method="post" name="">
		Hãy nhập vào tên của bạn:
		<input type="text" name="txtName">
		<button type="submit" name="btnSend">Gửi</button>
	</form>
	<%
	}
	%>
	
	
</body>
</html>