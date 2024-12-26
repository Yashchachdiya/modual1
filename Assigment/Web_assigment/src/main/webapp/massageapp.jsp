<!-- 8).Write a Java dynamic application “Message Passing System “using MVC and
JDBC. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserController" method="Get">
    <input type="hidden" name="action" value="register">
    First Name: <input type="text" name="fname"><br>
    Last Name: <input type="text" name="lname"><br>
    Email: <input type="text" name="email"><br>
    Mobile: <input type="text" name="mobile"><br>
    <input type="submit" value="Register">
</form>
</body>
</html>