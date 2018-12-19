/**
 * 
 */
package br.com.dev.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Alan Jhone
 *
 */

@SpringBootApplication
@EnableJpaRepositories     
@ConfigurationProperties("application.properties")
public class Application extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
	
      public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
 
      }
}
