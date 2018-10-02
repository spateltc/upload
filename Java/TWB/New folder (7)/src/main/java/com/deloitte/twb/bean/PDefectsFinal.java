package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


/**
 * The persistent class for the P_DEFECTS_FINAL database table.
 * 
 */
@Entity
@Table(name="P_DEFECTS_FINAL")
@NamedQuery(name="PDefectsFinal.findAll", query="SELECT p FROM PDefectsFinal p")
public class PDefectsFinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_FIX_DATE")
	private Date actualFixDate;

	@Column(name="ASSIGNED_TO")
	private String assignedTo;

	@Column(name="CLOSED_IN_BUILD")
	private String closedInBuild;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSING_DATE")
	private Date closingDate;

	@Column(name="DEFECT_ID")
	private String defectId;

	@Column(name="DEFECT_TYPE")
	private String defectType;

	private String description;

	@Column(name="DETECTED_BY")
	private String detectedBy;

	@Column(name="DETECTED_IN_ENVIRONMENT")
	private String detectedInEnvironment;

	@Temporal(TemporalType.DATE)
	@Column(name="DETECTED_ON_DATE")
	private Date detectedOnDate;

	@Column(name="INPUT_SOURCE")
	private String inputSource;

	@Column(name="ITEM_1")
	private String item1;

	@Column(name="ITEM_10")
	private String item10;

	@Column(name="ITEM_2")
	private String item2;

	@Column(name="ITEM_3")
	private String item3;

	@Column(name="ITEM_4")
	private String item4;

	@Column(name="ITEM_5")
	private String item5;

	@Column(name="ITEM_6")
	private String item6;

	@Column(name="ITEM_7")
	private String item7;

	@Column(name="ITEM_8")
	private String item8;

	@Column(name="ITEM_9")
	private String item9;

	@Column(name="\"LABEL\"")
	private String label;

	private String name;

	@Column(name="PLAN_NAME")
	@JsonProperty("plan_name")
	private String planName;

	private String priority;

	private String project;

	@Column(name="\"RELEASE\"")
	private String release;

	private String resolution;

	@Column(name="ROOT_CAUSE")
	private String rootCause;

	private String severity;
	
	@Column(name="status")
	private String status;

	private String summary;

	@Temporal(TemporalType.DATE)
	@Column(name="TARGET_FIX_DATE")
	private Date targetFixDate;

	@Column(name="TEST_ID_REF")
	private String testIdRef;

	@Column(name="TEST_TYPE")
	private String testType;

	@Column(name="TESTING_TYPE")
	private String testingType;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_ON")
	private Date updatedOn;

	@Transient
	@JsonProperty("p_check")
	private String pCheck;
	@Transient
	@JsonProperty("p_closed_flag")
	private String pClosedFlag;
	
	public PDefectsFinal() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getActualFixDate() {
		return this.actualFixDate;
	}

	public void setActualFixDate(Date actualFixDate) {
		this.actualFixDate = actualFixDate;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getClosedInBuild() {
		return this.closedInBuild;
	}

	public void setClosedInBuild(String closedInBuild) {
		this.closedInBuild = closedInBuild;
	}

	public Date getClosingDate() {
		return this.closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	public String getDefectId() {
		return this.defectId;
	}

	public void setDefectId(String defectId) {
		this.defectId = defectId;
	}

	public String getDefectType() {
		return this.defectType;
	}

	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetectedBy() {
		return this.detectedBy;
	}

	public void setDetectedBy(String detectedBy) {
		this.detectedBy = detectedBy;
	}

	public String getDetectedInEnvironment() {
		return this.detectedInEnvironment;
	}

	public void setDetectedInEnvironment(String detectedInEnvironment) {
		this.detectedInEnvironment = detectedInEnvironment;
	}

	public Date getDetectedOnDate() {
		return this.detectedOnDate;
	}

	public void setDetectedOnDate(Date detectedOnDate) {
		this.detectedOnDate = detectedOnDate;
	}

	public String getInputSource() {
		return this.inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	@Override
	public String toString() {
		return "PDefectsFinal [id=" + id + ", actualFixDate=" + actualFixDate
				+ ", assignedTo=" + assignedTo + ", closedInBuild="
				+ closedInBuild + ", closingDate=" + closingDate
				+ ", defectId=" + defectId + ", defectType=" + defectType
				+ ", description=" + description + ", detectedBy=" + detectedBy
				+ ", detectedInEnvironment=" + detectedInEnvironment
				+ ", detectedOnDate=" + detectedOnDate + ", inputSource="
				+ inputSource + ", item1=" + item1 + ", item10=" + item10
				+ ", item2=" + item2 + ", item3=" + item3 + ", item4=" + item4
				+ ", item5=" + item5 + ", item6=" + item6 + ", item7=" + item7
				+ ", item8=" + item8 + ", item9=" + item9 + ", label=" + label
				+ ", name=" + name + ", planName=" + planName + ", priority="
				+ priority + ", project=" + project + ", release=" + release
				+ ", resolution=" + resolution + ", rootCause=" + rootCause
				+ ", severity=" + severity + ", status=" + status
				+ ", summary=" + summary + ", targetFixDate=" + targetFixDate
				+ ", testIdRef=" + testIdRef + ", testType=" + testType
				+ ", testingType=" + testingType + ", updatedOn=" + updatedOn
				+ ", pCheck=" + pCheck + ", pClosedFlag=" + pClosedFlag + "]";
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem10() {
		return this.item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

	public String getItem2() {
		return this.item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return this.item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return this.item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return this.item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return this.item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getItem7() {
		return this.item7;
	}

	public void setItem7(String item7) {
		this.item7 = item7;
	}

	public String getItem8() {
		return this.item8;
	}

	public void setItem8(String item8) {
		this.item8 = item8;
	}

	public String getItem9() {
		return this.item9;
	}

	public void setItem9(String item9) {
		this.item9 = item9;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getRelease() {
		return this.release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getRootCause() {
		return this.rootCause;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getTargetFixDate() {
		return this.targetFixDate;
	}

	public void setTargetFixDate(Date targetFixDate) {
		this.targetFixDate = targetFixDate;
	}

	public String getTestIdRef() {
		return this.testIdRef;
	}

	public void setTestIdRef(String testIdRef) {
		this.testIdRef = testIdRef;
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getTestingType() {
		return this.testingType;
	}

	public void setTestingType(String testingType) {
		this.testingType = testingType;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getpCheck() {
		return pCheck;
	}

	public void setpCheck(String pCheck) {
		this.pCheck = pCheck;
	}

	public String getpClosedFlag() {
		return pClosedFlag;
	}

	public void setpClosedFlag(String pClosedFlag) {
		this.pClosedFlag = pClosedFlag;
	}

	
}