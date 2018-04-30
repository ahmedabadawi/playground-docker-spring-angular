package playground.messaging.controller;

import java.util.Date;

public class Message {
	private String content;
	private Date timestamp;
	private String sender;
	
	public Message() { }
	
	public Message(String content, Date timestamp, String sender) {
		this();
		
		this.content = content;
		this.timestamp = timestamp;
		this.sender = sender;
	}
	
	public String getContent() { return content; }
	public void setContent(String content) { this.content = content; }
	
	public Date getTimestamp() { return timestamp; }
	public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }
	
	public String getSender() { return sender; }
	public void setSender(String sender) { this.sender = sender; }
}
