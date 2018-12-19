/**
 * 
 */
package br.com.dev.todo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.dev.todo.domain.Task;
import br.com.dev.todo.repository.TaskRepository;

/**
 * @author Alan Jhone
 *
 */

@Service @Transactional
public class TaskService{

	@Autowired
	private TaskRepository taskRepository;

	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	public Task findById(int id) {
		return taskRepository.findById(id);
	}
	
	@Transactional
	public void save(Task task) {
		taskRepository.save(task);
	}

	@Transactional
	public void delete(Task task) {
		taskRepository.delete(task);
	}
	
}
