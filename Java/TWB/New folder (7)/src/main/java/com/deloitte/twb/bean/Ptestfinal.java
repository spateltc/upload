package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the P_TEST_INSTANCE_FINAL database table.
 * 
 */

@Entity
@Table(name="P_TEST_FINAL")


public class Ptestfinal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private BigDecimal id;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@Column(name="TEST_ID")
	private BigDecimal Testid;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@Column(name="PARENT_ID")
	private BigDecimal Parentid;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_2")
	private String Item2;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="RISK_RATING")
	private String RiskRating;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_6")
	private String item6;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_3")
	private String item3;
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@Column(name="NAME")
	private String name;
	
	  
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@Column(name="EXECUTION_STATUS")
	private String Execution_Status;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="TEST_TYPE")
	private String testType;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="DESCRIPTION")
	private String description;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_1")
	private String item1;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_4")
	private String item4;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_5")
	private String item5;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_7")
	private String item7;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_8")
	private String item8;
	

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_9")
	private String item9;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_10")
	private String item10;
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="STATUS")
	private String status;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PLAN_NAME")
	private String planName;
	
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="MILESTONE_ID")
	private String milestoneId;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="UPDATED_BY")
	private String UPDATEDBY;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PRIORITY")
	private String priority;
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="CREATED_ON")
	private String createdOn;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="LAST_MODIFIED")
	private String lastModified;
	
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="CREATED_BY")
	private String createdBy;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="TEST_PHASE")
	private String testPhase;
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_START_DATE")
	private Date plannedStartDate;
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_END_DATE")
	private Date plannedEndDate;
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_START_DATE")
	private Date actualStartDate;
	
	
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_END_DATE")
	private Date actualEndDate;
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PROJECT")
	private String project;
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="LEAF_TASKS")
	private String leafTasks;
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="REFS")
	private String refs;
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ESTIMATE")
	private String estimate;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ESTIMATE_FORECAST")
	private String estimateForecast;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="SUITE_ID")
	private String SUITEID;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="INPUT_SOURCE")
	private String inputSource;
	
	
	

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="HIERARCHICAL_PATH")
	private String HIERARCHICALPATH;
	

	public BigDecimal getTestid() {
		return Testid;
	}

	public void setTestid(BigDecimal testid) {
		Testid = testid;
	}

	public BigDecimal getParentid() {
		return Parentid;
	}

	public void setParentid(BigDecimal parentid) {
		Parentid = parentid;
	}

	public String getItem2() {
		return Item2;
	}

	public void setItem2(String item2) {
		Item2 = item2;
	}

	public String getRiskRating() {
		return RiskRating;
	}

	public void setRiskRating(String riskRating) {
		RiskRating = riskRating;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExecution_Status() {
		return Execution_Status;
	}

	public void setExecution_Status(String execution_Status) {
		Execution_Status = execution_Status;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem7() {
		return item7;
	}

	public void setItem7(String item7) {
		this.item7 = item7;
	}

	public String getItem8() {
		return item8;
	}

	public void setItem8(String item8) {
		this.item8 = item8;
	}

	public String getItem9() {
		return item9;
	}

	public void setItem9(String item9) {
		this.item9 = item9;
	}

	public String getItem10() {
		return item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getMilestoneId() {
		return milestoneId;
	}

	public void setMilestoneId(String milestoneId) {
		this.milestoneId = milestoneId;
	}

	public String getUPDATEDBY() {
		return UPDATEDBY;
	}

	public void setUPDATEDBY(String uPDATEDBY) {
		UPDATEDBY = uPDATEDBY;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getTestPhase() {
		return testPhase;
	}

	public void setTestPhase(String testPhase) {
		this.testPhase = testPhase;
	}

	public Date getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public Date getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getLeafTasks() {
		return leafTasks;
	}

	public void setLeafTasks(String leafTasks) {
		this.leafTasks = leafTasks;
	}

	public String getRefs() {
		return refs;
	}

	public void setRefs(String refs) {
		this.refs = refs;
	}

	public String getEstimate() {
		return estimate;
	}

	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}

	public String getEstimateForecast() {
		return estimateForecast;
	}

	public void setEstimateForecast(String estimateForecast) {
		this.estimateForecast = estimateForecast;
	}

	public String getSUITEID() {
		return SUITEID;
	}

	public void setSUITEID(String sUITEID) {
		SUITEID = sUITEID;
	}

	public String getInputSource() {
		return inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	public String getHIERARCHICALPATH() {
		return HIERARCHICALPATH;
	}

	public void setHIERARCHICALPATH(String hIERARCHICALPATH) {
		HIERARCHICALPATH = hIERARCHICALPATH;
	}

	public String getFUNCTIONALITY() {
		return FUNCTIONALITY;
	}

	public void setFUNCTIONALITY(String fUNCTIONALITY) {
		FUNCTIONALITY = fUNCTIONALITY;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="FUNCTIONALITY")
	private String FUNCTIONALITY;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="COMMENTS")
	private String comments;
	
	
	
	
	
	
	
	
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	
	public Ptestfinal() {
	}
	
	

	

	
}