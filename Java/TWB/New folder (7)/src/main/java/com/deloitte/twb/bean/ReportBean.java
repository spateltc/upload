package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import org.codehaus.jackson.schema.JsonSerializableSchema;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

/**
 * The Class Related To The Web Table
 * 
 */
@Entity
@JsonPropertyOrder({ "planDescription", "planned", "executed",
		"executedPercentage", "passed", "passedPercentage", "failed",
		"failedPercentage", "blocked", "blockedPercentage", "untested",
		"untestedPercentage" })
public class ReportBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/*
	 * @Id private long id;
	 */
	@JsonProperty("Total")
	private long total;

	@JsonGetter("Total")
	public long getTotal() {
		return total;
	}
	
	@JsonSetter("Total")
	public void setTotal(long total) {
		this.total = total;
	}

	@JsonProperty("Test Set")
	private String planDescription;

	@JsonProperty("Planned Count")
	private long planned;

	@JsonProperty("Executed Count")
	private long executed;

	@JsonProperty("Failed Count")
	private long failed;

	@JsonProperty("Passed Count")
	private long passed;

	@JsonProperty("Blocked Count")
	private long blocked;

	@JsonProperty("Untested Count")
	private long untested;

	@JsonProperty("Executed Percent")
	private int executedPercentage;

	@JsonProperty("Failed Percent")
	private int failedPercentage;

	@JsonProperty("Passed Percent")
	private int passedPercentage;

	@JsonProperty("Blocked Percent")
	private int blockedPercentage;

	@JsonProperty("Untested Percent")
	private int untestedPercentage;

	
	@JsonGetter("Test Set")
	public String getPlanDescription() {
		return planDescription;
	}
	@JsonSetter("Test Set")
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	@JsonGetter("Planned Count")
	public long getPlanned() {
		return planned;
	}
	@JsonSetter("Planned Count")
	public void setPlanned(long planned) {
		this.planned = planned;
	}
	@JsonGetter("Executed Count")
	public long getExecuted() {
		return executed;
	}
	@JsonSetter("Executed Count")
	public void setExecuted(long executed) {
		this.executed = executed;
	}
	@JsonGetter("Failed Count")
	public long getFailed() {
		return failed;
	}
	@JsonSetter("Failed Count")
	public void setFailed(long failed) {
		this.failed = failed;
	}
	@JsonGetter("Passed Count")
	public long getPassed() {
		return passed;
	}
	@JsonSetter("Passed Count")
	public void setPassed(long passed) {
		this.passed = passed;
	}
	@JsonGetter("Blocked Count")
	public long getBlocked() {
		return blocked;
	}
	@JsonSetter("Blocked Count")
	public void setBlocked(long blocked) {
		this.blocked = blocked;
	}
	@JsonGetter("Untested Count")
	public long getUntested() {
		return untested;
	}
	@JsonSetter("Untested Count")
	public void setUntested(long untested) {
		this.untested = untested;
	}
	
	public ReportBean() {
	}
	@JsonGetter("Executed Percent")
	public int getExecutedPercentage() {
		return executedPercentage;
	}
	@JsonSetter("Executed Percent")
	public void setExecutedPercentage(int executedPercentage) {
		this.executedPercentage = executedPercentage;
	}
	@JsonGetter("Failed Percent")
	public int getFailedPercentage() {
		return failedPercentage;
	}
	@JsonSetter("Failed Percent")
	public void setFailedPercentage(int failedPercentage) {
		this.failedPercentage = failedPercentage;
	}
	@JsonGetter("Passed Percent")
	public int getPassedPercentage() {
		return passedPercentage;
	}
	@JsonSetter("Passed Percent")
	public void setPassedPercentage(int passedPercentage) {
		this.passedPercentage = passedPercentage;
	}
	@JsonGetter("Blocked Percent")
	public int getBlockedPercentage() {
		return blockedPercentage;
	}
	@JsonSetter("Blocked Percent")
	public void setBlockedPercentage(int blockedPercentage) {
		this.blockedPercentage = blockedPercentage;
	}
	@JsonGetter("Untested Percent")
	public int getUntestedPercentage() {
		return untestedPercentage;
	}
	@JsonSetter("Untested Percent")
	public void setUntestedPercentage(int untestedPercentage) {
		this.untestedPercentage = untestedPercentage;
	}

	/*
	 * public long getId() { return this.id; }
	 * 
	 * public void setId(long id) { this.id = id; }
	 */

	

	// @JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility =
	// Visibility.NONE, setterVisibility = Visibility.NONE)
}