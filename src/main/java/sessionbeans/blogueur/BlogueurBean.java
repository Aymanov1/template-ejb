package sessionbeans.blogueur;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.Blogueur;

/**
 * Session Bean implementation class BlogueurBean
 */
@Stateless
@LocalBean
public class BlogueurBean implements BlogueurBeanLocal {

	/**
	 * Default constructor.
	 */
	public BlogueurBean() {

	}

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addBlogger(Blogueur blogueur) {
		entityManager.persist(blogueur);
		entityManager.flush();
	}

	@Override
	public void updateBlogger(Blogueur blogueur) {
		entityManager.merge(blogueur);
		entityManager.flush();
	}

	@Override
	public void deleteBlogger(Blogueur blogueur) {
		entityManager.remove(entityManager.merge(blogueur));
	}

	@Override
	public Blogueur getBloggerById(int id) {
		return entityManager.find(Blogueur.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Blogueur> getAllBloggers() {
		try {
			Query query = entityManager.createQuery("select b from Blogueur b");
			return query.getResultList();
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}

	}

	@Override
	public Blogueur authentification(String login, String pwd) {
		Query query = entityManager.createQuery("select b from Blogueur b where b.login=:l and b.motDePasse=:p");
		query.setParameter("l", login).setParameter("p", pwd);
		Blogueur blogueur = null;
		try {
			blogueur = (Blogueur) query.getSingleResult();
		} catch (Exception e) {
		}

		return blogueur;
	}

}
