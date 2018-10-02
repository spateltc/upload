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
@Table(name="P_TEST_INSTANCE_FINAL")


public class PTestInstanceFinal implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_END_DATE")
	private Date actualEndDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_EXECUTION_DATE")
	private Date actualExecutionDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_START_DATE")
	private Date actualStartDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ASSIGNED_TO")
	private String assignedTo;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="CREATED_BY")
	private String createdBy;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="CREATED_ON")
	private String createdOn;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="DESCRIPTION")
	private String description;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ESTIMATE")
	private String estimate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ESTIMATE_FORECAST")
	private String estimateForecast;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private BigDecimal id;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="INPUT_SOURCE")
	private String inputSource;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="INSTANCE_ID")
	private BigDecimal instanceId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_1")
	private String item1;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_10")
	private String item10;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_2")
	private String item2;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_3")
	private String item3;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_4")
	private String item4;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_5")
	private String item5;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ITEM_6")
	private String item6;
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
	@Column(name="LAST_MODIFIED")
	private String lastModified;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="LEAF_TASKS")
	private String leafTasks;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="MILESTONE_ID")
	private String milestoneId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="NAME")
	private String name;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PLAN_NAME")
	private String planName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_END_DATE")
	private Date plannedEndDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_START_DATE")
	private Date plannedStartDate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PRIORITY")
	private String priority;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PROJECT")
	private String project;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="REFS")
	private String refs;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="RUN_ID")
	private BigDecimal runId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="RUN_TIMESTAMP")
	private Timestamp runTimestamp;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="STATUS")
	private String status;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@Column(name="TEST_ID")
	private BigDecimal testId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="TEST_PHASE")
	private String testPhase;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="TEST_SET_ID")
	private BigDecimal testSetId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="TEST_TYPE")
	private String testType;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="TESTING_TYPE")
	private String testingType;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="COMMENTS")
	private String comments;
	
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public PTestInstanceFinal() {
	}

	public Date getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public Date getActualExecutionDate() {
		return this.actualExecutionDate;
	}

	public void setActualExecutionDate(Date actualExecutionDate) {
		this.actualExecutionDate = actualExecutionDate;
	}

	public Date getActualStartDate() {
		return this.actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEstimate() {
		return this.estimate;
	}

	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}

	public String getEstimateForecast() {
		return this.estimateForecast;
	}

	public void setEstimateForecast(String estimateForecast) {
		this.estimateForecast = estimateForecast;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getInputSource() {
		return this.inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	public BigDecimal getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(BigDecimal instanceId) {
		this.instanceId = instanceId;
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

	public String getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public String getLeafTasks() {
		return this.leafTasks;
	}

	public void setLeafTasks(String leafTasks) {
		this.leafTasks = leafTasks;
	}

	public String getMilestoneId() {
		return this.milestoneId;
	}

	public void setMilestoneId(String milestoneId) {
		this.milestoneId = milestoneId;
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

	public Date getPlannedEndDate() {
		return this.plannedEndDate;
	}

	@Override
	public String toString() {
		return "PTestInstanceFinal [actualEndDate=" + actualEndDate
				+ ", actualExecutionDate=" + actualExecutionDate
				+ ", actualStartDate=" + actualStartDate + ", assignedTo="
				+ assignedTo + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", description=" + description + ", estimate="
				+ estimate + ", estimateForecast=" + estimateForecast + ", id="
				+ id + ", inputSource=" + inputSource + ", instanceId="
				+ instanceId + ", item1=" + item1 + ", item10=" + item10
				+ ", item2=" + item2 + ", item3=" + item3 + ", item4=" + item4
				+ ", item5=" + item5 + ", item6=" + item6 + ", item7=" + item7
				+ ", item8=" + item8 + ", item9=" + item9 + ", lastModified="
				+ lastModified + ", leafTasks=" + leafTasks + ", milestoneId="
				+ milestoneId + ", name=" + name + ", planName=" + planName
				+ ", plannedEndDate=" + plannedEndDate + ", plannedStartDate="
				+ plannedStartDate + ", priority=" + priority + ", project="
				+ project + ", refs=" + refs + ", runId=" + runId
				+ ", runTimestamp=" + runTimestamp + ", status=" + status
				+ ", testId=" + testId + ", testPhase=" + testPhase
				+ ", testSetId=" + testSetId + ", testType=" + testType
				+ ", testingType=" + testingType + "]";
	}

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public Date getPlannedStartDate() {
		return this.plannedStartDate;
	}

	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
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

	public String getRefs() {
		return this.refs;
	}

	public void setRefs(String refs) {
		this.refs = refs;
	}

	public BigDecimal getRunId() {
		return this.runId;
	}

	public void setRunId(BigDecimal runId) {
		this.runId = runId;
	}

	public Timestamp getRunTimestamp() {
		return this.runTimestamp;
	}

	public void setRunTimestamp(Timestamp runTimestamp) {
		this.runTimestamp = runTimestamp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTestId() {
		return this.testId;
	}

	public void setTestId(BigDecimal testId) {
		this.testId = testId;
	}

	public String getTestPhase() {
		return this.testPhase;
	}

	public void setTestPhase(String testPhase) {
		this.testPhase = testPhase;
	}

	public BigDecimal getTestSetId() {
		return this.testSetId;
	}

	public void setTestSetId(BigDecimal testSetId) {
		this.testSetId = testSetId;
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

}