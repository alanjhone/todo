/**
 * 
 */
package br.com.dev.todo.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Alan Jhone
 *
 */

@Repository
public class GenericDao extends HibernateTemplate{

	private static Session session;
	
	public <T> T buscar(int id, Class <T> classe) {
		Session session = getSession();
		return (T) session.get(classe, id);
	}

	public void remover(Object obj) {
		
		Session session = getSession();
		session.clear();
		session.delete(obj);
		session.flush();
	}
	
	public void salvarOuAtualizar(Object obj) {
		Session session = getSession();
		session.clear();
		session.saveOrUpdate(obj);
		session.flush();
		session.clear();
	}


	public Session getSession() {
		if(session == null || !session.isOpen()) 
			session = getSessionFactory().openSession();
		return session;
	}
	
	
	public void startTransaction(){
		getSession().beginTransaction();
	}
	
	public void commitTransaction(){
		getSession().getTransaction().commit();
	}
	
	public void rollbackTransaction(){
		getSession().getTransaction().rollback();
	}
	
}
