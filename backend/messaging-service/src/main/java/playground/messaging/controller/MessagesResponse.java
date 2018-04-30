package playground.messaging.controller;

import java.util.List;

public class MessagesResponse {
	private List<Message> messages;
	
	public MessagesResponse() { }
	
	public List<Message> getMessages() { return messages; }
	public void setMessages(List<Message> messages) { this.messages = messages; }
	
	public int getCount() { return messages.size(); }
}
