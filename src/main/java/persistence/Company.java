package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Company extends UserInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nameCompany;
	private String phoneticsCompany;
	private String addressHeadquarter;
	private String nameMainOffice;
	private String addressMainOffice;
	private String phoneNumberMainOffice;
	private String nameCEO;
	private String industry;
	private String websiteCompany;
	private String logoURL;
	private String descriptionCompany;
	private Date establishmentDate;
	private int capitalCompany;
	private int salesCompany;

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getPhoneticsCompany() {
		return phoneticsCompany;
	}

	public void setPhoneticsCompany(String phoneticsCompany) {
		this.phoneticsCompany = phoneticsCompany;
	}

	public String getAddressHeadquarter() {
		return addressHeadquarter;
	}

	public void setAddressHeadquarter(String addressHeadquarter) {
		this.addressHeadquarter = addressHeadquarter;
	}

	public String getNameMainOffice() {
		return nameMainOffice;
	}

	public void setNameMainOffice(String nameMainOffice) {
		this.nameMainOffice = nameMainOffice;
	}

	public String getAddressMainOffice() {
		return addressMainOffice;
	}

	public void setAddressMainOffice(String addressMainOffice) {
		this.addressMainOffice = addressMainOffice;
	}

	public String getPhoneNumberMainOffice() {
		return phoneNumberMainOffice;
	}

	public void setPhoneNumberMainOffice(String phoneNumberMainOffice) {
		this.phoneNumberMainOffice = phoneNumberMainOffice;
	}

	public String getNameCEO() {
		return nameCEO;
	}

	public void setNameCEO(String nameCEO) {
		this.nameCEO = nameCEO;
	}

	public int getCapitalCompany() {
		return capitalCompany;
	}

	public void setCapitalCompany(int capitalCompany) {
		this.capitalCompany = capitalCompany;
	}

	public int getSalesCompany() {
		return salesCompany;
	}

	public void setSalesCompany(int salesCompany) {
		this.salesCompany = salesCompany;
	}

	public String getWebsiteCompany() {
		return websiteCompany;
	}

	public void setWebsiteCompany(String websiteCompany) {
		this.websiteCompany = websiteCompany;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getDescriptionCompany() {
		return descriptionCompany;
	}

	public void setDescriptionCompany(String descriptionCompany) {
		this.descriptionCompany = descriptionCompany;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstablishmentDate() {
		return establishmentDate;
	}

	public void setEstablishmentDate(Date establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
