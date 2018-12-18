/**
 * 
 */
package br.com.dev.todo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dev.todo.dao.GenericDao;

/**
 * @author Alan Jhone
 *
 */

@Component
public class GenericService<T> {

	@Autowired
	private GenericDao dao;
	
	public void salvarOuAtualizar(T obj) throws Exception{
		dao.salvarOuAtualizar(obj);
	}
	
	public void remover(T obj) throws Exception{
		dao.remover(obj);
	}
	
	public T buscar(Integer id, Class<T> classe) {
		return dao.buscar(id, classe);
	}
	
	
}
