package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDao;
import com.model.RegistrationModel;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("registration"))
		{
		RegistrationModel rmodel = new RegistrationModel();
		rmodel.setFirstname(request.getParameter("firstname"));
		rmodel.setLastname(request.getParameter("lastname"));
		rmodel.setMobnumber(request.getParameter("mobnumber"));
		rmodel.setEmail(request.getParameter("email"));
		rmodel.setPassword(request.getParameter("password"));
		int x=new RegistrationDao().Registration(rmodel);
		if(x>0)
		{
			System.out.println("Registration suscessfully..");
		}
		}
		else
		{
			response.sendRedirect("Registration Not suscessfully..");
		}
	
	}

}
