package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * The persistent class for the COLORS_TEST_CASES_STATUS database table.
 * 
 */
@Entity
@Table(name="COLORS_TEST_CASES_STATUS")
//@NamedQuery(name="ColorsTestCasesStatus.findAll", query="SELECT c FROM ColorsTestCasesStatus c")
public class ColorsTestCasesStatus implements Serializable {
	@Override
	public String toString() {
		return "ColorsTestCasesStatus [id=" + id + ", color=" + color
				+ ", status=" + status + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	private long id;
	
	@Column(name="COLOR")
	private String color;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="STATUS")
	private String status;

	public ColorsTestCasesStatus() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}