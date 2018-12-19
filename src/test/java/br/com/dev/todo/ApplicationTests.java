/**
 * 
 */
package br.com.dev.todo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Alan Jhone
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource(locations="classpath:application.properties")
public class ApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	
}
