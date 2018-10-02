package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the ALM_REQ_MAPPING database table.
 * 
 */
@Entity
@Table(name="ALM_REQ_MAPPING")
@NamedQuery(name="AlmReqMapping.findAll", query="SELECT a FROM AlmReqMapping a")
public class AlmReqMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	
	@Column(name="PLAN_NAME")
	private String planName;
	@Id
	@Column(name="REQ_ID")
	private String reqId;

	@Column(name="TEST_ID")
	private String testId;

	public AlmReqMapping() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "AlmReqMapping [name=" + name + ", planName=" + planName
				+ ", reqId=" + reqId + ", testId=" + testId + "]";
	}

	public String getReqId() {
		return this.reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getTestId() {
		return this.testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

}