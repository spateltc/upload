package com.deloitte.twb.service;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.PcommentsBean;
import com.deloitte.twb.bean.TestSuiteBean;
/**
 * 	Author: Shasahank
 *	Description: Services to get the WebChart Details and List for All defects
 */
public interface ReportService {
	public List getReportQuery(String planName, String RankNum,String testType) throws Exception;
	public List getAllDefects(String planName)throws Exception;
	public List  getPopupWebDetails(String planName,String component,String column,String cycleName,String testtype)throws Exception;
	public List getCommentDetails(String planName)throws Exception;
	public List distinctDataForDsr(String planName)throws Exception;
	public void insertUpdateCommentDetails(PcommentsBean pcommentsBean)throws Exception;
	public List getSitDefectViewAll() throws Exception;
	public List getSitDefectView() throws Exception;
}
