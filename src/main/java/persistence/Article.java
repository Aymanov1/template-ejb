package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity
public class Article implements Serializable {

	private int idArticle;
	private String titre;
	private String contenu;
	private Blogueur blogueur;
	private static final long serialVersionUID = 1L;

	public Article() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@ManyToOne
	@JoinColumn(name = "idBlogueur", referencedColumnName = "idBlogueur")
	public Blogueur getBlogueur() {
		return blogueur;
	}

	public void setBlogueur(Blogueur blogueur) {
		this.blogueur = blogueur;
	}

}
