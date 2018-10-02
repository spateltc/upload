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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class BarChartBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/*@Column(name = "ACTUAL_DESCRIPTION")
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
	private String urlToTestManagement;*/

	public BarChartBean() {
	}
	

	@Id
	private long id;

	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "BarChartBean [component=" + component + ", passed=" + passed
				+ ", failed=" + failed + ", notcategorized=" + notcategorized
				+ "]";
	}
	@Transient
	private String component;
	
	@Transient
	private String planName;
	
	
	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getComponent() {
		return component;
	}


	public void setComponent(String component) {
		this.component = component;
	}


	



	public long getPassed() {
		return passed;
	}


	public void setPassed(long passed) {
		this.passed = passed;
	}


	public long getFailed() {
		return failed;
	}


	public void setFailed(long failed) {
		this.failed = failed;
	}


	public long getNotcategorized() {
		return notcategorized;
	}


	public void setNotcategorized(long notcategorized) {
		this.notcategorized = notcategorized;
	}

	@Transient
	private long passed;
	
	@Transient
	private long failed;
	
	@Transient
	private long notcategorized;

	
}
