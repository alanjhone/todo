/**
 * 
 */
package br.com.dev.todo.helpers;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author Alan Jhone
 *
 */
public class FacesUtils {

	/**
	 * Método para adicionar mensagens de sucesso.
	 * @param msg
	 */
	public static void addMensagemSucesso(String msg){
		FacesMessage fmsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
	}
	
	/**
	 * Método para adicionar mensagens de erro.
	 * @param msg
	 */
	public static void addMensagemErro(String msg){
		FacesMessage fmsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
		FacesContext.getCurrentInstance().addMessage(null, fmsg);
	}
	
}
