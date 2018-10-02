package com.deloitte.twb.controller;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deloitte.twb.bean.TestSuiteBean;
import com.deloitte.twb.service.TestSuiteService;

@Controller
public class TestSuiteController {

	static Logger log = Logger.getLogger(TestSuiteController.class.getName());
	@Autowired
	TestSuiteService testSuiteService;

	@RequestMapping(value = "/ords/preprod/suite/", method = RequestMethod.POST)
	@ResponseBody
	public BigDecimal insertTestSuiteInfo(
			@RequestBody TestSuiteBean testSuiteInfo) {
		BigDecimal suiteInstanceID = new BigDecimal(0);
		log.debug("TestSuiteController::insertTestSuiteInfo=" + testSuiteInfo);
		try {
			suiteInstanceID = testSuiteService.addTestSuite(testSuiteInfo);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("TestSuiteController Exception", e);
		}
		return suiteInstanceID;

	}
}
