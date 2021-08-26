<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Select Page</h1>

	
	<h3>num :  ${dto.bookNumber} </h3>
	<h3>Name : ${requestScope.dto.bookName} </h3>
	<h3>Count : ${requestScope.count} </h3>
	<h3>Name : ${name}</h3>
	<h3>SE : ${sessionScope.se} </h3>
	<h3>SE : ${se} </h3>	
</body>
</html>