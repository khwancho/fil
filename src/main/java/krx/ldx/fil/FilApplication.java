package krx.ldx.fil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaAuditing
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan
public class FilApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilApplication.class, args);
	}

}
