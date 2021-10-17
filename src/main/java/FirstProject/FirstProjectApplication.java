package FirstProject;

import FirstProject.Repository.Integration_external.ValidateIntegration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
