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

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">

<title>Student Registration Form</title>
<script>
function validateForm() 
{
    
    var firstName = document.getElementById("firstName").value;
    var namePattern = /^[A-Za-z]+$/;
    if (!firstName.match(namePattern)) 
    {
        alert("First Name must only contain alphabets.");
        return false;
    }

    var lastName = document.getElementById("lastName").value;
    if (!lastName.match(namePattern)) 
    {
        alert("Last Name must only contain alphabets.");
        return false;
    }

    var mobNumber = document.getElementById("mobNumber").value;
    var mobilePattern = /^[0-9]{10}$/;
    if (!mobNumber.match(mobilePattern)) 
    {
        alert("Mobile Number must be exactly 10 digits.");
        return false;
    }
    var email = document.getElementById("email").value;
    var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!email.match(emailPattern)) 
    {
        alert("Please enter a valid email address.");
        return false;
    }

    var password = document.getElementById("password").value;
    var passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@#$%_&]).{6,}$/;
    if (!password.match(passwordPattern)) 
    {
        alert("Password must contain at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character (@, #, $, %, _, &).");
        return false;
    }

    return true; 
}
</script>
</head>
<body>
<h2>Registration Form</h2>
    <form  method="post" action="RegistrationStudentController" onsubmit="return validateForm()">
    <div class="mb-3">
        <label for="firstName"class="form-label">First Name:</label>
        <input type="text" id="firstName" name="firstname">
        <br><br>
         </div>
<div class="mb-3">
        <label for="lastName"class="form-label">Last Name:</label>
        <input type="text" id="lastName" name="lastname">
        <br><br>
         </div>
<div class="mb-3">
        <label for="mobNumber"class="form-label">Mobile Number:</label>
        <input type="text" id="mobNumber" name="mobnumber">
        <br><br>
         </div>
 <div class="mb-3">
                <label for="gender" class="form-label">Gender</label>
                <select  id="gender" name="gender" required>
                    <option value="" disabled selected>Select Gender</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                </select>
            </div>
 <div class="mb-3">           
        <label for="email"class="form-label">Email:</label>
        <input type="email" id="email" name="email">
        <br><br>
         </div>
<div class="mb-3">
        <label for="password"class="form-label">Password:</label>
        <input type="password" id="password" name="password">
        <br><br>
         </div>

         <button type="submit" name="action" value="registration" >
           Submit
         </button>
    </form>
</body>
</html>
