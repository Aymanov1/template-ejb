package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ChatPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idCompany;
	private int idCandidate;
	private int messageDirection;
	private Date messageDate;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCandidate;
		result = prime * result + idCompany;
		result = prime * result + ((messageDate == null) ? 0 : messageDate.hashCode());
		result = prime * result + messageDirection;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatPK other = (ChatPK) obj;
		if (idCandidate != other.idCandidate)
			return false;
		if (idCompany != other.idCompany)
			return false;
		if (messageDate == null) {
			if (other.messageDate != null)
				return false;
		} else if (!messageDate.equals(other.messageDate))
			return false;
		if (messageDirection != other.messageDirection)
			return false;
		return true;
	}

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public int getIdCandidate() {
		return idCandidate;
	}

	public void setIdCandidate(int idCandidate) {
		this.idCandidate = idCandidate;
	}

	public int getMessageDirection() {
		return messageDirection;
	}

	public void setMessageDirection(int messageDirection) {
		this.messageDirection = messageDirection;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

}