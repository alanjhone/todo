/**
 * 
 */
package br.com.dev.todo.controllersTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.dev.todo.ApplicationTests;
import br.com.dev.todo.controllers.TaskMBean;
import br.com.dev.todo.domain.Task;
import br.com.dev.todo.repository.TaskRepository;
import junit.framework.Assert;

/**
 * @author Alan Jhone
 *
 */


public class TaskMBeanTest extends ApplicationTests{
	
	@Autowired
	private TaskMBean taskMBean;
	
	@Autowired
	private TaskRepository taskRepository;	
	
	@Test
	public void testChangeStatus(){
		Task task = new Task();
		task.setDescription("Test Status");
		task.setStatus(false);
		
		taskMBean.changeStatus(task);
		
		task = taskRepository.findById(task.getId());
		
		Assert.assertEquals("Ok", true, task.isStatus());
	}
	
}
