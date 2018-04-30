package playground.notifications.controller;

import java.util.List;

public class NotificationsResponse {
	private List<Notification> notifications;
	
	public NotificationsResponse() { }
	
	
	public List<Notification> getNotifications() {
		return notifications;
	}


	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}


	public int getCount() { 
		return notifications != null ? notifications.size() : 0; 
	}
}
