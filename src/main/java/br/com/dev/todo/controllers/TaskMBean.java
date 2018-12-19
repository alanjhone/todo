/**
 * 
 */
package br.com.dev.todo.controllers;

import static br.com.dev.todo.helpers.FacesUtils.addMensagemErro;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.dev.todo.domain.Task;
import br.com.dev.todo.services.TaskService;

/**
 * @author Alan Jhone
 *
 */

@Scope(value = "session")
@Component(value = "taskMBean")
@ELBeanName(value = "taskMBean")
public class TaskMBean {

	private List<Task> tasks;
	
	private List<Task> filteredtasks;
	
	private Task task;
	
	@Autowired
	private TaskService taskService;
	
	public TaskMBean(){
		tasks = new ArrayList<Task>();
		task = new Task();
		filteredtasks = new ArrayList<Task>();
	}

	@PostConstruct
	public void init(){
		listAll();
	}
	
	public void add(){
		if(task.getDescription() != null && task.getDescription().trim().length() > 0){
			taskService.save(task);
			listAll();
			task = new Task();
		}else{
			addMensagemErro("Por favor, informe a descrição da tarefa.");
		}
	}

	public void edit(Task task){
		this.task = task; 
	}
	
	public void remove(Task task){
		taskService.delete(task);
		listAll();
	}

	/**
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}

	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	/**
	 * @return the task
	 */
	public Task getTask() {
		return task;
	}

	
	
	/**
	 * @return the filteredtasks
	 */
	public List<Task> getFilteredtasks() {
		return filteredtasks;
	}

	/**
	 * @param filteredtasks the filteredtasks to set
	 */
	public void setFilteredtasks(List<Task> filteredtasks) {
		this.filteredtasks = filteredtasks;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(Task task) {
		this.task = task;
	}
	
	public void listAll(){
		tasks = taskService.findAll();
	}
	
	public void listActive(){
		tasks = taskService.findAllActive();
	}
	
	public void listCompleted(){
		tasks = taskService.findAllCompleted(); 
	}
	
	public void changeStatus(Task task) {
		task.setStatus(!task.isStatus());
		taskService.save(task);
	}
	
	
}
