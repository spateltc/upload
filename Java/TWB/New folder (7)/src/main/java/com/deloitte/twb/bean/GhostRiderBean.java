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
@Table(name="GHOSTRIDER_REPORT_TABLEDATA")
public class GhostRiderBean implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	private long id;
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}

	//@JsonProperty("REPORT_NAME")
	@Column(name="REPORT_NAME")
	private String REPORTNAME;
	
	//@JsonProperty("ADD_TIME_STAMP")
	@Column(name="ADD_TIME_STAMP")
	private String ADD_TIME_STAMP;
	
	
	//@JsonProperty("DELUXE")
	@Column(name="DELUXE")
	private String DELUXE;
	
	
	
	//@JsonProperty("ALPHANSO")
	@Column(name="ALPHANSO")
	private String ALPHANSO;

	
	//@JsonProperty("DIGITAL_SMITH")
	@Column(name="DIGITAL_SMITH")
	private String DIGITAL_SMITH;
	
	
	//@JsonProperty("MAPPED_ASSETS")
	@Column(name="MAPPED_ASSETS")
	private String MAPPED_ASSETS;
	
	
	//@JsonProperty("DS_DELUXE")
	@Column(name="DS_DELUXE")
	private String DS_DELUXE;
	
	//@JsonProperty("MAPPED_DELUXE")
	@Column(name="MAPPED_DELUXE")
	private String MAPPED_DELUXE;
	
	
	//@JsonProperty("lINK_INTO_DETAILREPORT")
	@Column(name="lINK_INTO_DETAILREPORT")
	private String lINK_INTO_DETAILREPORT;
	
	

	
	
	public GhostRiderBean() {
	}

	

	public String getREPORTNAME() {
		return REPORTNAME;
	}



	public void setREPORTNAME(String rEPORTNAME) {
		REPORTNAME = rEPORTNAME;
	}



	public String getADD_TIME_STAMP() {
		return ADD_TIME_STAMP;
	}

	public void setADD_TIME_STAMP(String aDD_TIME_STAMP) {
		ADD_TIME_STAMP = aDD_TIME_STAMP;
	}

	public String getDELUXE() {
		return DELUXE;
	}

	public void setDELUXE(String dELUXE) {
		DELUXE = dELUXE;
	}

	public String getALPHANSO() {
		return ALPHANSO;
	}

	public void setALPHANSO(String aLPHANSO) {
		ALPHANSO = aLPHANSO;
	}

	public String getDIGITAL_SMITH() {
		return DIGITAL_SMITH;
	}

	public void setDIGITAL_SMITH(String dIGITAL_SMITH) {
		DIGITAL_SMITH = dIGITAL_SMITH;
	}

	public String getMAPPED_ASSETS() {
		return MAPPED_ASSETS;
	}

	public void setMAPPED_ASSETS(String mAPPED_ASSETS) {
		MAPPED_ASSETS = mAPPED_ASSETS;
	}

	public String getDS_DELUXE() {
		return DS_DELUXE;
	}

	public void setDS_DELUXE(String dS_DELUXE) {
		DS_DELUXE = dS_DELUXE;
	}

	public String getMAPPED_DELUXE() {
		return MAPPED_DELUXE;
	}

	public void setMAPPED_DELUXE(String mAPPED_DELUXE) {
		MAPPED_DELUXE = mAPPED_DELUXE;
	}

	public String getlINK_INTO_DETAILREPORT() {
		return lINK_INTO_DETAILREPORT;
	}

	public void setlINK_INTO_DETAILREPORT(String lINK_INTO_DETAILREPORT) {
		this.lINK_INTO_DETAILREPORT = lINK_INTO_DETAILREPORT;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	

}