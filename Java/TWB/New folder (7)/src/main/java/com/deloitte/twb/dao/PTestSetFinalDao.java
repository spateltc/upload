package com.deloitte.twb.dao;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.TestSuiteBean;
/**
 * 	Author: Shasahank
 *	Description: DAO Service  to Fetch the Result Set Related to BarChart
 */
public interface PTestSetFinalDao {
	
	List getItemList(String planName,String testType1) throws Exception ;

}
