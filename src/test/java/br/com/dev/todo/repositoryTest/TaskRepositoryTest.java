/**
 * 
 */
package br.com.dev.todo.repositoryTest;

import org.junit.Test;
import org.ocpsoft.urlbuilder.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.dev.todo.ApplicationTests;
import br.com.dev.todo.domain.Task;
import br.com.dev.todo.repository.TaskRepository;

/**
 * @author Alan Jhone
 *
 */


public class TaskRepositoryTest extends ApplicationTests {

	@Autowired
	private TaskRepository taskRepository;
	
	@Test
	public void testSalvar(){
		Task task = new Task();
		task.setDescription("Tseteeee");
		
		Task t = taskRepository.save(task);
		
		Assert.notNull(t.getId(), "Ok");
		
	}
	
}
