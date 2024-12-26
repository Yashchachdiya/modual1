package com.model;

import java.util.Date;

public class MessageModel 
{
	 private int id;
	    private String senderEmail;
	    private String receiverEmail;
	    private String messageText;
	    private Date timestamp;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSenderEmail() {
			return senderEmail;
		}
		public void setSenderEmail(String senderEmail) {
			this.senderEmail = senderEmail;
		}
		public String getReceiverEmail() {
			return receiverEmail;
		}
		public void setReceiverEmail(String receiverEmail) {
			this.receiverEmail = receiverEmail;
		}
		public String getMessageText() {
			return messageText;
		}
		public void setMessageText(String messageText) {
			this.messageText = messageText;
		}
		public Date getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}
	    

}
