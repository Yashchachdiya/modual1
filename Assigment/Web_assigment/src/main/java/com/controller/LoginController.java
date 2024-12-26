package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.model.StudentModel;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
         StudentModel lmodel=new StudentModel();
		
		lmodel.setEmail(request.getParameter("email"));
		lmodel.setPassword(request.getParameter("password"));
		
		StudentModel model=new LoginDao().getLogin(lmodel);
		if(model != null)
		{
			HttpSession session =request.getSession(true);
			session.setAttribute("model", model);
			//session.setMaxInactiveInterval(15*60);
			response.sendRedirect("StudentController.do?action=showuser&studentid="+model.getStudentid());
			
		}
		else
		{
			request.setAttribute("msg", "Invalid username or password..");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		
	}

}
