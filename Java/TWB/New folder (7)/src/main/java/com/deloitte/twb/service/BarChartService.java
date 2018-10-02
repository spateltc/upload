package com.deloitte.twb.service;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.TestSuiteBean;

public interface BarChartService {
	/**
	 * 	Author: Shasahank
	 *	Description: Service to Fetch the Result Set Related to BarChart
	 *	input:	1.planName, 2.RankNum,3.TestType 
	 *	output:	Details of the BarChart
	 */
	public List<BarChartBean> getBarChartDetails(String planName, String RankNum,String testType) throws Exception;
	/**
	 * 	Author: Shasahank
	 *	Description: Service to get list of Program names
	 */
	public List getProgramNames() throws Exception;
	/**
	 * 	Author: Shasahank
	 *	Description: Service to get Details of Pop Up Bar Chart
	 */
	public List getpopupBarchartDetails(String planName, String testType1,	String component,String cycleName, String status) throws Exception;
	/**
	 * 	Author: Shasahank
	 *	Description: Service to get Details of Pop Up Pie Chart
	 */
	
	public List getpopupPiechartDetails(String planName, String testType1,String cycleName,String status) throws Exception;
	/**
	 * 	Author: Shasahank
	 *	Description: Service to get  SIT_TEST_CASES Details 
	 */
	
	public List getSitTestCaseDetails() throws Exception;
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service to get  Readable Names Details 
	 */
	
	public List<DtwIntegration> getReadableNames(String planName ,String dtwColumnName,String category) throws Exception;
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service to get  Readable Names Details FOR UI  
	 */
	
	public List<DtwIntegration> getReadableNamesForCategory(String planName ) throws Exception;
	
	
	
	
	
}
