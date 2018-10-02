package com.deloitte.twb.bean;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class UtilityBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String pieChartLabel;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private long percentage;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private long totalCount;

	public String getComponent() {
		return component;
	}


	public void setComponent(String component) {
		this.component = component;
	}


	public long getPassedCount() {
		return passedCount;
	}


	public void setPassedCount(long passedCount) {
		this.passedCount = passedCount;
	}


	public long getFailedCount() {
		return failedCount;
	}


	public void setFailedCount(long failedCount) {
		this.failedCount = failedCount;
	}


	public long getOthersCount() {
		return OthersCount;
	}


	public void setOthersCount(long othersCount) {
		OthersCount = othersCount;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private long count;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String status;

	
	
	


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String component;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private long passedCount;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private long failedCount;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private long OthersCount;
	
	
	
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String color;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getPieChartLabel() {
		return pieChartLabel;
	}


	public void setPieChartLabel(String pieChartLabel) {
		this.pieChartLabel = pieChartLabel;
	}


	public UtilityBean() {
	}
	

	@Id
	private long id;

	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	
	public long getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}


	public long getCount() {
		return count;
	}


	public void setCount(long count) {
		this.count = count;
	}


	

	public long getPercentage() {
		return percentage;
	}


	public void setPercentage(long percentage) {
		this.percentage = percentage;
	}


	
	


	
}
