<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<head>
    <title>Student Form</title>
</head>
<body>
    <h1>Submit Student Information</h1>
    <form action="studentServlet" method="POST">
    
        <label for="fname">First Name:</label>
        <input type="text" id="fname" name="fname">
        <br><br>

        <label for="lname">Last Name:</label>
        <input type="text" id="lname" name="lname">
        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <br><br>

        <label for="mobile">Mobile:</label>
        <input type="text" id="mobile" name="mobile">
        <br><br>

        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="Male"> Male
        
        <input type="radio" id="female" name="gender" value="Female"> Female
        <br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>