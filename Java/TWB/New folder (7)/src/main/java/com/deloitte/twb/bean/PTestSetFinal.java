package com.deloitte.twb.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the P_TEST_SET_FINAL database table.
 * 
 */
@Entity
@Table(name="P_TEST_SET_FINAL")
@NamedQuery(name="PTestSetFinal.findAll", query="SELECT p FROM PTestSetFinal p")
public class PTestSetFinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_END_DATE")
	private Date actualEndDate;

	@Override
	public String toString() {
		return "PTestSetFinal [actualEndDate=" + actualEndDate
				+ ", actualStartDate=" + actualStartDate + ", almFolder="
				+ almFolder + ", assignedTo=" + assignedTo + ", blockedCount="
				+ blockedCount + ", completedOn=" + completedOn + ", config="
				+ config + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", description=" + description + ", failedCount="
				+ failedCount + ", id=" + id + ", includeAll=" + includeAll
				+ ", inputSource=" + inputSource + ", isCompleted="
				+ isCompleted + ", item1=" + item1 + ", item10=" + item10
				+ ", item2=" + item2 + ", item3=" + item3 + ", item4=" + item4
				+ ", item5=" + item5 + ", item6=" + item6 + ", item7=" + item7
				+ ", item8=" + item8 + ", item9=" + item9 + ", lastModified="
				+ lastModified + ", leafTasks=" + leafTasks + ", milestoneId="
				+ milestoneId + ", name=" + name + ", parentId=" + parentId
				+ ", passedCount=" + passedCount + ", planId=" + planId
				+ ", planName=" + planName + ", plannedEndDate="
				+ plannedEndDate + ", plannedExecDate=" + plannedExecDate
				+ ", priority=" + priority + ", project=" + project
				+ ", retestCount=" + retestCount + ", status=" + status
				+ ", suiteId=" + suiteId + ", testPhase=" + testPhase
				+ ", testSetId=" + testSetId + ", testType=" + testType
				+ ", untestedCount=" + untestedCount + ", url=" + url + "]";
	}

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_START_DATE")
	private Date actualStartDate;

	@Column(name="ALM_FOLDER")
	private String almFolder;

	@Column(name="ASSIGNED_TO")
	private String assignedTo;

	@Column(name="BLOCKED_COUNT")
	private String blockedCount;

	@Column(name="COMPLETED_ON")
	private String completedOn;

	private String config;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private String createdOn;

	private String description;

	@Column(name="FAILED_COUNT")
	private String failedCount;

	private BigDecimal id;

	@Column(name="INCLUDE_ALL")
	private String includeAll;

	@Column(name="INPUT_SOURCE")
	private String inputSource;

	@Column(name="IS_COMPLETED")
	private String isCompleted;

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

	@Column(name="LAST_MODIFIED")
	private String lastModified;

	@Column(name="LEAF_TASKS")
	private String leafTasks;

	@Column(name="MILESTONE_ID")
	private String milestoneId;

	private String name;

	@Column(name="PARENT_ID")
	private BigDecimal parentId;

	@Column(name="PASSED_COUNT")
	private String passedCount;

	@Column(name="PLAN_ID")
	private String planId;

	@Column(name="PLAN_NAME")
	private String planName;

	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_END_DATE")
	private Date plannedEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_EXEC_DATE")
	private Date plannedExecDate;

	private String priority;

	private String project;

	@Column(name="RETEST_COUNT")
	private String retestCount;

	private String status;

	@Column(name="SUITE_ID")
	private String suiteId;

	@Column(name="TEST_PHASE")
	private String testPhase;
	@Id
	@Column(name="TEST_SET_ID")
	private BigDecimal testSetId;

	@Column(name="TEST_TYPE")
	private String testType;

	@Column(name="UNTESTED_COUNT")
	private String untestedCount;

	private String url;

	public PTestSetFinal() {
	}

	public Date getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public Date getActualStartDate() {
		return this.actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public String getAlmFolder() {
		return this.almFolder;
	}

	public void setAlmFolder(String almFolder) {
		this.almFolder = almFolder;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getBlockedCount() {
		return this.blockedCount;
	}

	public void setBlockedCount(String blockedCount) {
		this.blockedCount = blockedCount;
	}

	public String getCompletedOn() {
		return this.completedOn;
	}

	public void setCompletedOn(String completedOn) {
		this.completedOn = completedOn;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
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

	public String getFailedCount() {
		return this.failedCount;
	}

	public void setFailedCount(String failedCount) {
		this.failedCount = failedCount;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getIncludeAll() {
		return this.includeAll;
	}

	public void setIncludeAll(String includeAll) {
		this.includeAll = includeAll;
	}

	public String getInputSource() {
		return this.inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	public String getIsCompleted() {
		return this.isCompleted;
	}

	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
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

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public String getPassedCount() {
		return this.passedCount;
	}

	public void setPassedCount(String passedCount) {
		this.passedCount = passedCount;
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
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

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public Date getPlannedExecDate() {
		return this.plannedExecDate;
	}

	public void setPlannedExecDate(Date plannedExecDate) {
		this.plannedExecDate = plannedExecDate;
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

	public String getRetestCount() {
		return this.retestCount;
	}

	public void setRetestCount(String retestCount) {
		this.retestCount = retestCount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSuiteId() {
		return this.suiteId;
	}

	public void setSuiteId(String suiteId) {
		this.suiteId = suiteId;
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

	public String getUntestedCount() {
		return this.untestedCount;
	}

	public void setUntestedCount(String untestedCount) {
		this.untestedCount = untestedCount;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}