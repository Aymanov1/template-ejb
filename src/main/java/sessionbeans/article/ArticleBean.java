package sessionbeans.article;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.Article;
import persistence.Blogueur;

/**
 * Session Bean implementation class ArticleBean
 */
@Stateless
@LocalBean
public class ArticleBean implements ArticleBeanLocal {

    /**
     * Default constructor. 
     */
    public ArticleBean() {
    }
    
    @PersistenceContext
   	EntityManager entityManager;

   	

   	@Override
   	public void addArticle(Article article) {
   		entityManager.persist(article);
   		entityManager.flush();
   	}

   	@Override
   	public void updateArticle(Article article) {
   		entityManager.merge(article);
   		entityManager.flush();
   	}

   	@Override
   	public void deleteArticle(Article article) {
   		entityManager.remove(entityManager.merge(article));
   	}

   	@Override
   	public Article getArticleById(int id) {
   		return entityManager.find(Article.class, id);
   	}

   	@SuppressWarnings("unchecked")
   	@Override
	public List<Article> getAllArticles() {
   		try {
   			Query query = entityManager.createQuery("select b from Article b");
   			return query.getResultList();
   		} catch (Exception exception) {
   			exception.printStackTrace();
   			return null;
   		}

   	}
   	
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> findAllArticlesByBlogger(Blogueur blogueur) {
		Query query=entityManager.createQuery("select a from Article a where a.blogueur=:e");
		query.setParameter("e", blogueur);
		return query.getResultList();
	}
	
	

}
