package com.deloitte.twb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.TestStepsBean;
import com.deloitte.twb.dao.TestStepsDAO;
import com.deloitte.twb.service.TestStepService;

@Service
public class TestStepServiceImpl implements TestStepService {

	@Autowired
	TestStepsDAO testStepsDAO;

	@Override
	public void addTestSteps(TestStepsBean testStepsBean) throws Exception {
		// TODO Auto-generated method stub
		testStepsDAO.addTestSteps(testStepsBean);
	}

}
