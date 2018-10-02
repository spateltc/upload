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
@Table(name="DTW_PROGRAMS_LIST")
@NamedQuery(name="DTWPrograms.findAll", query="SELECT p FROM DTWPrograms p")
public class DTWPrograms implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	
	@JsonProperty("plan_name")
	@Column(name="AUTOMATION_DISABLED")
	private String automationDisabled;

	

	@Override
	public String toString() {
		return "DTWPrograms [id=" + id + ", automationDisabled="
				+ automationDisabled + ", automationScope=" + automationScope
				+ ", active=" + active + ", testPlanType=" + testPlanType + "]";
	}

	@JsonProperty("plan_name")
	@Column(name="AUTOMATION_SCOPE")
	private String automationScope;
	
	@JsonProperty("plan_name")
	@Column(name="ACTIVE")
	private String active;

	@JsonProperty("plan_name")
	@Column(name="TEST_PLAN_TYPE")
	private String testPlanType;


	public String getAutomationDisabled() {
		return automationDisabled;
	}

	public void setAutomationDisabled(String automationDisabled) {
		this.automationDisabled = automationDisabled;
	}

	public String getAutomationScope() {
		return automationScope;
	}

	public void setAutomationScope(String automationScope) {
		this.automationScope = automationScope;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getTestPlanType() {
		return testPlanType;
	}

	public void setTestPlanType(String testPlanType) {
		this.testPlanType = testPlanType;
	}

	public DTWPrograms() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

}