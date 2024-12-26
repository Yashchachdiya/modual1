package com.dao;

import com.model.MessageModel;
import com.model.RegistrationModel;
import com.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MassageDao {
Connection cn=null;
	
	public void sendMessage(MessageModel message)
	{
		
		cn=new DBUtil().getConnectionData();
		String qry="INSERT INTO messages (sender_email, receiver_email, message_text) VALUES (?, ?, ?)";
		
		try 
		{
			PreparedStatement ps=cn.prepareStatement(qry);
			 ps.setString(1, message.getSenderEmail());
	            ps.setString(2, message.getReceiverEmail());
	            ps.setString(3, message.getMessageText());
	            ps.executeUpdate();
			ps.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	
	public List<MessageModel> getMessages(String receiverEmail)
	{
		 List<MessageModel> messages = new ArrayList<>();
		
		cn=new DBUtil().getConnectionData();
		String qry="SELECT * FROM messages WHERE receiver_email = ?";
		
		try 
		{
			PreparedStatement ps=cn.prepareStatement(qry);
			 ps.setString(1, receiverEmail);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) 
	            {
	                MessageModel message = new MessageModel();
	                message.setId(rs.getInt("id"));
	                message.setSenderEmail(rs.getString("sender_email"));
	                message.setReceiverEmail(rs.getString("receiver_email"));
	                message.setMessageText(rs.getString("message_text"));
	                message.setTimestamp(rs.getTimestamp("timestamp"));
	                messages.add(message);
	            }
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return messages;
	}



	



}
