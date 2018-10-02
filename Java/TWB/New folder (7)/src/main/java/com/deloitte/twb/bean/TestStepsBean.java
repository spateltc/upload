package com.deloitte.twb.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "H_HTDP_TEST_STEPS")
public class TestStepsBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ACTUAL_DESCRIPTION")
	@JsonProperty("actual_description")
	private String actualDescription;

	@Column(name = "ADD_BY")
	private String addBy;

	@Column(name = "ADD_TIMESTAMP")
	private Timestamp addTimestamp;

	@Column(name = "APPLICATION_NAME")
	@JsonProperty("application_name")
	private String applicationName;

	@Column(name = "ASSIGNED_TO")
	private String assignedTo;

	@JsonProperty("browser")
	private String browser;

	@Column(name = "BROWSER_VERSION")
	@JsonProperty("browser_version")
	private String browserVersion;

	@JsonProperty("component")
	private String component;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_COMPLETED")
	private Date dateCompleted;

	@JsonProperty("environment")
	private String environment;

	@Column(name = "HTDP_CASE_ID")
	private BigDecimal htdpCaseId;

	@Column(name = "HTDP_CASE_INSTANCE_ID")
	@JsonProperty("suite_instance_id")
	private BigDecimal htdpCaseInstanceId;

	@Column(name = "HTDP_DETAIL_ID")
	private BigDecimal htdpDetailId;

	@Column(name = "HTDP_DETAIL_INSTANCE_ID")
	@JsonProperty("case_instance_id")
	private BigDecimal htdpDetailInstanceId;

	@Column(name = "HTDP_DEVICE")
	@JsonProperty("device")
	private String htdpDevice;

	@Column(name = "HTDP_NAME")
	private String htdpName;

	@Column(name = "INSTANCE_ID")
	private BigDecimal instanceId;

	@Column(name = "MACHINE_NAME")
	@JsonProperty("machine_name")
	private String machineName;

	@Column(name = "OPERATING_SYSTEM")
	@JsonProperty("operating_system")
	private String operatingSystem;

	@Column(name = "OPERATING_SYSTEM_VERSION")
	@JsonProperty("operating_system_version")
	private String operatingSystemVersion;

	@Column(name = "SWORD_ATTACHABLE_ID")
	@JsonProperty("sword_attachable_id")
	private String swordAttachableId;

	@Column(name = "STEP_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal stepId;

	@Column(name = "STEP_STATUS")
	@JsonProperty("step_status")
	private String stepStatus;

	@Column(name = "SUBMITTED_RUN_ID")
	private BigDecimal submittedRunId;

	@Column(name = "TEST_CASE_NAME")
	@JsonProperty("test_case_name")
	private String testCaseName;

	@Column(name = "TEST_ID")
	private BigDecimal testId;

	@Column(name = "TEST_SET_ID")
	private BigDecimal testSetId;

	@Column(name = "TEST_TYPE")
	private String testType;

	@Column(name = "TESTER_NAME")
	@JsonProperty("tester_name")
	private String testerName;

	@Column(name = "UPDATE_BY")
	private String updateBy;

	@Column(name = "UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name = "URL_TO_TEST_MANAGEMENT")
	private String urlToTestManagement;

	public TestStepsBean() {
	}

	public String getActualDescription() {
		return this.actualDescription;
	}

	public void setActualDescription(String actualDescription) {
		this.actualDescription = actualDescription;
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

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getBrowser() {
		return this.browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getBrowserVersion() {
		return this.browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public Date getDateCompleted() {
		return this.dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public BigDecimal getHtdpCaseId() {
		return this.htdpCaseId;
	}

	public void setHtdpCaseId(BigDecimal htdpCaseId) {
		this.htdpCaseId = htdpCaseId;
	}

	public BigDecimal getHtdpCaseInstanceId() {
		return this.htdpCaseInstanceId;
	}

	public void setHtdpCaseInstanceId(BigDecimal htdpCaseInstanceId) {
		this.htdpCaseInstanceId = htdpCaseInstanceId;
	}

	public BigDecimal getHtdpDetailId() {
		return this.htdpDetailId;
	}

	public void setHtdpDetailId(BigDecimal htdpDetailId) {
		this.htdpDetailId = htdpDetailId;
	}

	public BigDecimal getHtdpDetailInstanceId() {
		return this.htdpDetailInstanceId;
	}

	public void setHtdpDetailInstanceId(BigDecimal htdpDetailInstanceId) {
		this.htdpDetailInstanceId = htdpDetailInstanceId;
	}

	public String getHtdpDevice() {
		return this.htdpDevice;
	}

	public void setHtdpDevice(String htdpDevice) {
		this.htdpDevice = htdpDevice;
	}

	public String getHtdpName() {
		return this.htdpName;
	}

	public void setHtdpName(String htdpName) {
		this.htdpName = htdpName;
	}

	public BigDecimal getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(BigDecimal instanceId) {
		this.instanceId = instanceId;
	}

	public String getMachineName() {
		return this.machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public BigDecimal getStepId() {
		return this.stepId;
	}

	public void setStepId(BigDecimal stepId) {
		this.stepId = stepId;
	}

	public String getStepStatus() {
		return this.stepStatus;
	}

	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}

	public BigDecimal getSubmittedRunId() {
		return this.submittedRunId;
	}

	public void setSubmittedRunId(BigDecimal submittedRunId) {
		this.submittedRunId = submittedRunId;
	}

	public String getTestCaseName() {
		return this.testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public BigDecimal getTestId() {
		return this.testId;
	}

	public void setTestId(BigDecimal testId) {
		this.testId = testId;
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

	public String getTesterName() {
		return this.testerName;
	}

	public void setTesterName(String testerName) {
		this.testerName = testerName;
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

	public String getUrlToTestManagement() {
		return this.urlToTestManagement;
	}

	public void setUrlToTestManagement(String urlToTestManagement) {
		this.urlToTestManagement = urlToTestManagement;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}

	public String getSwordAttachableId() {
		return swordAttachableId;
	}

	public void setSwordAttachableId(String swordAttachableId) {
		this.swordAttachableId = swordAttachableId;
	}

	public String toString() {
		return "Test Steps ::test case name =" + this.testCaseName;
	}
}
