package playground.messaging.controller;

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

import playground.messaging.Message;
import playground.messaging.MessagesRepository;

@RestController
public class MessagingController {
	private MessagesRepository messagesRepository;
	
	@Autowired
	MessagingController(MessagesRepository messagesRepository) {
		this.messagesRepository = messagesRepository;
	}
	
	@RequestMapping(value = "/api/messages",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public MessagesResponse getMessages() {
		List<Message> messages = messagesRepository.findAll();
				
		MessagesResponse response = new MessagesResponse();
		response.setMessages(messages);
		
		return response;
	}
}
