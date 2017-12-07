package sessionbeans.blogueur;

import java.util.List;

import javax.ejb.Local;

import persistence.Blogueur;

@Local
public interface BlogueurBeanLocal {

	
	void addBlogger(Blogueur blogueur);

	void updateBlogger(Blogueur blogueur);

	void deleteBlogger(Blogueur blogueur);
	
	Blogueur getBloggerById(int id);

	List<Blogueur> getAllBloggers();

	Blogueur authentification(String login, String pwd);

}
