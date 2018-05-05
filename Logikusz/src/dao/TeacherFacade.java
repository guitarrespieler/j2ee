package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Teacher;

@Stateless
public class TeacherFacade extends AbstractFacade<Teacher> {
	
	@PersistenceContext
	private EntityManager em;

	public TeacherFacade() {
		super(Teacher.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
