package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


/**
 * The persistent class for the P_DEFECTS_FINAL database table.
 * 
 */
@Entity
@Table(name="DTW_INTEGRATION")
public class DtwIntegration implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@Id
	private long id;

	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="PLAN_NAME")
	private String planName;

	@JsonIgnore
	@Column(name="DTW_COLUMN_NAME")
	private String dtwColumnName;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="READABLE_NAME")
	private String readableName;
	
	@JsonIgnore
	@Column(name="CATEGORY")
	private String category;


	
	@Override
	public String toString() {
		return "DtwIntegration [id=" + id + ", planName=" + planName
				+ ", DtwColumnName=" + dtwColumnName + ", readableName="
				+ readableName + ", category=" + category + "]";
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getDtwColumnName() {
		return dtwColumnName;
	}

	public void setDtwColumnName(String dtwColumnName) {
		this.dtwColumnName = dtwColumnName;
	}

	public String getReadableName() {
		return readableName;
	}

	public void setReadableName(String readableName) {
		this.readableName = readableName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public DtwIntegration() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

}