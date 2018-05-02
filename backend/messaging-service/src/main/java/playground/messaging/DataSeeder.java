package playground.messaging;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DataSeeder {
	private final Message[] seedMessages = new Message[] {
		new Message("Test Message 1", Date.from(Instant.now().minus(10, ChronoUnit.DAYS)), "User1"),
		new Message("Test Message 2", Date.from(Instant.now().minus(12, ChronoUnit.DAYS)), "User2"),
		new Message("Test Message 3", Date.from(Instant.now().minus(15, ChronoUnit.DAYS)), "User3"),
		new Message("Test Message 4", Date.from(Instant.now().minus(17, ChronoUnit.DAYS)), "User2"),
	};
	
	private MessagesRepository messagesRepository;
	
	public DataSeeder(MessagesRepository messagesRepository) {
		this.messagesRepository = messagesRepository;
	}
	
	public void seedIfEmpty() {
		long numberOfRecords = messagesRepository.count();
		if(numberOfRecords == 0) {
			for(Message message: seedMessages) {
				messagesRepository.insert(message);
			}
		}
	}
}
