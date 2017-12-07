package sessionbeans.article;

import java.util.List;

import javax.ejb.Local;

import persistence.Article;
import persistence.Blogueur;

@Local
public interface ArticleBeanLocal {

	void addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(Article article);

	Article getArticleById(int id);

	List<Article> getAllArticles();

	List<Article> findAllArticlesByBlogger(Blogueur blogueur);

}
