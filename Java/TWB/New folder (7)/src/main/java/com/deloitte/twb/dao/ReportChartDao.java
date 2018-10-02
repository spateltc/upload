package com.deloitte.twb.dao;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.TestSuiteBean;

/**
 * 	Author: Shasahank
 *	Description: Dao Services to get the  WebChart Details 
 */

public interface ReportChartDao {

	List getDistinctItem(String planName,String testType1,String testType2) throws Exception;
	List getProgressionLvalueList(String planName) throws Exception;
	List getRegressionLvalueList(String planName) throws Exception;
	List getautomatedvalueList(String planName) throws Exception;
	List getItemList(String planName,String testType1,String testType2) throws Exception ;
	List componentReportDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List requirementReportcharDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List testSetReportDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List unionComponentReportDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List unionRequirementReportcharDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List unionTestSetReportDetails(String planName,String testType1,String testType2,String Item) throws Exception;
}
