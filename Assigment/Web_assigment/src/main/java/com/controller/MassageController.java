package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.dao.MassageDao;
import com.dao.StudentDao;
import com.model.MessageModel;
import com.model.StudentModel;
import com.model.UserModel;

@WebServlet("/MassageController")
public class MassageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

       

    public MassageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		 	
		 	HttpSession session = request.getSession();
		 	UserModel umodel = (UserModel) session.getAttribute("userModel");
		 	String email = umodel.getEmail();
		 	
	        List<MessageModel> messages = MassageDao.getMessages(email);

	        request.setAttribute("messages", messages);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("viewMessages.jsp");
	        dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("sendMessage"))
		{
			MessageModel message = new MessageModel();
			
			message.setSenderEmail(request.getParameter("senderEmail"));
			message.setReceiverEmail(request.getParameter("receiverEmail"));
			message.setMessageText(request.getParameter("messageText"));
			MassageDao massageDao = new MassageDao();
			massageDao.sendMessage(message);
			 request.setAttribute("successMessage", "Message sent successfully.");
	            RequestDispatcher dispatcher = request.getRequestDispatcher("sendMessage.jsp");
	            dispatcher.forward(request, response);
		}
	
		
	}

}
