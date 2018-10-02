package com.deloitte.twb.bean;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestInstanceStatusBean {
	@Id 
    @GeneratedValue
    private long id;
	String status;
	long count;
	String color;
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
	public long getCount() {
		return count;
	}
	@Override
	public String toString() {
		return "TestInstanceStatusBean [id=" + id + ", status=" + status
				+ ", count=" + count + ", color=" + color + "]";
	}
	public void setCount(long count) {
		this.count = count;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
			
}
