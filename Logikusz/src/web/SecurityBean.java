package web;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import model.Teacher;

/**
 * Session Bean implementation class SecurityBean
 */
@Named
@RequestScoped
public class SecurityBean {

	public String getUserName() {
		ExternalContext ectx = FacesContext.getCurrentInstance()
				.getExternalContext();

		if (ectx.getUserPrincipal() == null) {
			return null;
		}
		return ectx.getUserPrincipal().getName();
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		return "login.xhtml";
	}

	public boolean isDirector() {
		ExternalContext ectx = FacesContext.getCurrentInstance()
				.getExternalContext();
		return ectx.isUserInRole(Teacher.DIRECTOR_ROLE);
	}
}
