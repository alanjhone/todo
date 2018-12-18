/**
 * 
 */
package br.com.dev.todo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dev.todo.domain.Task;

/**
 * @author Alan Jhone
 *
 */

@Component
public class TaskDao extends GenericDao{

	@Autowired
	public TaskDao(SessionFactory sf) {
		setSessionFactory(sf);
	}

	public List<Task> listar() {
		String hql = "select t from Task t";
		Query query = getSession().createQuery(hql);
		return  (List<Task>)query.list();
	}
	
}
