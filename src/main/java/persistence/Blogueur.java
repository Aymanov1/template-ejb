package persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Blogueur
 *
 */
@Entity
public class Blogueur implements Serializable {

	private int idBlogueur;
	private String login;
	private String motDePasse;
	private int numTel;
	private List<Article> articles;
	private static final long serialVersionUID = 1L;

	public Blogueur() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdBlogueur() {
		return this.idBlogueur;
	}

	public void setIdBlogueur(int idBlogueur) {
		this.idBlogueur = idBlogueur;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getNumTel() {
		return this.numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	@OneToMany(mappedBy = "blogueur")
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
