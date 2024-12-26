//2).Write a Java programto fetch data fromweb.xml to Servlet using ServletCotext.
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletContext")
public class Context extends HttpServlet {
	ServletContext context=null;
	private static final long serialVersionUID = 1L;

    public Context() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws SecurityException
    {
    	context=config.getServletContext(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String user=context.getInitParameter("user");
		String pass=context.getInitParameter("pass");
		out.println("<h1> User is.."+user);
		out.println("<h1> Pass is.."+pass);
		
	}

}
