package playground.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NotificationsServiceApplication {
	@Autowired
	private DataSeeder dataSeeder;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(NotificationsServiceApplication.class, args);
		NotificationsServiceApplication app = 
				context.getBean(NotificationsServiceApplication.class);
		
		app.init();
	}
	
	public void init() {
		dataSeeder.seedIfEmpty();
	}
}
