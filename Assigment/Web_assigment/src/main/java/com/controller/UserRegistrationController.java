package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserRegistrationDao;
import com.model.UserModel;


@WebServlet("/UserRegistrationController")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("userregistration"))
		{
			UserModel umodel = new UserModel();
			umodel.setFirstname(request.getParameter("firstname"));
			umodel.setLastname(request.getParameter("lastname"));
			umodel.setEmail(request.getParameter("email"));
			umodel.setPassword(request.getParameter("password"));
			
			int x=new UserRegistrationDao().UserRegistration(umodel);
			if(x>0)
			{
				response.sendRedirect("userlogin.jsp");
				System.out.println("User Registration suscessfully..");
			}
			
			else
			{
				response.sendRedirect("User Registration Not suscessfully..");
			}
			
		}
		
	}

}
