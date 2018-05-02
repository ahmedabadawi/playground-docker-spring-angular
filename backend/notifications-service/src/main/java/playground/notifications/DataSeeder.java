package playground.notifications;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DataSeeder {
	private final Notification[] seedNotifications= new Notification[] {
		new Notification("Test Notification 1", Date.from(Instant.now().minus(10, ChronoUnit.DAYS)), Severity.LOW),
		new Notification("Test Notification 2", Date.from(Instant.now().minus(12, ChronoUnit.DAYS)), Severity.MED),
		new Notification("Test Notification 3", Date.from(Instant.now().minus(15, ChronoUnit.DAYS)), Severity.HIGH),
		new Notification("Test Notification 4", Date.from(Instant.now().minus(17, ChronoUnit.DAYS)), Severity.CRITICAL),
	};
	
	private NotificationsRepository notificationsRepository;
	
	public DataSeeder(NotificationsRepository notificationsRepository) {
		this.notificationsRepository = notificationsRepository;
	}
	
	public void seedIfEmpty() {
		long numberOfRecords = notificationsRepository.count();
		if(numberOfRecords == 0) {
			for(Notification notification: seedNotifications) {
				notificationsRepository.insert(notification);
			}
		}
	}
}
