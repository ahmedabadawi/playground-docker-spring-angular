package playground.messaging.controller;

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
public class MessagingController {
	
	@RequestMapping(value = "/api/messages",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public MessagesResponse getMessages() {
		List<Message> messages = new ArrayList<>();
		messages.add(new Message("Test message 1", Date.valueOf("2011-01-01"), "Someone"));
		messages.add(new Message("Test message 2", Date.valueOf("2013-01-01"), "Someone else"));
		messages.add(new Message("Test message 3", Date.valueOf("2015-01-01"), "Yet another"));
		
		MessagesResponse response = new MessagesResponse();
		response.setMessages(messages);
		
		return response;
	}
}
