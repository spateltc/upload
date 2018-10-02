package com.deloitte.twb.dao;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.TestSuiteBean;
/**
 * 	Author: Shasahank
 *	Description: DAO Service  to Fetch the Result Set Related to BarChart
 */
public interface BarChartDao {
	
	List getDistinctItem(String planName,String testType1,String testType2) throws Exception;
	List getProgressionLvalueList(String planName) throws Exception;
	List getRegressionLvalueList(String planName) throws Exception;
	List getautomatedvalueList(String planName) throws Exception;
	List getItemList(String planName,String testType1,String testType2) throws Exception ;
	List componentBarcharDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List requirementBarcharDetails(String planName,String testType1,String testType2,String Item) throws Exception ;
	List testSetbarChartDetails(String planName,String testType1,String testType2,String Item) throws Exception ;

}
