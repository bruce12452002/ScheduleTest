package bruce.home.ScheduleTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@SpringBootApplication
//@EnableScheduling
public class ScheduleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleTestApplication.class, args);
	}


	@Bean
	public ScheduledExecutorService scheduledExecutorService() {
		return Executors.newScheduledThreadPool(3);
	}
}
