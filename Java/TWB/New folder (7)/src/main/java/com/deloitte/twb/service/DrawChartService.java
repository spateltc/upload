package com.deloitte.twb.service;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.PcommentsBean;
import com.deloitte.twb.bean.TestSuiteBean;
/**
 * 	Author: Shasahank
 *	Description: Services to get the WebChart Details and List for All defects
 */
public interface DrawChartService {
	public List drawChart(String planName, String Entity,String Category,String chartType) throws Exception;
	public List<PTestInstanceFinal> distinctStatus(String planName ) throws Exception;
	
	
}
