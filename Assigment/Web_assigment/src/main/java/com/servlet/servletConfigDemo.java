//1).Write a Java program to fetch data fromweb.xml to Servlet using ServletConfig.

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ServletConfigDemo")
public class servletConfigDemo extends HttpServlet {
	ServletConfig config=null;
	private static final long serialVersionUID = 1L;
   
    public servletConfigDemo() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
     @Override
     public void init(ServletConfig config) throws SecurityException
     {
    	 this.config=config; 
     }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		out.println("<h1> Username is.."+username);
		out.println("<h1> Password is.."+password);
		
	}

}
