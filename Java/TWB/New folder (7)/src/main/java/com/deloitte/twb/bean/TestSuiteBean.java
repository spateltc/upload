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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "H_HTDP_TEST_CASES_RESULTS")
public class TestSuiteBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("suite_Instance_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "testSuiteSeqGen")
	@SequenceGenerator(name = "testSuiteSeqGen", sequenceName = "H_HTDP_TEST_CASES_SEQ")
	private BigDecimal id;

	@Column(name = "TEST_PLAN_NAME")
	@JsonProperty("project_release")
	private String testPlanName;

	@Column(name = "ACTUAL_COMPLETE")
	private String actualComplete;

	@Column(name = "ASSIGNED_TO_MANAGER")
	private String assignedToManager;

	@JsonProperty("browser")
	private String browser;

	@Column(name = "BROWSER_VERSION")
	@JsonProperty("browser_version")
	private String browserVersion;

	@Column(name = "CASE_ID")
	private BigDecimal caseId;

	@Column(name = "CLARITY_ID")
	private String clarityId;

	@Column(name = "CREATED_DATE")
	private Timestamp createdDate;

	@Column(name = "CUSTOM_1")
	@JsonProperty("custom_1")
	private String custom1;

	@Column(name = "CUSTOM_2")
	@JsonProperty("custom_2")
	private String custom2;

	@Column(name = "CUSTOM_3")
	@JsonProperty("custom_3")
	private String custom3;

	@Column(name = "DATA_CONFIG_ID")
	private BigDecimal dataConfigId;

	@JsonProperty("device")
	private String device;

	@Column(name = "DEVICE_VERSION")
	@JsonProperty("device_version")
	private String deviceVersion;

	@JsonProperty("environment")
	private String environment;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPECT_COMPLETE")
	private Date expectComplete;

	@Column(name = "HTDP_DEVICE")
	@JsonProperty("device_type")
	private String htdpDevice;

	@Column(name = "MACHINE_NAME")
	@JsonProperty("machine_name")
	private String machineName;

	@Column(name = "OPERATING_SYSTEM")
	@JsonProperty("operating_system")
	private String operatingSystem;

	@Column(name = "OPERATING_SYSTEM_VERSION")
	@JsonProperty("operating_system_version")
	private String operatingSystemVersion;

	@Column(name = "PROGRAM_APPLICATION_NAME")
	@JsonProperty("program_application_name")
	private String programApplicationName;

	@Column(name = "REQUEST_STATUS")
	private String requestStatus;

	@Column(name = "SET_ID")
	private BigDecimal setId;

	private String status;

	/*@Column(name = "TEST_PLAN_NAME")//TARGET_TEST_PLAN_NAME for dev 
	@JsonProperty("target_test_plan_name")
	private String targetTestPlanName;*/

	@Column(name = "TEST_NAME")
	private String testName;

	@Column(name = "TEST_SUITE_NAME")
	@JsonProperty("test_suite_name")
	private String testSuiteName;

	@JsonProperty("tester_name")
	private String tester;

	public TestSuiteBean() {
	}

	public String getActualComplete() {
		return this.actualComplete;
	}

	public void setActualComplete(String actualComplete) {
		this.actualComplete = actualComplete;
	}

	public String getAssignedToManager() {
		return this.assignedToManager;
	}

	public void setAssignedToManager(String assignedToManager) {
		this.assignedToManager = assignedToManager;
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

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public String getClarityId() {
		return this.clarityId;
	}

	public void setClarityId(String clarityId) {
		this.clarityId = clarityId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCustom1() {
		return this.custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}

	public String getCustom2() {
		return this.custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}

	public String getCustom3() {
		return this.custom3;
	}

	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}

	public BigDecimal getDataConfigId() {
		return this.dataConfigId;
	}

	public void setDataConfigId(BigDecimal dataConfigId) {
		this.dataConfigId = dataConfigId;
	}

	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}

	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public Date getExpectComplete() {
		return this.expectComplete;
	}

	public void setExpectComplete(Date expectComplete) {
		this.expectComplete = expectComplete;
	}

	public String getHtdpDevice() {
		return this.htdpDevice;
	}

	public void setHtdpDevice(String htdpDevice) {
		this.htdpDevice = htdpDevice;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public String getOperatingSystemVersion() {
		return this.operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}

	public String getProgramApplicationName() {
		return this.programApplicationName;
	}

	public void setProgramApplicationName(String programApplicationName) {
		this.programApplicationName = programApplicationName;
	}

	public String getRequestStatus() {
		return this.requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public BigDecimal getSetId() {
		return this.setId;
	}

	public void setSetId(BigDecimal setId) {
		this.setId = setId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

/*	public String getTargetTestPlanName() {
		return this.targetTestPlanName;
	}

	public void setTargetTestPlanName(String targetTestPlanName) {
		this.targetTestPlanName = targetTestPlanName;
	}*/

	public String getTestName() {
		return this.testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestSuiteName() {
		return this.testSuiteName;
	}

	public void setTestSuiteName(String testSuiteName) {
		this.testSuiteName = testSuiteName;
	}

	public String getTester() {
		return this.tester;
	}

	public void setTester(String tester) {
		this.tester = tester;
	}

	public String toString() {
		return "TestSuiteBean Information=" + this.testSuiteName + " "
				+ this.tester;
	}

	public String getTestPlanName() {
		return testPlanName;
	}

	public void setTestPlanName(String testPlanName) {
		this.testPlanName = testPlanName;
	}

}
