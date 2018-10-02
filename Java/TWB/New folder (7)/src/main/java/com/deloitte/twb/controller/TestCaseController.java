package com.deloitte.twb.controller;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deloitte.twb.bean.TestCaseBean;
import com.deloitte.twb.service.TestCaseService;

@Controller
public class TestCaseController {

	static Logger log = Logger.getLogger(TestCaseController.class.getName());
	@Autowired
	TestCaseService testCaseService;

	@RequestMapping(value = "/ords/preprod/testcase/", method = RequestMethod.POST)
	@ResponseBody
	public BigDecimal insertTestCaseInfo(@RequestBody TestCaseBean testCaseInfo) {
		BigDecimal caseInstanceID = new BigDecimal(0);
		log.debug("TestCaseController::insertTestCaseInfo " + testCaseInfo);
		try {
			caseInstanceID = testCaseService.addTestCase(testCaseInfo);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("TestCaseController Exception", e);
		}
		return caseInstanceID;

	}
}
