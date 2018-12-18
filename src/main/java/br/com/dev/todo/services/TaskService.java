/**
 * 
 */
package br.com.dev.todo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.dev.todo.dao.TaskDao;
import br.com.dev.todo.domain.Task;

/**
 * @author Alan Jhone
 *
 */

@Component @Transactional
public class TaskService  extends GenericService<Task>{

	@Autowired
	private TaskDao taskDao;

	public List<Task> findAll() {
		return taskDao.listar();
	}

	public Task findById(Integer id) {
		return taskDao.buscar(id, Task.class);
	}
	
	@Transactional
	public void save(Task task) {
		taskDao.salvarOuAtualizar(task);
	}

	@Transactional
	public void delete(Task task) {
		taskDao.remover(task);
	}
	
}
