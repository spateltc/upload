package com.deloitte.twb.dao;

import java.util.List;

/**
 * 	Author: Shasahank
 *	Description: Service  to get Details from TestPlanListDAO  
 */



import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.TestPlanList;

public interface TestPlanListDAO {
	TestPlanList getTestPlanListByPlanName(String planName) throws Exception;

	List<DtwIntegration> getActiveTestPlanListByProgramName()
			throws Exception;
	
	
	List getProgressionLvalueList(String planName) throws Exception;

	List getRegressionLvalueList(String planName) throws Exception;

	List getautomatedvalueList(String planName) throws Exception;
	
	List getSitTestCaseDetails() throws Exception;
	
	 List getSitDefectView() throws Exception;
	
}
