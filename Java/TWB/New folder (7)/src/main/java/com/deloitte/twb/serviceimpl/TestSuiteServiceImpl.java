package com.deloitte.twb.serviceimpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.TestSuiteBean;
import com.deloitte.twb.dao.TestSuiteDAO;
import com.deloitte.twb.service.TestSuiteService;

@Service
public class TestSuiteServiceImpl implements TestSuiteService {

	@Autowired
	TestSuiteDAO testSuiteDAO;

	@Override
	public BigDecimal addTestSuite(TestSuiteBean testSuiteBean) throws Exception {
		// TODO Auto-generated method stub
		return testSuiteDAO.addTestSuite(testSuiteBean);
	}

}
