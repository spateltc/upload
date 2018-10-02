package com.deloitte.twb.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deloitte.twb.bean.TestStepsBean;
import com.deloitte.twb.service.TestStepService;

@Controller
public class TestStepsController {
	static Logger log = Logger.getLogger(TestStepsController.class.getName());
	@Autowired
	TestStepService testStepService;

	@RequestMapping(value = "/ords/preprod/teststep/", method = RequestMethod.POST)
    @ResponseBody
	public void insertTestStepsInfo(@RequestBody TestStepsBean testStepInfo) {

		log.debug("TestStepsController::insertTestStepsInfo" + testStepInfo);
		try {
			testStepService.addTestSteps(testStepInfo);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("TestStepsController Exception", e);
		}
	}
}
