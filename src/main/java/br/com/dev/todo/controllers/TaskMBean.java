/**
 * 
 */
package br.com.dev.todo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dev.todo.domain.Task;
import br.com.dev.todo.services.TaskService;

/**
 * @author Alan Jhone
 *
 */

@Scope(value = "session")
@Component(value = "taskMBean")
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

	
	public String add(){
		
		if((tasks.isEmpty() || !tasks.contains(task)) && task != null && task.getDescription() != ""){
			task.setStatus(false);
			tasks.add(task);
			
			try {
				taskService.salvarOuAtualizar(task);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		task = new Task();
		
		return "";
	}

	public String edit(Task task){
		if(!tasks.isEmpty() && tasks.contains(task)){
			this.task = task; 
		}	
		
		return "";
		
	}
	
	public String remove(Task task){
		if(!tasks.isEmpty() && tasks.contains(task)){
			tasks.remove(task);
		}
		
		return "";
	}
	
	public void active(Task task){
		task.setStatus(false);
	}

	public void completed(Task task){
		task.setStatus(true);
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
	
	public List<Task> listAll(){
		filteredtasks = tasks;
		return filteredtasks;
	}
	
	public List<Task> listActive(){
		filteredtasks.clear();
		for(Task task : tasks){
			if(!task.isStatus())
				filteredtasks.add(task);
		}
		
		return filteredtasks;
	}
	
	public List<Task> listCompleted(){
		filteredtasks.clear();
		for(Task task : tasks){
			if(task.isStatus())
				filteredtasks.add(task);
		}
		
		return filteredtasks;
	}
	
	
	
	
	
}
