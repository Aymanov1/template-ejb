package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Language implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idLanguage;
	private String nameLanguage;
	private int levelLanguage;
	private String certificationLanguage;
	private Candidate candidate;

	@Id
	@SequenceGenerator(name = "languageSeq", sequenceName = "language_idlanguage_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "languageSeq")
	public int getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(int idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getNameLanguage() {
		return nameLanguage;
	}

	public void setNameLanguage(String nameLanguage) {
		this.nameLanguage = nameLanguage;
	}

	public int getLevelLanguage() {
		return levelLanguage;
	}

	public void setLevelLanguage(int levelLanguage) {
		this.levelLanguage = levelLanguage;
	}

	public String getCertificationLanguage() {
		return certificationLanguage;
	}

	public void setCertificationLanguage(String certificationLanguage) {
		this.certificationLanguage = certificationLanguage;
	}

	@ManyToOne
	@JoinColumn(name = "idCandidate", referencedColumnName = "idUserInformation")
	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}
