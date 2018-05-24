package web;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {

	public static void addInfoMessage(String text){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, text, text);
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
		
	}
}