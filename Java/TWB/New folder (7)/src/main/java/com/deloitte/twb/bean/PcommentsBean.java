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
@Table(name="P_COMMENTS")
@NamedQuery(name="PcommentsBean.findAll", query="SELECT p FROM PcommentsBean p")
public class PcommentsBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@JsonProperty("ID")
	private long id;

	
	
	@Column(name="TASK_NAME")
	private String taskName;

	
	@JsonProperty("PLAN_NAME")
	@Column(name="PLAN_NAME")
	private String planName;
	
	

	@JsonProperty("COMMENTS")
	@Column(name="COMMENTS")
	private String comments;
	
	@JsonProperty("USER_NAME")
	@Column(name="USER_NAME")
	private String userName;
	
	
	@JsonProperty("CREATED_ON")
	@Column(name="CREATED_ON")
	private Date createdOn;
	
	
	@Override
	public String toString() {
		return "PcommentsBean [id=" + id + ", taskName=" + taskName
				+ ", planName=" + planName + ", comments=" + comments
				+ ", userName=" + userName + ", createdOn=" + createdOn
				+ ", item1=" + item1 + ", testType=" + testType + ", source="
				+ source + ", taskId=" + taskId + "]";
	}

	@Column(name="ITEM_1")
	private String item1;
	
	
	
	@JsonProperty("TEST_TYPE")
	@Column(name="TEST_TYPE")
	private String testType;
	
	
	@JsonProperty("SOURCE")
	@Column(name="SOURCE")
	private String source;
	
	
	@Column(name="TASK_ID")
	private long taskId;
	    
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public PcommentsBean() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

}