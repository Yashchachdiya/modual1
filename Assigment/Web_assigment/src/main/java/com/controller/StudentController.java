package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.StudentDao;

import com.model.StudentModel;


@WebServlet("/StudentController.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		String action=request.getParameter("action");

		if(action.equals("showuser"))
		{
			int studentid =Integer.parseInt(request.getParameter("studentid"));
			StudentModel model =new StudentDao().verifyLogin(studentid);
			request.setAttribute("model", model);
			request.getRequestDispatcher("show.jsp").forward(request, response);		
		}
		else if(action.equals("edit"))
		{
		    int studentid=Integer.parseInt(request.getParameter("studentid"));
			StudentModel emodel =new StudentDao().verifyLogin(studentid);
			request.setAttribute("emodel", emodel);
			request.getRequestDispatcher("show.jsp").forward(request, response);	
		}
		else if(action.equals("delete"))
		{
			int studentid=Integer.parseInt(request.getParameter("studentid"));
			int x =new StudentDao().delete(studentid);
			request.setAttribute("msg","Student record deleted successfully..");
			request.getRequestDispatcher("login.jsp").forward(request, response);	
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 
			StudentModel emodel=new StudentModel();
			emodel.setStudentid(Integer.parseInt(request.getParameter("studentid")));
			emodel.setFirstname(request.getParameter("firstname"));
			emodel.setLastname(request.getParameter("lastname"));
			emodel.setMobnumber(request.getParameter("mobnumber"));
			emodel.setGender(request.getParameter("gender"));
			emodel.setEmail(request.getParameter("email"));
			emodel.setPassword(request.getParameter("password"));
			int x=new StudentDao().updateStudent(emodel);
				if(x>0)
				{
					response.sendRedirect("StudentController.do?action=showuser&studentid="+emodel.getStudentid());
				}
	        
		
		}
	}


