package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	
	
	//@JsonProperty("ADD_TIME_STAMP")
	@Column(name="LATITUDE")
	private String LATITUDE;
	
	
	//@JsonProperty("DELUXE")
	@Column(name="LONGITUDE")
	private String LONGITUDE;
	
	
	
	//@JsonProperty("ALPHANSO")
	@Column(name="LOCATI")
	private String LOCATI;

	
	//@JsonProperty("DIGITAL_SMITH")
	@Column(name="COLOR")
	private String COLOR;
	

	
	public MapBean() {
	}

	



	public String getLATITUDE() {
		return LATITUDE;
	}



	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}



	public String getLONGITUDE() {
		return LONGITUDE;
	}



	public void setLONGITUDE(String lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}



	public String getLOCATI() {
		return LOCATI;
	}



	public void setLOCATI(String lOCATI) {
		LOCATI = lOCATI;
	}



	public String getCOLOR() {
		return COLOR;
	}



	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}