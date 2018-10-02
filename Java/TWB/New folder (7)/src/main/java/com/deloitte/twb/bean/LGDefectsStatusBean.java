package com.deloitte.twb.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class LGDefectsStatusBean {

	@Id
	@GeneratedValue
	private long id;
	@JsonProperty("status")
	String status;
	
	@JsonProperty("P0 Blocker/Emergency")
	long p0Count;
	@JsonProperty("P1 Critical/High")
	long p1Count;
	@JsonProperty("P2 Major/Medium")
	long p2Count;
	
	@JsonProperty("Total")
	long totalCount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getP0Count() {
		return p0Count;
	}

	public void setP0Count(long p0Count) {
		this.p0Count = p0Count;
	}

	public long getP1Count() {
		return p1Count;
	}

	public void setP1Count(long p1Count) {
		this.p1Count = p1Count;
	}

	public long getP2Count() {
		return p2Count;
	}

	public void setP2Count(long p2Count) {
		this.p2Count = p2Count;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "TestInstanceStatusBean [id=" + id + ", status=" + status
				+ ", p0count=" + p0Count + ", p1count=" + p1Count
				+ ", p2Count=" + p2Count + "]";
	}

}
