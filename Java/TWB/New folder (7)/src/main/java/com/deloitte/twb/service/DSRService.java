package com.deloitte.twb.service;

import java.util.List;

import com.deloitte.twb.bean.AllDefectsStatusBean;
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.LGDefectsStatusBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.SITDates;
import com.deloitte.twb.bean.TestInstanceStatusBean;
import com.deloitte.twb.bean.TestPlanList;


public interface DSRService {
	List<TestInstanceStatusBean> getPieChartData(String planName, String cycleName, String testType) throws Exception;
	List<DtwIntegration> getActiveTestPlanList() throws Exception;
	List<PDefectsFinal> getLaunchGatingDefects(String planName) throws Exception;
	List<PDefectsFinal> getAllDefectsInformationPopup(String planName,String status,String priority,String pCheck,String pClosedFlag) throws Exception;
	List<PDefectsFinal> getLaunchGatingDefectsInformationPopup(String planName,String status,String priority,String pCheck,String pClosedFlag) throws Exception;
	List<SITDates> getSITDatesInfo()  throws Exception;
	List<LGDefectsStatusBean> getLGDefectsStatusCount(String planName) throws Exception;
	List<AllDefectsStatusBean> getAllDefectsStatusCount(String planName) throws Exception;
	List<GhostRiderBean> getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue) throws Exception;
	List<MapBean> MapLocation() throws Exception;	
}
