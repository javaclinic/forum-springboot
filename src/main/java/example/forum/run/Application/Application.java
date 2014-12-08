package example.forum.run.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Spring Boot application
 * 
 * @author nevenc
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("example.forum.jpa")
@EntityScan("example.forum.domain")
@ComponentScan("example.forum.web")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
