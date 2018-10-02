package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The persistent class for the P_DEFECTS_FINAL database table.
 * 
 */
@Entity
@Table(name="GHOST_RIDER_LOCATION")
public class MapBean implements Serializable {
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
	private String COLOR;
	
	public String getCOLOR() {
		return COLOR;
	}



	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}
	

	

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private Timestamp TSTAMP;
	
	//@JsonProperty("ADD_TIME_STAMP")
	@Column(name="LATITUDE")
	private java.math.BigDecimal LATITUDE;
	
	
	//@JsonProperty("DELUXE")
	@Column(name="LONGITUDE")
	private java.math.BigDecimal LONGITUDE;
	
	
	

	//@JsonProperty("ALPHANSO")
	@Column(name="LOCATION")
	private String LOCATION;

	
	

	
	public MapBean() {
	}

	



	public Timestamp getTSTAMP() {
		return TSTAMP;
	}



	public void setTSTAMP(Timestamp tSTAMP) {
		

		Timestamp ts = tSTAMP;
		if(tSTAMP!=null){
		Date date = new Date();
		date.setTime(ts.getTime());
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd hh:mm").format(date);
		this.lastExecuted = formattedDate;
		System.out.println("shshank date ----------------------------------------------"+formattedDate);
		}
		TSTAMP = tSTAMP;
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String lastExecuted;



	

	public String getLastExecuted() {
		return lastExecuted;
	}



	public void setLastExecuted(String lastExecuted) {
		this.lastExecuted = lastExecuted;
	}
	



	





	public java.math.BigDecimal getLATITUDE() {
		return LATITUDE;
	}



	public void setLATITUDE(java.math.BigDecimal lATITUDE) {
		LATITUDE = lATITUDE;
	}



	public java.math.BigDecimal getLONGITUDE() {
		return LONGITUDE;
	}



	public void setLONGITUDE(java.math.BigDecimal lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}



	public String getLOCATION() {
		return LOCATION;
	}



	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}