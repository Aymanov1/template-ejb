package helpers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.Admin;

@Singleton
@Startup
public class DefaultDataGenerator implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * @author Aymanov
	 * 
	 *         Method to check the database when the server is started and generates
	 *         data if empty
	 */
	@PostConstruct
	public void init() {
		// check if shop table is empty
		try {
			System.out.println("checking Admin table");
			Query query = entityManager.createQuery("select count(s.idStaticMessages) from StaticMessages s");
			if (Long.parseLong(query.getSingleResult().toString()) == 0) {
				System.out.println("empty admin table, filling up");
				// creating staticMessages
				Admin admin = new Admin();
				admin.setAccountName("admin");
				admin.setNameAdmin("admin");
				admin.setPasswordAdmin("admin");
				admin.setEmailAdmin("admin@admin.com");

				entityManager.persist(admin);
				entityManager.flush();

				System.out.println("dummy data populated");

			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}