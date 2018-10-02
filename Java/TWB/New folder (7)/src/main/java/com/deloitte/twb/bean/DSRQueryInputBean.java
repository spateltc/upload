package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The persistent class for the ALM_REQ_MAPPING database table.
 * 
 */
@Entity
public class DSRQueryInputBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	 @Transient
	@JsonProperty("plan_name")
	private String planName;

	 @Transient
	@JsonProperty("rank_num")
	private int rankNumber;

	 @Transient
	@JsonProperty("test_type")
	private String testType;

	 @Transient
	@JsonProperty("cycle_name")
	private String cycleName;
	
	 public DSRQueryInputBean() {
	}



	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getRankNumber() {
		return rankNumber;
	}

	public void setRankNumber(int rankNumber) {
		this.rankNumber = rankNumber;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	

	public String getCycleName() {
		return cycleName;
	}



	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}



	public String toString(){
		return "plan name="+this.planName+" rank number="+this.rankNumber+" test type="+this.testType;
	}
}