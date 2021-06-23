package tr.com.kare.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HatirlatmaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HatirlatmaServiceApplication.class, args);
    }

}
