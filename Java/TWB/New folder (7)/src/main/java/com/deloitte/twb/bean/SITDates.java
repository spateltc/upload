package com.deloitte.twb.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the TASKS_PLANNING database table.
 * 
 */
@Entity
public class SITDates implements Serializable {
	@Override
	public String toString() {
		return "SITDates [id=" + id + ", project=" + project + ", status="
				+ status + ", projectStart=" + projectStart + ", sitStart="
				+ sitStart + ", sitEnd=" + sitEnd + ", deployment="
				+ deployment + "]";
	}
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String project;
	
	private BigDecimal status;
	
	private Date projectStart;

	private Date sitStart;
	private Date sitEnd;
	private Date deployment;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public BigDecimal getStatus() {
		return status;
	}
	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	public Date getProjectStart() {
		return projectStart;
	}
	public void setProjectStart(Date projectStart) {
		this.projectStart = projectStart;
	}
	public Date getSitStart() {
		return sitStart;
	}
	public void setSitStart(Date sitStart) {
		this.sitStart = sitStart;
	}
	public Date getSitEnd() {
		return sitEnd;
	}
	public void setSitEnd(Date sitEnd) {
		this.sitEnd = sitEnd;
	}
	public Date getDeployment() {
		return deployment;
	}
	public void setDeployment(Date deployment) {
		this.deployment = deployment;
	}
	
	
}