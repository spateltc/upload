package com.deloitte.twb.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The persistent class for the H_HTDP_TEST_DETAILS_RESULTS database table.
 * 
 */
@Entity
@Table(name = "H_HTDP_TEST_DETAILS_RESULTS")
public class TestCaseBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "head_end")
	@JsonProperty("head_end")
	private String headEnd;

	@Column(name = "stb_id")
	@JsonProperty("stb_id")
	private String stbId;

	@Column(name = "box_serial_no")
	@JsonProperty("box_serial_no")
	private String boxSerialNo;

	@Column(name = "box_mac_address")
	@JsonProperty("box_mac_address")
	private String boxMacAddress;

	@Column(name = "box_model_number")
	@JsonProperty("box_model_number")
	private String boxModelNumber;

	@Column(name = "ams_number")
	@JsonProperty("ams_number")
	private String amsNumber;

	@Column(name = "sgui_id")
	@JsonProperty("sgui_id")
	private String sguiId;

	@Column(name = "zodiac_version")
	@JsonProperty("zodiac_version")
	private String zodiacVersion;

	@Column(name = "custom_1")
	@JsonProperty("custom_1")
	private String custom1;

	@Column(name = "custom_2")
	@JsonProperty("custom_2")
	private String custom2;

	@Column(name = "custom_3")
	@JsonProperty("custom_3")
	private String custom3;

	@Column(name = "ASSIGNED_TO")
	private String assignedTo;

	@Column(name = "CHANGE_STATUS")
	private String changeStatus;

	@Column(name = "DATA_CONFIG_ID")
	private BigDecimal dataConfigId;

	@Column(name = "DATE_COMPLETED")
	private String dateCompleted;

	@Column(name = "DETAIL_ID")
	private BigDecimal detailId;

	@Column(name = "HTDP_CASE_INSTANCE_ID")
	@JsonProperty("suite_instance_id")
	private BigDecimal htdpCaseInstanceId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "testCaseSeqGen")
	@SequenceGenerator(name = "testCaseSeqGen", sequenceName = "HTDP_TEST_DETAIL_INSTANCE_ID")
	private BigDecimal id;

	@Column(name = "INSTANCE_ID")
	private BigDecimal instanceId;

	@Column(name = "SKILL_GROUP")
	private String skillGroup;

	private String skills;

	private String status;

	@Column(name = "TEST_CASE_NAME")
	@JsonProperty("test_case_name")
	private String testCaseName;

	@Column(name = "TEST_DATA_ID")
	private BigDecimal testDataId;

	@Column(name = "TEST_ID")
	private String testId;

	@Column(name = "TEST_SET_ID")
	private String testSetId;

	@Column(name = "TEST_STATUS")
	private String testStatus;

	@Column(name = "TEST_TYPE")
	private String testType;

	@Column(name = "TIME_STAMP")
	private Timestamp timeStamp;

	@Column(name = "TWC_ID")
	private BigDecimal twcId;

	public TestCaseBean() {
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getChangeStatus() {
		return this.changeStatus;
	}

	public void setChangeStatus(String changeStatus) {
		this.changeStatus = changeStatus;
	}

	public BigDecimal getDataConfigId() {
		return this.dataConfigId;
	}

	public void setDataConfigId(BigDecimal dataConfigId) {
		this.dataConfigId = dataConfigId;
	}

	public String getDateCompleted() {
		return this.dateCompleted;
	}

	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public BigDecimal getDetailId() {
		return this.detailId;
	}

	public void setDetailId(BigDecimal detailId) {
		this.detailId = detailId;
	}

	public BigDecimal getHtdpCaseInstanceId() {
		return this.htdpCaseInstanceId;
	}

	public void setHtdpCaseInstanceId(BigDecimal htdpCaseInstanceId) {
		this.htdpCaseInstanceId = htdpCaseInstanceId;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(BigDecimal instanceId) {
		this.instanceId = instanceId;
	}

	public String getSkillGroup() {
		return this.skillGroup;
	}

	public void setSkillGroup(String skillGroup) {
		this.skillGroup = skillGroup;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestCaseName() {
		return this.testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public BigDecimal getTestDataId() {
		return this.testDataId;
	}

	public void setTestDataId(BigDecimal testDataId) {
		this.testDataId = testDataId;
	}

	public String getTestId() {
		return this.testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestSetId() {
		return this.testSetId;
	}

	public void setTestSetId(String testSetId) {
		this.testSetId = testSetId;
	}

	public String getTestStatus() {
		return this.testStatus;
	}

	public void setTestStatus(String testStatus) {
		this.testStatus = testStatus;
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public BigDecimal getTwcId() {
		return this.twcId;
	}

	public void setTwcId(BigDecimal twcId) {
		this.twcId = twcId;
	}

	public String getHeadEnd() {
		return headEnd;
	}

	public void setHeadEnd(String headEnd) {
		this.headEnd = headEnd;
	}

	public String getStbId() {
		return stbId;
	}

	public void setStbId(String stbId) {
		this.stbId = stbId;
	}

	public String getBoxSerialNo() {
		return boxSerialNo;
	}

	public void setBoxSerialNo(String boxSerialNo) {
		this.boxSerialNo = boxSerialNo;
	}

	public String getBoxMacAddress() {
		return boxMacAddress;
	}

	public void setBoxMacAddress(String boxMacAddress) {
		this.boxMacAddress = boxMacAddress;
	}

	public String getBoxModelNumber() {
		return boxModelNumber;
	}

	public void setBoxModelNumber(String boxModelNumber) {
		this.boxModelNumber = boxModelNumber;
	}

	public String getAmsNumber() {
		return amsNumber;
	}

	public void setAmsNumber(String amsNumber) {
		this.amsNumber = amsNumber;
	}

	public String getSguiId() {
		return sguiId;
	}

	public void setSguiId(String sguiId) {
		this.sguiId = sguiId;
	}

	public String getZodiacVersion() {
		return zodiacVersion;
	}

	public void setZodiacVersion(String zodiacVersion) {
		this.zodiacVersion = zodiacVersion;
	}

	public String getCustom1() {
		return custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}

	public String getCustom2() {
		return custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}

	public String getCustom3() {
		return custom3;
	}

	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return "TestCaseBean Information: test case name=" + this.testCaseName;
	}

}