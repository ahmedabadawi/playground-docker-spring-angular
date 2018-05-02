package playground.notifications.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import playground.notifications.Notification;
import playground.notifications.NotificationsRepository;
import playground.notifications.Severity;

@RestController
public class NotificationsController {
	private NotificationsRepository notificationsRepository;
	
	@Autowired
	public NotificationsController(NotificationsRepository notificationsRepository) {
		this.notificationsRepository = notificationsRepository;
	}
	
	@RequestMapping(value = "/api/notifications", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public NotificationsResponse getMessages() {
		List<Notification> notifications = 
				notificationsRepository.findAll();
		
		NotificationsResponse response = new NotificationsResponse();
		response.setNotifications(notifications);

		return response;
	}
}
