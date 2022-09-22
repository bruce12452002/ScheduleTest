package bruce.home.ScheduleTest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class Task {
    @Scheduled(cron = "0/2 * * * * *")
    public void aaa() {
        System.out.println("a=" + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Scheduled(cron = "0/3 * * * * *")
    public void bbb() {
        System.out.println("b=" + Thread.currentThread().getName());
    }

}
