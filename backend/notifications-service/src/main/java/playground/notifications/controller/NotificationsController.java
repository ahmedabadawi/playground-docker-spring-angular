package playground.notifications.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {
	@RequestMapping(value = "/api/notifications", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public NotificationsResponse getMessages() {
		List<Notification> notifications = new ArrayList<>();
		notifications.add(new Notification("Something minor happened.", Date.valueOf("2011-01-01"), Severity.LOW));
		notifications
				.add(new Notification("Something critical happened.", Date.valueOf("2013-01-01"), Severity.CRITICAL));
		notifications.add(new Notification("Something happened.", Date.valueOf("2015-01-01"), Severity.MED));

		NotificationsResponse response = new NotificationsResponse();
		response.setNotifications(notifications);

		return response;
	}
}
