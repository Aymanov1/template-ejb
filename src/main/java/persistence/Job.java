package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Job implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idJob;
	private int breakTime;
	private int slotsJob;
	private String positionJob;
	private String descriptionJob;
	private String periodEmployment;
	private String employmentPeriodDetail;
	private String trialPeriod;
	private String typeWork;
	private String officeHourWork;
	private String submitAddress;
	private String documentToSubmit;
	private String screeningMethod;
	private String submitMethod;
	private String screeningDate;
	private String screeningPlace;
	private String notificationContactMethod;
	private String introducingInforming;
	private String interviewDecisionPeriod;
	private String companyDescriptionAgent;
	private String officeHourTypeDetail;
	private String commutingAllowance;
	private String commutingAllowanceNote;
	private boolean approved = false;
	private boolean submitted = false;
	private boolean opened = false;
	private boolean invalid = false;
	private boolean publicStatus = false;
	private boolean agentService = false;
	private boolean hidden = false;
	private boolean rejected = false;
	private long offerCount = 0;
	private long appliedCount = 0;
	private long matchedCount = 0;
	private Date startDateJob;
	private Date endDateJob;
	private Date StartDateApplication;
	private Date endDateApplication;
	private Date creationDate;
	private Company company;

	@Id
	@SequenceGenerator(name = "jobSeq", sequenceName = "job_idjob_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jobSeq")
	public int getIdJob() {
		return idJob;
	}

	public void setIdJob(int idJob) {
		this.idJob = idJob;
	}

	public int getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(int breakTime) {
		this.breakTime = breakTime;
	}

	public int getSlotsJob() {
		return slotsJob;
	}

	public void setSlotsJob(int slotsJob) {
		this.slotsJob = slotsJob;
	}

	public String getPositionJob() {
		return positionJob;
	}

	public void setPositionJob(String positionJob) {
		this.positionJob = positionJob;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getDescriptionJob() {
		return descriptionJob;
	}

	public void setDescriptionJob(String descriptionJob) {
		this.descriptionJob = descriptionJob;
	}

	public String getPeriodEmployment() {
		return periodEmployment;
	}

	public void setPeriodEmployment(String periodEmployment) {
		this.periodEmployment = periodEmployment;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getEmploymentPeriodDetail() {
		return employmentPeriodDetail;
	}

	public void setEmploymentPeriodDetail(String employmentPeriodDetail) {
		this.employmentPeriodDetail = employmentPeriodDetail;
	}

	public String getTrialPeriod() {
		return trialPeriod;
	}

	public void setTrialPeriod(String trialPeriod) {
		this.trialPeriod = trialPeriod;
	}

	public String getTypeWork() {
		return typeWork;
	}

	public void setTypeWork(String typeWork) {
		this.typeWork = typeWork;
	}

	public String getOfficeHourWork() {
		return officeHourWork;
	}

	public void setOfficeHourWork(String officeHourWork) {
		this.officeHourWork = officeHourWork;
	}

	public String getSubmitAddress() {
		return submitAddress;
	}

	public void setSubmitAddress(String submitAddress) {
		this.submitAddress = submitAddress;
	}

	public String getDocumentToSubmit() {
		return documentToSubmit;
	}

	public void setDocumentToSubmit(String documentToSubmit) {
		this.documentToSubmit = documentToSubmit;
	}

	public String getScreeningMethod() {
		return screeningMethod;
	}

	public void setScreeningMethod(String screeningMethod) {
		this.screeningMethod = screeningMethod;
	}

	public String getScreeningDate() {
		return screeningDate;
	}

	public void setScreeningDate(String screeningDate) {
		this.screeningDate = screeningDate;
	}

	public String getScreeningPlace() {
		return screeningPlace;
	}

	public void setScreeningPlace(String screeningPlace) {
		this.screeningPlace = screeningPlace;
	}

	public String getNotificationContactMethod() {
		return notificationContactMethod;
	}

	public void setNotificationContactMethod(String notificationContactMethod) {
		this.notificationContactMethod = notificationContactMethod;
	}

	public String getIntroducingInforming() {
		return introducingInforming;
	}

	public void setIntroducingInforming(String introducingInforming) {
		this.introducingInforming = introducingInforming;
	}

	public String getInterviewDecisionPeriod() {
		return interviewDecisionPeriod;
	}

	public void setInterviewDecisionPeriod(String interviewDecisionPeriod) {
		this.interviewDecisionPeriod = interviewDecisionPeriod;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getCompanyDescriptionAgent() {
		return companyDescriptionAgent;
	}

	public void setCompanyDescriptionAgent(String companyDescriptionAgent) {
		this.companyDescriptionAgent = companyDescriptionAgent;
	}

	@Column(columnDefinition = "varchar(2048)")
	public String getOfficeHourTypeDetail() {
		return officeHourTypeDetail;
	}

	public void setOfficeHourTypeDetail(String officeHourTypeDetail) {
		this.officeHourTypeDetail = officeHourTypeDetail;
	}

	public String getCommutingAllowance() {
		return commutingAllowance;
	}

	public void setCommutingAllowance(String commutingAllowance) {
		this.commutingAllowance = commutingAllowance;
	}

	public String getCommutingAllowanceNote() {
		return commutingAllowanceNote;
	}

	public void setCommutingAllowanceNote(String commutingAllowanceNote) {
		this.commutingAllowanceNote = commutingAllowanceNote;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isSubmitted() {
		return submitted;
	}

	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public boolean isInvalid() {
		return invalid;
	}

	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}

	public boolean isPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(boolean publicStatus) {
		this.publicStatus = publicStatus;
	}

	public boolean isAgentService() {
		return agentService;
	}

	public void setAgentService(boolean agentService) {
		this.agentService = agentService;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	@Temporal(TemporalType.DATE)
	public Date getStartDateJob() {
		return startDateJob;
	}

	public void setStartDateJob(Date startDateJob) {
		this.startDateJob = startDateJob;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndDateJob() {
		return endDateJob;
	}

	public void setEndDateJob(Date endDateJob) {
		this.endDateJob = endDateJob;
	}

	@Temporal(TemporalType.DATE)
	public Date getStartDateApplication() {
		return StartDateApplication;
	}

	public void setStartDateApplication(Date startDateApplication) {
		StartDateApplication = startDateApplication;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndDateApplication() {
		return endDateApplication;
	}

	public void setEndDateApplication(Date endDateApplication) {
		this.endDateApplication = endDateApplication;
	}

	@ManyToOne
	@JoinColumn(name = "idCompany", referencedColumnName = "idUserInformation")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public long getOfferCount() {
		return offerCount;
	}

	public void setOfferCount(long offerCount) {
		this.offerCount = offerCount;
	}

	public long getAppliedCount() {
		return appliedCount;
	}

	public void setAppliedCount(long appliedCount) {
		this.appliedCount = appliedCount;
	}

	public long getMatchedCount() {
		return matchedCount;
	}

	public void setMatchedCount(long matchedCount) {
		this.matchedCount = matchedCount;
	}

	public boolean isRejected() {
		return rejected;
	}

	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getSubmitMethod() {
		return submitMethod;
	}

	public void setSubmitMethod(String submitMethod) {
		this.submitMethod = submitMethod;
	}

}