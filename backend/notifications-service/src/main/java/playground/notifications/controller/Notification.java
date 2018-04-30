package playground.notifications.controller;

import java.util.Date;

public class Notification {
	private Date timestamp;
	private String message;
	private Severity severity;
	
	public Notification() { }
	
	public Notification(String message, Date timestamp, Severity severity) {
		this.message = message;
		this.timestamp = timestamp;
		this.severity = severity;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	
	
}
