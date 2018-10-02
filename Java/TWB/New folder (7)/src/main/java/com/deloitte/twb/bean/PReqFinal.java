package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the P_REQ_FINAL database table.
 * 
 */
@Entity
@Table(name="P_REQ_FINAL")
@NamedQuery(name="PReqFinal.findAll", query="SELECT p FROM PReqFinal p")
public class PReqFinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTUAL_END_DATE")
	private String actualEndDate;

	@Column(name="ACTUAL_START_DATE")
	private String actualStartDate;

	private String author;

	@Column(name="CREATION_DATE")
	private String creationDate;
	
	
	

	@Override
	public String toString() {
		return "PReqFinal [actualEndDate=" + actualEndDate
				+ ", actualStartDate=" + actualStartDate + ", author=" + author
				+ ", creationDate=" + creationDate + ", creationTime="
				+ creationTime + ", description=" + description + ", id=" + id
				+ ", inputSource=" + inputSource + ", item1=" + item1
				+ ", item10=" + item10 + ", item2=" + item2 + ", item3="
				+ item3 + ", item4=" + item4 + ", item5=" + item5 + ", item6="
				+ item6 + ", item7=" + item7 + ", item8=" + item8 + ", item9="
				+ item9 + ", lastModified=" + lastModified + ", leafTasks="
				+ leafTasks + ", name=" + name + ", parentId=" + parentId
				+ ", planName=" + planName + ", plannedEndDate="
				+ plannedEndDate + ", plannedStartDate=" + plannedStartDate
				+ ", priority=" + priority + ", project=" + project
				+ ", reqId=" + reqId + ", rootId=" + rootId + ", status="
				+ status + ", targetCycle=" + targetCycle + ", targetRelease="
				+ targetRelease + ", testId=" + testId + ", testPhase="
				+ testPhase + ", testingType=" + testingType
				+ ", versionNumber=" + versionNumber + "]";
	}

	@Column(name="CREATION_TIME")
	private String creationTime;

	private String description;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PReqFinalGen")
	@SequenceGenerator(name = "PReqFinalGen", sequenceName = "P_REQ_FINAL_SEQ")
	private BigDecimal id;

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

	@Column(name="LAST_MODIFIED")
	private String lastModified;

	@Column(name="LEAF_TASKS")
	private String leafTasks;
	
	@Column(name="NAME")
	private String name;

	@Column(name="PARENT_ID")
	private String parentId;

	@Column(name="PLAN_NAME")
	private String planName;

	@Column(name="PLANNED_END_DATE")
	private String plannedEndDate;

	@Column(name="PLANNED_START_DATE")
	private String plannedStartDate;

	private String priority;

	private String project;

	@Column(name="REQ_ID")
	private String reqId;

	@Column(name="ROOT_ID")
	private String rootId;

	private String status;

	@Column(name="TARGET_CYCLE")
	private String targetCycle;

	@Column(name="TARGET_RELEASE")
	private String targetRelease;

	@Column(name="TEST_ID")
	private String testId;

	@Column(name="TEST_PHASE")
	private String testPhase;

	@Column(name="TESTING_TYPE")
	private String testingType;

	@Column(name="VERSION_NUMBER")
	private String versionNumber;

	public PReqFinal() {
	}

	public String getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(String actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public String getActualStartDate() {
		return this.actualStartDate;
	}

	public void setActualStartDate(String actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlannedEndDate() {
		return this.plannedEndDate;
	}

	public void setPlannedEndDate(String plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public String getPlannedStartDate() {
		return this.plannedStartDate;
	}

	public void setPlannedStartDate(String plannedStartDate) {
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

	public String getReqId() {
		return this.reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getRootId() {
		return this.rootId;
	}

	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetCycle() {
		return this.targetCycle;
	}

	public void setTargetCycle(String targetCycle) {
		this.targetCycle = targetCycle;
	}

	public String getTargetRelease() {
		return this.targetRelease;
	}

	public void setTargetRelease(String targetRelease) {
		this.targetRelease = targetRelease;
	}

	public String getTestId() {
		return this.testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestPhase() {
		return this.testPhase;
	}

	public void setTestPhase(String testPhase) {
		this.testPhase = testPhase;
	}

	public String getTestingType() {
		return this.testingType;
	}

	public void setTestingType(String testingType) {
		this.testingType = testingType;
	}

	public String getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

}