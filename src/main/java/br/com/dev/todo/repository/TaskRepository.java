/**
 * 
 */
package br.com.dev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.dev.todo.domain.Task;

/**
 * @author anonymous
 *
 */

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

	@Query("SELECT t  FROM Task t WHERE t.id=:id")
	public Task findById(@Param("id") int id);
	
}
