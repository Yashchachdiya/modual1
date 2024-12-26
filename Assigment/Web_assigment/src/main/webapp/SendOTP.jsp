<%@page import="com.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
${invalidemail}
<body>
  Verify OTP
    <header >
 
    </header>

<%
String email=null;
if(session.getAttribute("otp")==null) 
{
response.sendRedirect("userlogin.jsp");
}
else	
{
	UserModel f=(UserModel)session.getAttribute("UserData");
	email=f.getEmail();
}
%>
	${notmatch }

    

       <h3> Enter OTP</h3>
       <form method="post" action="ForgotController">
       <label>Otp Sent on this email : <%=email %></label><br>
           <div >
               <input type="text" class="form-control"name="EnterOTP" 
       			placeholder="Enter OTP">
           </div>
         
           <div>
           <button type="submit" name="action" value="Verify" >
                   Verify
               </button>
           </div>
       </form>
                        
    
</body>
</html>