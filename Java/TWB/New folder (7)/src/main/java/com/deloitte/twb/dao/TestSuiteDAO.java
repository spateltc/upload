package com.deloitte.twb.dao;

import java.math.BigDecimal;

import com.deloitte.twb.bean.TestSuiteBean;

public interface TestSuiteDAO {

	BigDecimal addTestSuite(TestSuiteBean testSuiteBean) throws Exception;

}
