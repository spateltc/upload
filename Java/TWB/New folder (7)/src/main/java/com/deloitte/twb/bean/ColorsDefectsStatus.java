package com.deloitte.twb.bean;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="COLORS_DEFECTS_STATUS")
public class ColorsDefectsStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	
	@Column(name="DEFECT_COLOR")
	private String DEFECTCOLOR; 
	
	
	
	
	@Column(name="STATUS")
	private String STATUS; 
	


	public ColorsDefectsStatus() {
	}
	

	@Id
	private long id;

	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDEFECTCOLOR() {
		return DEFECTCOLOR;
	}


	public void setDEFECTCOLOR(String dEFECTCOLOR) {
		DEFECTCOLOR = dEFECTCOLOR;
	}


	public String getSTATUS() {
		return STATUS;
	}


	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}




	
}
