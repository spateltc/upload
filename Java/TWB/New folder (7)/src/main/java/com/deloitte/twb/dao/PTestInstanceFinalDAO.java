package com.deloitte.twb.dao;

import java.util.List;
/**
 * 	Author: Shasahank
 *	Description: DAO Services  to Fetch Data from PTestInstanceFinal   
 */
public interface PTestInstanceFinalDAO {
	List getTestInstanceFinalByTestTypeAndPlanName(String testType,String planName) throws Exception;
	List getDistinctItem(String planName,String testType1) throws Exception;
	List componentBarcharDetails(String planName,String testType1,String Item) throws Exception ;
	List requirementBarcharDetails(String planName,String testType1,String Item) throws Exception ;
	List testSetbarChartDetails(String planName,String testType1,String Item) throws Exception ;
	List componentReportDetails(String planName,String testType1,String Item) throws Exception ;
	List unionComponentReportDetails(String planName,String testType1,String Item) throws Exception ;
	List requirementReportcharDetails(String planName,String testType1,String Item) throws Exception ;
	List unionRequirementReportcharDetails(String planName,String testType1,String Item) throws Exception ;
	List testSetReportDetails(String planName,String testType1,String Item) throws Exception ;
	List unionTestSetReportDetails(String planName,String testType1,String Item) throws Exception;
	List getpopupBarchartDetails(String planName, String testType1,	String component,String cycleName, String status) throws Exception;
	List getpopupPiechartDetails(String planName, String testType1,String cycleName,String status) throws Exception;
	
	List getTotalExecutedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype) throws Exception;
	List getTotalFailedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype) throws Exception;
	List getTotalPassedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype) throws Exception;
	List getTotalBlockedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype) throws Exception;
	List getTotalUntestedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype) throws Exception;
	List getExecutedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype) throws Exception;
	List getFailedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype)throws Exception;
	List getPassedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype)throws Exception;
	List getBlockedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype)throws Exception;
	List getUntestedPopupWebDetails(String planName,String component,String column,String cycleName,String testtype)throws Exception;
	List distinctDataForDsr(String planName)throws Exception;	
	List getstatusPassedFailedCount(String planName,String columnName)throws Exception;	
	List distinctStatus(String planName)throws Exception;
	
	
}
