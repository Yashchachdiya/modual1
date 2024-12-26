<!-- 6).Write a Java programto validate jsp formserverside.
First Name: Only Alphabets Last Name: Only Alphabets Mobile: Only 10 Numbers
Email: Standard Email Id
Password: Minimum One 1 Upper, Minimum 1 Lower, Minimum 1 Digit, Minimum
1 Special Character from@, #, $, %, _, & I2. Write CRUD operation using jsp only.
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<script>
function validateForm() 
{
    
    var firstName = document.getElementById("firstName").value;
    var namePattern = /^[A-Za-z]+$/;
    if (!firstName.match(namePattern)) {
        alert("First Name must only contain alphabets.");
        return false;
    }

    var lastName = document.getElementById("lastName").value;
    if (!lastName.match(namePattern)) {
        alert("Last Name must only contain alphabets.");
        return false;
    }

    var mobNumber = document.getElementById("mobNumber").value;
    var mobilePattern = /^[0-9]{10}$/;
    if (!mobNumber.match(mobilePattern)) {
        alert("Mobile Number must be exactly 10 digits.");
        return false;
    }
    var email = document.getElementById("email").value;
    var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!email.match(emailPattern)) {
        alert("Please enter a valid email address.");
        return false;
    }

    var password = document.getElementById("password").value;
    var passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@#$%_&]).{6,}$/;
    if (!password.match(passwordPattern)) {
        alert("Password must contain at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character (@, #, $, %, _, &).");
        return false;
    }

    return true; 
}
</script>
</head>
<body>
<h2>Registration Form</h2>
    <form  method="post" action="RegistrationController" onsubmit="return validateForm()">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstname">
        <br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastname">
        <br><br>

        <label for="mobNumber">Mobile Number:</label>
        <input type="text" id="mobNumber" name="mobnumber">
        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <br><br>

         <button type="submit" name="action" value="registration" >
           Registration
         </button>
    </form>
</body>
</html>
