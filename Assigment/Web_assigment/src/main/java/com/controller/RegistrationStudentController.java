package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.model.StudentModel;


@WebServlet("/RegistrationStudentController")
public class RegistrationStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String action=request.getParameter("action");
			if(action.equals("registration"))
			{
				StudentModel smodel = new StudentModel();
				smodel.setFirstname(request.getParameter("firstname"));
				smodel.setLastname(request.getParameter("lastname"));
				smodel.setMobnumber(request.getParameter("mobnumber"));
				smodel.setGender(request.getParameter("gender"));
				smodel.setEmail(request.getParameter("email"));
				smodel.setPassword(request.getParameter("password"));
				
				int x=new StudentDao().Student(smodel);
				
				if(x>0)
				{
					request.getRequestDispatcher("show.jsp").forward(request, response);	
					System.out.println("Student Registration suscessfully..");
				}
				
				else
				{
					response.sendRedirect("Student Registration Not suscessfully..");
				}
			}
	}

}
