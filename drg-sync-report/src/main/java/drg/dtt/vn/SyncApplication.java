package drg.dtt.vn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan("drg.dtt.vn")
public class SyncApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(SyncApplication.class, args);
	}
}
