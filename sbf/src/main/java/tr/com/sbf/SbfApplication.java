package tr.com.sbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SbfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbfApplication.class, args);
		System.out.println("sbf uygulaması çalışmaya başladı.");
	}

}
