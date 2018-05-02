package playground.notifications;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Notification {
	@Id
	private String id;
	private Date timestamp;
	private String message;
	private Severity severity;
	
	public Notification() { }
	
	public Notification(String message, Date timestamp, Severity severity) {
		this.message = message;
		this.timestamp = timestamp;
		this.severity = severity;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
