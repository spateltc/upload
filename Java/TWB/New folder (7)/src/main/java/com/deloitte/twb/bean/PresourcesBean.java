package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The persistent class for the P_DEFECTS_FINAL database table.
 * 
 */
@Entity
@Table(name="P_RESOURCES")
@NamedQuery(name="PresourcesBean.findAll", query="SELECT p FROM PresourcesBean p")
public class PresourcesBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	
	@JsonProperty("TASK_NAME")
	@Column(name="TASK_NAME")
	private String taskName;
	
	@JsonProperty("USER_NAME")
	@Column(name="USER_NAME")
	private String userName;
	
	
	@JsonProperty("FIRST_NAME")
	@Column(name="FIRST_NAME")
	private String firstName;
	
	
	
	@JsonProperty("LAST_NAME")
	@Column(name="LAST_NAME")
	private String lastName;
	
	@JsonProperty("ROLE")
	@Column(name="ROLE")
	private String role;
	


	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public PresourcesBean() {
	}

	public long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "PresourcesBean [id=" + id + ", taskName=" + taskName
				+ ", userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", role=" + role + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	

}