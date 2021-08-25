<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Join Page</h1>
	
	<form action="./memberJoin.do" method="post">
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		Name : <input type="text" name="name"><br>
		Phone : <input type="tel" name="phone"><br>
		Email : <input type="email" name="email"><br>
		<button>JOIN</button>
	</form>
	
</body>
</html>