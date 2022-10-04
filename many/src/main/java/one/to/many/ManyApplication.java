package one.to.many;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyApplication.class, args);
	}

}
