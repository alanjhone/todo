/**
 * 
 */
package br.com.dev.todo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Alan Jhone
 *
 */

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_TASK")
	@SequenceGenerator(name="SEQ_TASK", sequenceName="public.id_seq_task", allocationSize=1)
	private int id;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(columnDefinition = "boolean default false")
	private boolean status;
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}


	
}
