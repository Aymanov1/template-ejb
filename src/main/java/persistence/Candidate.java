package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Candidate extends UserInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nameCandidate;
	private String genderCandidate;
	private String addressCandidate;
	private String phoneNumberCandidate;
	private String emailCandidate;
	private String usernameCandidate;
	private String detailsCandidate;
	private String motherTongueCandidate;
	private String pictureURL;
	private String nationalityCandidate;
	private Date birthdayCandidate;
	private Date expiryDate;
	private List<Language> languages;
	private Preference preference;

	public String getNameCandidate() {
		return nameCandidate;
	}

	public void setNameCandidate(String nameCandidate) {
		this.nameCandidate = nameCandidate;
	}

	public String getGenderCandidate() {
		return genderCandidate;
	}

	public void setGenderCandidate(String genderCandidate) {
		this.genderCandidate = genderCandidate;
	}

	public String getAddressCandidate() {
		return addressCandidate;
	}

	public void setAddressCandidate(String addressCandidate) {
		this.addressCandidate = addressCandidate;
	}

	public String getPhoneNumberCandidate() {
		return phoneNumberCandidate;
	}

	public void setPhoneNumberCandidate(String phoneNumberCandidate) {
		this.phoneNumberCandidate = phoneNumberCandidate;
	}

	public String getEmailCandidate() {
		return emailCandidate;
	}

	public void setEmailCandidate(String emailCandidate) {
		this.emailCandidate = emailCandidate;
	}

	public String getUsernameCandidate() {
		return usernameCandidate;
	}

	public void setUsernameCandidate(String usernameCandidate) {
		this.usernameCandidate = usernameCandidate;
	}

	public String getMotherTongueCandidate() {
		return motherTongueCandidate;
	}

	public void setMotherTongueCandidate(String motherTongueCandidate) {
		this.motherTongueCandidate = motherTongueCandidate;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public String getNationalityCandidate() {
		return nationalityCandidate;
	}

	public void setNationalityCandidate(String nationalityCandidate) {
		this.nationalityCandidate = nationalityCandidate;
	}

	@Temporal(TemporalType.DATE)
	public Date getBirthdayCandidate() {
		return birthdayCandidate;
	}

	public void setBirthdayCandidate(Date birthdayCandidate) {
		this.birthdayCandidate = birthdayCandidate;
	}

	@OneToMany(mappedBy = "candidate")
	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;

	}

	@OneToOne
	@JoinColumn(name = "idPreference", referencedColumnName = "idPreference")
	public Preference getPreference() {
		return preference;
	}

	public void setPreference(Preference preference) {
		this.preference = preference;
	}

	@Temporal(TemporalType.DATE)
	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getDetailsCandidate() {
		return detailsCandidate;
	}

	public void setDetailsCandidate(String detailsCandidate) {
		this.detailsCandidate = detailsCandidate;
	}

}
