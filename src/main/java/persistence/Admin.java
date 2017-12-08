package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8981820252518329985L;
	private int idAdmin;
	private String nameAdmin;
	private String accountName;
	private String passwordAdmin;
	private String emailAdmin;

	@Id
	@SequenceGenerator(name = "adminSeq", sequenceName = "admin_idadmin_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adminSeq")
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNameAdmin() {
		return nameAdmin;
	}

	public void setNameAdmin(String nameAdmin) {
		this.nameAdmin = nameAdmin;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPasswordAdmin() {
		return passwordAdmin;
	}

	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}

	public String getEmailAdmin() {
		return emailAdmin;
	}

	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}

}
