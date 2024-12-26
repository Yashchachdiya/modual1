<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg}
<form method="post" action="LoginController">
<table>
<tr>
<td colspan="2" align="center"><h1>Login Page </h1></td>
</tr>

<tr>
<td>Enter Email : </td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Enter Password : </td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" name="Login"></td>
</tr>
</table>

</form>
</body>
</html>