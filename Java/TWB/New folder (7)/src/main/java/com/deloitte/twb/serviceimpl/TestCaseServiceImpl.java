package com.deloitte.twb.serviceimpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.TestCaseBean;
import com.deloitte.twb.dao.TestCaseDAO;
import com.deloitte.twb.service.TestCaseService;

@Service
public class TestCaseServiceImpl implements TestCaseService {

	@Autowired
	TestCaseDAO testCaseDAO;

	@Override
	public BigDecimal addTestCase(TestCaseBean testCaseBean)throws Exception {
		// TODO Auto-generated method stub
		return testCaseDAO.addTestCase(testCaseBean);
		
	}

}
