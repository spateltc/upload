package com.deloitte.twb.dao;

import java.math.BigDecimal;

import com.deloitte.twb.bean.TestCaseBean;

public interface TestCaseDAO {

	BigDecimal addTestCase(TestCaseBean testCaseBean) throws Exception;
	
	/*BigDecimal getbarChartDetails(TestCaseBean testCaseBean) throws Exception;*/
	
}
