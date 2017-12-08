package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUserInformation;
	private String accountName;
	private String password;
	private Date creationDate;
	private Date lastLogin;
	private Date lastUpdate;
	private boolean verified = false;
	private boolean approved = false;
	private boolean invalid = false;
	private boolean rejected = false;

	@Id
	@SequenceGenerator(name = "userInformationSeq", sequenceName = "userinformation_iduserinformation_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userInformationSeq")
	public int getIdUserInformation() {
		return idUserInformation;
	}

	public void setIdUserInformation(int idUserInformation) {
		this.idUserInformation = idUserInformation;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isInvalid() {
		return invalid;
	}

	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}

	public boolean isRejected() {
		return rejected;
	}

	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}

}
