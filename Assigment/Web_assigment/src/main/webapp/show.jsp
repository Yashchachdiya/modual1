<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
</head>
<body>
<table border="1">
<tr>
<th>StudentID</th>
<th>FirstName</th>
<th>LastName</th>
<th>Mobile No</th>
<th>Gender</th>
<th>Email ID</th>
<th>Password</th>
<th>Action</th>
</tr>
<tr>
<td>${model.studentid}</td>
<td>${model.firstname}</td>
<td>${model.lastname}</td>
<td>${model.mobnumber}</td>
<td>${model.gender}</td>
<td>${model.email}</td>
<td>${model.password}</td>
<td><a href="StudentController.do?action=edit&studentid=${model.studentid}">Edit</a></td>
 <td><a href="StudentController.do?action=delete&studentid=${model.studentid}">Delete</a></td>

</tr>
</table>
<br><br>
 <c:if test="${emodel.studentid > 0 }">

<form method="post" action="StudentController.do"> 
<table>
<tr>
<td colspan="2" align="center"><h1>Edit user Page </h1></td>
</tr>
<tr>
<td>Enter FirstName : </td>
<td><input type="text" name="firstname" value="${emodel.firstname}"></td>
</tr>

<tr>
<td>Enter LastName : </td>
<td><input type="text" name="lastname" value="${emodel.lastname}"></td>
</tr>

<tr>
<td>Enter Mobile Number : </td>
<td><input type="text" name="mobnumber" value="${emodel.mobnumber}"></td>
</tr>
<tr>
<td>Enter Gender : </td>
<td><input type="text" name="gender" value="${emodel.gender}"></td>
</tr>
<tr>
<td>Enter Email : </td>
<td><input type="text" name="email" value="${emodel.email}"></td>
</tr>

<tr>
<td>Enter Password : </td>
<td><input type="password" name="password" value="${emodel.password}"><input type="hidden" name="studentid" value="${emodel.studentid}"></td>
</tr>

<tr>
<td><input type="submit" name="Update"></td>
</tr>
</table>

</form>
</c:if>

</body>
</html>