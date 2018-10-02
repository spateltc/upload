package com.deloitte.twb.service;

import java.math.BigDecimal;

import com.deloitte.twb.bean.TestCaseBean;

public interface TestCaseService {
	public BigDecimal addTestCase(TestCaseBean testCaseBean) throws Exception;
}
