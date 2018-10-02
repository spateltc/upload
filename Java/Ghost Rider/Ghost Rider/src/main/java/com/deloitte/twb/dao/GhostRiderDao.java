package com.deloitte.twb.dao;

import java.util.List;

import com.deloitte.twb.bean.MapBean;



public interface GhostRiderDao{	
	List getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue,String location)  throws Exception;
	List MapLocation() throws Exception;
	List getbotsReport() throws Exception;
	//List<MapBean> getbotsReport();	
}
