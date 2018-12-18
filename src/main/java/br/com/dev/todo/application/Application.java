/**
 * 
 */
package br.com.dev.todo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.dev.todo.domain.Task;
import br.com.dev.todo.services.TaskService;

/**
 * @author Alan Jhone
 *
 */

@SpringBootApplication
@EntityScan(basePackages = { "br.com.dev.todo.domain" })
@ComponentScan(basePackages = {"br.com.dev.todo.controllers"})
@EnableJpaRepositories     
@ConfigurationProperties("application.properties")
public class Application extends SpringBootServletInitializer{
      public static void main(String[] args) {
    	  
    	    Task t = new Task();
    	    t.setDescription("sdsfsdfsdf");
    	    
    	    
    	    TaskService s = new TaskService();
    	    
    	    try {
				s.salvarOuAtualizar(t);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  
            SpringApplication.run(Application.class, args);
   
      }
}
