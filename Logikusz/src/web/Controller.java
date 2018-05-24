package web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Named;

import dao.GroupFacade;
import dao.StudentFacade;
import dao.TeacherFacade;
import model.Student;
import model.Teacher;

/**
 * Session Bean implementation class Controller
 */
@Named
@SessionScoped
public class Controller implements Serializable{

    private Teacher currentUser;
    
    private DataModel<Student> students;
    
    private boolean editing = false;
    
    @EJB
    private GroupFacade groupFacade;
    
    @EJB
    private StudentFacade studentFacade;
    
    @EJB
    private TeacherFacade teacherFacade;
    
    
    public void setCurrentUser(Teacher teacher) {
    	currentUser = teacher;
    }
    
    public Teacher getCurrentUser() {
		if(currentUser == null)
			currentUser = new Teacher();
		return currentUser;
	}
    
    public boolean isEditing() {
    	return editing;
    }
    

}
