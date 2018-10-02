package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the P_DEFECTS_FINAL database table.
 * 
 */
@Entity
@Table(name="GHOSTRIDER_REPORT")
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
	
	@Column(name="LOCATION")
	private String LOCATION;
	
	//@JsonProperty("ADD_TIME_STAMP")
	@Column(name="ADD_TIMESTAMP")
	private String ADD_TIMESTAMP;
	
	
	//@JsonProperty("DELUXE")
	@Column(name="DELUXE")
	private String DELUXE;
	
	//@JsonProperty("DELUXE")
		@Column(name="STATUS_COLOR")
		private String STATUS_COLOR;
		
		//@JsonProperty("DELUXE")
				@Column(name="PLATFORM")
				private String PLATFORM;
				
				//@JsonProperty("DELUXE")
				@Column(name="LEGACY_COMPANY")
				private String LEGACY_COMPANY;
				
				
				@Transient
				private Boolean lastRow = false;
	
	
	
	public Boolean getLastRow() {
					return lastRow;
				}



				public void setLastRow(Boolean lastRow) {
					this.lastRow = lastRow;
				}



	public String getLOCATION() {
					return LOCATION;
				}



				public void setLOCATION(String lOCATION) {
					LOCATION = lOCATION;
				}



				public String getSTATUS_COLOR() {
					return STATUS_COLOR;
				}



				public void setSTATUS_COLOR(String sTATUS_COLOR) {
					STATUS_COLOR = sTATUS_COLOR;
				}



				public String getPLATFORM() {
					return PLATFORM;
				}



				public void setPLATFORM(String pLATFORM) {
					PLATFORM = pLATFORM;
				}



				public String getLEGACY_COMPANY() {
					return LEGACY_COMPANY;
				}



				public void setLEGACY_COMPANY(String lEGACY_COMPANY) {
					LEGACY_COMPANY = lEGACY_COMPANY;
				}

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
	@Column(name="LINK_TO_REPORT")
	private String LINK_TO_REPORT;
	
	

	
	
	public String getLINK_TO_REPORT() {
		return LINK_TO_REPORT;
	}



	public void setLINK_TO_REPORT(String lINK_TO_REPORT) {
		LINK_TO_REPORT = lINK_TO_REPORT;
	}



	public GhostRiderBean() {
	}

	

	public String getREPORTNAME() {
		return REPORTNAME;
	}



	public void setREPORTNAME(String rEPORTNAME) {
		REPORTNAME = rEPORTNAME;
	}



	
	public String getADD_TIMESTAMP() {
		return ADD_TIMESTAMP;
	}



	public void setADD_TIMESTAMP(String aDD_TIMESTAMP) {
		ADD_TIMESTAMP = aDD_TIMESTAMP;
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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}