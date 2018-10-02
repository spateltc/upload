package com.deloitte.twb.dao;

import java.util.List;

import com.deloitte.twb.bean.LGDefectsStatusBean;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.UtilityBean;

public interface PDefectsFinalDAO{
	List<PDefectsFinal> getLaunchGatingDefectsByPlanName(String planName) throws Exception;
	List getAllDefects(String planName) throws Exception;
	List getSitDefectViewAll() throws Exception;
	List<Object[]> getLGDefectsStatusCount(String planName) throws Exception;
	List<Object[]> getAllDefectsStatusCount(String planName) throws Exception;
	List getpriority(String planName) throws Exception;
	List getTotalCount(String planName) throws Exception;
	List getstatusCount(String planName,String Category) throws Exception;
	List getstatusCount(String planName) throws Exception;
	List getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue)  throws Exception;
	List MapLocation()  throws Exception;
	
}
