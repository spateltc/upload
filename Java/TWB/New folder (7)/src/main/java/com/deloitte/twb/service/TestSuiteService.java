package com.deloitte.twb.service;

import java.math.BigDecimal;

import com.deloitte.twb.bean.TestSuiteBean;

public interface TestSuiteService {
	public BigDecimal addTestSuite(TestSuiteBean testSuiteBean) throws Exception;
}
