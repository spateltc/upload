package com.deloitte.twb.bean;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="COLORS_DEFECT_PRIORITY")
public class ColorsDefectPriority implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	
	@Column(name="DEFECT_COLOR")
	private String defectcolor; 
	
	
	@Column(name="DEFECT_PRIORITY")
	private String defectpriority; 
	


	public ColorsDefectPriority() {
	}
	

	@Id
	private long id;

	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDefectcolor() {
		return defectcolor;
	}


	public void setDefectcolor(String defectcolor) {
		this.defectcolor = defectcolor;
	}


	public String getDefectpriority() {
		return defectpriority;
	}


	public void setDefectpriority(String defectpriority) {
		this.defectpriority = defectpriority;
	}

	
}
