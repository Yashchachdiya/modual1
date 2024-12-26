package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MessageDao;
import com.dao.UserDao;
import com.model.Message;
import com.model.User;
import com.model.View;


@WebServlet("/MessageController")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MessageController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserDao userDao = new UserDao();
        MessageDao messageDao = new MessageDao();
        View view = new View();  // Assuming you have a View class for displaying messages

        String action = request.getParameter("action");

        if ("getUserDetails".equals(action)) {
            // Retrieve user details logic (this is just an example)
            int uid = Integer.parseInt(request.getParameter("uid"));
            try {
                User user = userDao.getUserById(uid);
                request.setAttribute("user", user);
                request.getRequestDispatcher("/userDetails.jsp").forward(request, response);
            } catch (SQLException e) {
                response.getWriter().write("Error retrieving user: " + e.getMessage());
            }
        } else {
            // Handle other actions or invalid ones
            response.getWriter().write("Invalid action.");
        }
    }
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserDao userDao = new UserDao();
        MessageDao messageDao = new MessageDao();
        View view = new View();  // Assuming you have a View class for displaying messages

        String action = request.getParameter("action");

        if ("addUser".equals(action)) {
            // Collect user details from the request
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");

            User user = new User();
            user.setFname(fname);
            user.setLname(lname);
            user.setEmail(email);
            user.setMobile(mobile);

            try {
                int uid = UserDao.addUser(user);
                user.setUid(uid);
                view.displayMessage("User added successfully with UID: " + uid);
                response.sendRedirect("/success.jsp"); // Redirect to a success page
            } catch (SQLException e) {
                view.displayMessage("Error adding user: " + e.getMessage());
                response.sendRedirect("/error.jsp"); // Redirect to an error page
            }

        } else if ("addMessage".equals(action)) {
            // Collect message details from the request
            String from = request.getParameter("from");
            String to = request.getParameter("to");
            String msg = request.getParameter("msg");

            Message message = new Message();
            message.setFrom(from);
            message.setTo(to);
            message.setMsg(msg);

            try {
                boolean success = messageDao.addMessage(message);
                if (success) {
                    view.displayMessage("Message added successfully.");
                    response.sendRedirect("/success.jsp");
                } else {
                    view.displayMessage("Failed to add message. Sender email not found.");
                    response.sendRedirect("/error.jsp");
                }
            } catch (SQLException e) {
                view.displayMessage("Error adding message: " + e.getMessage());
                response.sendRedirect("/error.jsp");
            }
        } else {
            response.getWriter().write("Invalid action.");
        }
    }
	

}
