package playground.messaging;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Message {
	@Id
	private String id;
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
	
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	
	public String getContent() { return content; }
	public void setContent(String content) { this.content = content; }
	
	public Date getTimestamp() { return timestamp; }
	public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }
	
	public String getSender() { return sender; }
	public void setSender(String sender) { this.sender = sender; }
}
