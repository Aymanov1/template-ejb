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
public class PreferredResponsibility implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idPreferredResponsibility;
	private String namePreferredResponsibility;
	private Preference preference;

	@Id
	@SequenceGenerator(name = "preferredResponsibilitySeq", sequenceName = "preferredresponsibility_idpreferredresponsibility_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "preferredResponsibilitySeq")
	public int getIdPreferredResponsibility() {
		return idPreferredResponsibility;
	}

	public void setIdPreferredResponsibility(int idPreferredResponsibility) {
		this.idPreferredResponsibility = idPreferredResponsibility;
	}

	public String getNamePreferredResponsibility() {
		return namePreferredResponsibility;
	}

	public void setNamePreferredResponsibility(
			String namePreferredResponsibility) {
		this.namePreferredResponsibility = namePreferredResponsibility;
	}

	@ManyToOne
	@JoinColumn(name = "idpreference", referencedColumnName = "idPreference")
	public Preference getPreference() {
		return preference;
	}

	public void setPreference(Preference preference) {
		this.preference = preference;
	}

}
