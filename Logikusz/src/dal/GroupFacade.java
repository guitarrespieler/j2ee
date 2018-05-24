package dal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Group;

@Stateless
public class GroupFacade extends AbstractFacade<Group> {

	@PersistenceContext
	private EntityManager em;

	public GroupFacade() {
		super(Group.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
