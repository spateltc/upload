package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * The persistent class for the P_DEFECTS_FINAL database table.
 * 
 */
@Entity
@Table(name="GHOST_RIDER_LOCATION")
public class QuboBean implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	private long id;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	

		  
		@JsonInclude(JsonInclude.Include.NON_NULL)
		@Transient
		private String Deluxe;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String DigitalSmith;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String Alphonso;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String Mapped;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String LegacyCompanyName;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String Loctaion;
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	public String reportName;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	public String startDateValue;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	public String endDateValue;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	public String location;
	
	


	public String getDeluxe() {
		return Deluxe;
	}



	public void setDeluxe(String deluxe) {
		Deluxe = deluxe;
	}



	public String getDigitalSmith() {
		return DigitalSmith;
	}



	public void setDigitalSmith(String digitalSmith) {
		DigitalSmith = digitalSmith;
	}



	public String getAlphonso() {
		return Alphonso;
	}



	public void setAlphonso(String alphonso) {
		Alphonso = alphonso;
	}



	


	public String getReportName() {
		return reportName;
	}


	public void setReportName(String reportName) {
		this.reportName = reportName;
	}


	public String getStartDateValue() {
		return startDateValue;
	}


	public void setStartDateValue(String startDateValue) {
		this.startDateValue = startDateValue;
	}


	public String getEndDateValue() {
		return endDateValue;
	}


	public void setEndDateValue(String endDateValue) {
		this.endDateValue = endDateValue;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getMapped() {
		return Mapped;
	}



	public void setMapped(String mapped) {
		Mapped = mapped;
	}



	public String getLegacyCompanyName() {
		return LegacyCompanyName;
	}



	public void setLegacyCompanyName(String legacyCompanyName) {
		LegacyCompanyName = legacyCompanyName;
	}



	public String getLoctaion() {
		return Loctaion;
	}



	public void setLoctaion(String loctaion) {
		Loctaion = loctaion;
	}



	public QuboBean() {
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}