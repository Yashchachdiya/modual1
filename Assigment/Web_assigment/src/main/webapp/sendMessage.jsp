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
    <input type="hidden" name="action" value="sendMessage">
    From User ID: <input type="text" name="from"><br>
    To User ID: <input type="text" name="to"><br>
    Message: <textarea name="msg"></textarea><br>
    <input type="submit" value="Send Message">
</form>
</body>
</html>