<!-- Create one registration formto register user.
i. Do client and server side validation. Use AJAX to register with
unique email id.
ii. After successful registration confirmation email should be sent to
user’s email id with one OTP.
iii. Verify OTP and then and then allowed to login to the user. o
After successful login user can edit their profile.
iv. Also one user can send some msg to another user using their email id.
v. When another user logged in they are able to see msg sent by a
particular user and also can reply.
vi. Logout button is there to invalidate session.
vii. Also take care when user logged out and press back button on browser
then it should be in logged out mode. -->

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

    
    var email = document.getElementById("email").value;
    var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!email.match(emailPattern)) {
        alert("Please enter a valid email address.");
        return false;
    }

   
    return true; 
}
</script>
</head>
<body>
<h2>Registration Form</h2>
    <form  method="post" action="UserRegistrationController" onsubmit="return validateForm()">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstname">
        <br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastname">
        <br><br>


        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <br><br>

         <button type="submit" name="action" value="userregistration" >
           Registration
         </button>
    </form>
</body>
</html>
