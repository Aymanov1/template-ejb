package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Preference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idPreference;
	private String majorResponsibilityPreference;
	private String categoryPreference;
	private String systemLanguage;
	private String otherPreference;
	private boolean sendMailNow = false;
	private boolean notifyIfOffered = true;
	private boolean notifyIfMatched = true;
	private boolean notifyIfMessage = true;
	private List<PreferredResponsibility> preferredResponsibilities;

	@Id
	@SequenceGenerator(name = "preferenceSeq", sequenceName = "preference_idpreference_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "preferenceSeq")
	public int getIdPreference() {
		return idPreference;
	}

	public void setIdPreference(int idPreference) {
		this.idPreference = idPreference;
	}

	public String getMajorResponsibilityPreference() {
		return majorResponsibilityPreference;
	}

	public void setMajorResponsibilityPreference(String majorResponsibilityPreference) {
		this.majorResponsibilityPreference = majorResponsibilityPreference;
	}

	public String getCategoryPreference() {
		return categoryPreference;
	}

	public void setCategoryPreference(String categoryPreference) {
		this.categoryPreference = categoryPreference;
	}

	public boolean isNotifyIfOffered() {
		return notifyIfOffered;
	}

	public boolean isSendMailNow() {
		return sendMailNow;
	}

	public void setSendMailNow(boolean sendMailNow) {
		this.sendMailNow = sendMailNow;
	}

	public void setNotifyIfOffered(boolean notifyIfOffered) {
		this.notifyIfOffered = notifyIfOffered;
	}

	public boolean isNotifyIfMatched() {
		return notifyIfMatched;
	}

	public void setNotifyIfMatched(boolean notifyIfMatched) {
		this.notifyIfMatched = notifyIfMatched;
	}

	public boolean isNotifyIfMessage() {
		return notifyIfMessage;
	}

	public void setNotifyIfMessage(boolean notifyIfMessage) {
		this.notifyIfMessage = notifyIfMessage;
	}

	@OneToMany(mappedBy = "preference")
	public List<PreferredResponsibility> getPreferredResponsibilities() {
		return preferredResponsibilities;
	}

	public void setPreferredResponsibilities(List<PreferredResponsibility> preferredResponsibilities) {
		this.preferredResponsibilities = preferredResponsibilities;
	}

	public String getSystemLanguage() {
		return systemLanguage;
	}

	public void setSystemLanguage(String systemLanguage) {
		this.systemLanguage = systemLanguage;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getOtherPreference() {
		return otherPreference;
	}

	public void setOtherPreference(String otherPreference) {
		this.otherPreference = otherPreference;
	}

}
