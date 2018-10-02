package com.deloitte.twb.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the TASKS_PLANNING database table.
 * 
 */
@Entity
@Table(name="TASKS_PLANNING")
@NamedQuery(name="TasksPlanning.findAll", query="SELECT t FROM TasksPlanning t")
public class TasksPlanning implements Serializable {
	@Override
	public String toString() {
		return "TasksPlanning [id=" + id + ", actualEndDate=" + actualEndDate
				+ ", actualHours=" + actualHours + ", actualStartDate="
				+ actualStartDate + ", actualsCount=" + actualsCount
				+ ", addBy=" + addBy + ", addTimestamp=" + addTimestamp
				+ ", almFolder=" + almFolder + ", colorId=" + colorId
				+ ", comments=" + comments + ", dependency=" + dependency
				+ ", expected=" + expected + ", inputSource=" + inputSource
				+ ", item1=" + item1 + ", item10=" + item10 + ", item2="
				+ item2 + ", item3=" + item3 + ", item4=" + item4 + ", item5="
				+ item5 + ", item6=" + item6 + ", item7=" + item7 + ", item8="
				+ item8 + ", item9=" + item9 + ", leafTasks=" + leafTasks
				+ ", manualColor=" + manualColor + ", outlineId=" + outlineId
				+ ", parentId=" + parentId + ", percentageComplete="
				+ percentageComplete + ", planCountManual=" + planCountManual
				+ ", planName=" + planName + ", plannedCount=" + plannedCount
				+ ", plannedEndDate=" + plannedEndDate + ", plannedHours="
				+ plannedHours + ", plannedStartDate=" + plannedStartDate
				+ ", project=" + project + ", resourceName=" + resourceName
				+ ", status=" + status + ", task=" + task + ", taskPriority="
				+ taskPriority + ", tasksType=" + tasksType + ", tasksVersion="
				+ tasksVersion + ", testPhase=" + testPhase + ", testType="
				+ testType + ", updateBy=" + updateBy + ", updateTimestamp="
				+ updateTimestamp + ", workFlowDesc=" + workFlowDesc + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_END_DATE")
	private Date actualEndDate;

	@Column(name="ACTUAL_HOURS")
	private BigDecimal actualHours;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_START_DATE")
	private Date actualStartDate;

	@Column(name="ACTUALS_COUNT")
	private BigDecimal actualsCount;

	@Column(name="ADD_BY")
	private String addBy;

	@Column(name="ADD_TIMESTAMP")
	private Timestamp addTimestamp;

	@Column(name="ALM_FOLDER")
	private String almFolder;

	@Column(name="COLOR_ID")
	private BigDecimal colorId;

	private String comments;

	private String dependency;

	private BigDecimal expected;

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

	@Column(name="LEAF_TASKS")
	private String leafTasks;

	@Column(name="MANUAL_COLOR")
	private BigDecimal manualColor;

	@Column(name="OUTLINE_ID")
	private String outlineId;

	@Column(name="PARENT_ID")
	private BigDecimal parentId;

	@Column(name="PERCENTAGE_COMPLETE")
	private BigDecimal percentageComplete;

	@Column(name="PLAN_COUNT_MANUAL")
	private String planCountManual;

	@Column(name="PLAN_NAME")
	private String planName;

	@Column(name="PLANNED_COUNT")
	private BigDecimal plannedCount;

	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_END_DATE")
	private Date plannedEndDate;

	@Column(name="PLANNED_HOURS")
	private BigDecimal plannedHours;

	@Temporal(TemporalType.DATE)
	@Column(name="PLANNED_START_DATE")
	private Date plannedStartDate;

	private String project;

	@Column(name="RESOURCE_NAME")
	private String resourceName;

	private String status;

	private String task;

	@Column(name="TASK_PRIORITY")
	private String taskPriority;

	@Column(name="TASKS_TYPE")
	private String tasksType;

	@Column(name="TASKS_VERSION")
	private BigDecimal tasksVersion;

	@Column(name="TEST_PHASE")
	private String testPhase;

	@Column(name="TEST_TYPE")
	private String testType;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name="WORK_FLOW_DESC")
	private String workFlowDesc;

	public TasksPlanning() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public BigDecimal getActualHours() {
		return this.actualHours;
	}

	public void setActualHours(BigDecimal actualHours) {
		this.actualHours = actualHours;
	}

	public Date getActualStartDate() {
		return this.actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public BigDecimal getActualsCount() {
		return this.actualsCount;
	}

	public void setActualsCount(BigDecimal actualsCount) {
		this.actualsCount = actualsCount;
	}

	public String getAddBy() {
		return this.addBy;
	}

	public void setAddBy(String addBy) {
		this.addBy = addBy;
	}

	public Timestamp getAddTimestamp() {
		return this.addTimestamp;
	}

	public void setAddTimestamp(Timestamp addTimestamp) {
		this.addTimestamp = addTimestamp;
	}

	public String getAlmFolder() {
		return this.almFolder;
	}

	public void setAlmFolder(String almFolder) {
		this.almFolder = almFolder;
	}

	public BigDecimal getColorId() {
		return this.colorId;
	}

	public void setColorId(BigDecimal colorId) {
		this.colorId = colorId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDependency() {
		return this.dependency;
	}

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	public BigDecimal getExpected() {
		return this.expected;
	}

	public void setExpected(BigDecimal expected) {
		this.expected = expected;
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

	public String getLeafTasks() {
		return this.leafTasks;
	}

	public void setLeafTasks(String leafTasks) {
		this.leafTasks = leafTasks;
	}

	public BigDecimal getManualColor() {
		return this.manualColor;
	}

	public void setManualColor(BigDecimal manualColor) {
		this.manualColor = manualColor;
	}

	public String getOutlineId() {
		return this.outlineId;
	}

	public void setOutlineId(String outlineId) {
		this.outlineId = outlineId;
	}

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public BigDecimal getPercentageComplete() {
		return this.percentageComplete;
	}

	public void setPercentageComplete(BigDecimal percentageComplete) {
		this.percentageComplete = percentageComplete;
	}

	public String getPlanCountManual() {
		return this.planCountManual;
	}

	public void setPlanCountManual(String planCountManual) {
		this.planCountManual = planCountManual;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public BigDecimal getPlannedCount() {
		return this.plannedCount;
	}

	public void setPlannedCount(BigDecimal plannedCount) {
		this.plannedCount = plannedCount;
	}

	public Date getPlannedEndDate() {
		return this.plannedEndDate;
	}

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public BigDecimal getPlannedHours() {
		return this.plannedHours;
	}

	public void setPlannedHours(BigDecimal plannedHours) {
		this.plannedHours = plannedHours;
	}

	public Date getPlannedStartDate() {
		return this.plannedStartDate;
	}

	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTaskPriority() {
		return this.taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getTasksType() {
		return this.tasksType;
	}

	public void setTasksType(String tasksType) {
		this.tasksType = tasksType;
	}

	public BigDecimal getTasksVersion() {
		return this.tasksVersion;
	}

	public void setTasksVersion(BigDecimal tasksVersion) {
		this.tasksVersion = tasksVersion;
	}

	public String getTestPhase() {
		return this.testPhase;
	}

	public void setTestPhase(String testPhase) {
		this.testPhase = testPhase;
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getWorkFlowDesc() {
		return this.workFlowDesc;
	}

	public void setWorkFlowDesc(String workFlowDesc) {
		this.workFlowDesc = workFlowDesc;
	}

}