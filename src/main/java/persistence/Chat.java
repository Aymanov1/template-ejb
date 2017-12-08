package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ChatPK chatPK;
	private String messageText;
	private Candidate candidate;
	private Company company;
	private boolean readStateByCandidate;
	private boolean readStateByCompany;

	@EmbeddedId
	public ChatPK getChatPK() {
		return chatPK;
	}

	public void setChatPK(ChatPK chatPK) {
		this.chatPK = chatPK;
	}

	@ManyToOne
	@JoinColumn(name = "idCandidate", referencedColumnName = "idUserInformation", insertable = false, updatable = false)
	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@ManyToOne
	@JoinColumn(name = "idCompany", referencedColumnName = "idUserInformation", insertable = false, updatable = false)
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public boolean isReadStateByCandidate() {
		return readStateByCandidate;
	}

	public void setReadStateByCandidate(boolean readStateByCandidate) {
		this.readStateByCandidate = readStateByCandidate;
	}

	public boolean isReadStateByCompany() {
		return readStateByCompany;
	}

	public void setReadStateByCompany(boolean readStateByCompany) {
		this.readStateByCompany = readStateByCompany;
	}

}