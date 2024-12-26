<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action="ForgotController" onsubmit="return validateForm()">
       
        <h4>Enter you Email</h4>
 <input type="text" class="form-control"name="email"placeholder="Email">
        
         <button type="submit" name="action" value="submit" >
           Verify
         </button>
    </form>

</body>
</html>