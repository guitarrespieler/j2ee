package dal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Student;

@Stateless
public class StudentFacade extends AbstractFacade<Student>{

	@PersistenceContext
	private EntityManager em;
	
	public StudentFacade() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
