package playground.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MessagingServiceApplication {

	@Autowired
	private DataSeeder dataSeeder;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(MessagingServiceApplication.class, args);
		
		MessagingServiceApplication app = 
				context.getBean(MessagingServiceApplication.class);
		app.init();
	}
	
	public void init() {
		dataSeeder.seedIfEmpty();
	}
}
