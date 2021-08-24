<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bankbook List Page</h1>
	<%
		Object obj = request.getAttribute("list");
		ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)obj;
		for(BankBookDTO dto:ar){
	%>
		<h2>Name : <a href="./bankbookSelect.do?bookNumber=<%= dto.getBookNumber()%>"><%=dto.getBookName() %></a></h2>
		<h2>Rate : <%=dto.getBookRate() %></h2>
			
	<%}%>
</body>
</html>