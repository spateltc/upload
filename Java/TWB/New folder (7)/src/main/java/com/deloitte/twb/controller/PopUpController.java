package com.deloitte.twb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.PcommentsBean;
import com.deloitte.twb.bean.ReportBean;
import com.deloitte.twb.service.BarChartService;
import com.deloitte.twb.service.ReportService;

@Controller
public class PopUpController {

	static Logger log = Logger.getLogger(TestSuiteController.class.getName());
	@Autowired
	ReportService reportService;
	
	@Autowired
	BarChartService barchartService;
	

	/**
	 * Author: Shasahank Description: Method to Fetch the Result Set of
	 * Planned,Executed,Blocked,Failed,Untested Percentage
	 * Input:PlanName,RankNum,testType Output:list of WebChart Details
	 *//*

	@RequestMapping(value = "/ords/preprod/getReportDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getReportQuery(
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "testType", required = false) String testType) {
		List resultList = new ArrayList();
		
		 * List<ReportBean> returningResultList = new<ReportBean> ArrayList();
		 * Object[] totallist = new Object[5]; Object[] totallistObjects = new
		 * Object[6];
		 

		log.debug("ReportController::getReportQuery()");
		try {
			resultList = reportService.getReportQuery(planName, cycleName,
					testType);
			
			 * if (resultList != null) { for (int i = 0; i < resultList.size() -
			 * 1; i++) { totallistObjects = (Object[]) resultList.get(i); String
			 * PlanDescription = (String) totallistObjects[0]; Long Planned =
			 * (Long) totallistObjects[1]; Long Executed = (Long)
			 * totallistObjects[2]; int ExecutedPercentage = (int)
			 * Math.round(Executed * 100.0 / Planned); Long Failed = (Long)
			 * totallistObjects[3]; int FailedPercentage = (int)
			 * Math.round(Failed * 100.0 / Planned); Long Passed = (Long)
			 * totallistObjects[4]; int PassedPercentage = (int)
			 * Math.round(Passed * 100.0 / Planned); Long Blocked = (Long)
			 * totallistObjects[5]; int BlockedPercentage = (int)
			 * Math.round(Blocked * 100.0 / Planned); Long Untested = (Long)
			 * totallistObjects[6]; int UntestedPercentage = (int)
			 * Math.round(Untested * 100.0 / Planned); ReportBean reportBean =
			 * new ReportBean(); reportBean.setPlanDescription(PlanDescription);
			 * reportBean.setPlanned(Planned); reportBean.setExecuted(Executed);
			 * reportBean.setFailed(Failed); reportBean.setPassed(Passed);
			 * reportBean.setBlocked(Blocked); reportBean.setUntested(Untested);
			 * reportBean.setExecutedPercentage(ExecutedPercentage);
			 * reportBean.setFailedPercentage(FailedPercentage);
			 * reportBean.setPassedPercentage(PassedPercentage);
			 * reportBean.setBlockedPercentage(BlockedPercentage);
			 * reportBean.setUntestedPercentage(UntestedPercentage);
			 * returningResultList.add(reportBean); } } if (resultList != null)
			 * { totallist = (Object[]) resultList.get(resultList.size() - 1); }
			 * if (totallist != null) { Long Planned = (Long) totallist[0]; Long
			 * Executed = (Long) totallist[1]; int ExecutedPercentage = (int)
			 * Math.round(Executed * 100.0 / Planned); Long Failed = (Long)
			 * totallist[2]; int FailedPercentage = (int) Math.round(Failed *
			 * 100.0 / Planned); Long Passed = (Long) totallist[3]; int
			 * PassedPercentage = (int) Math.round(Passed * 100.0 / Planned);
			 * Long Blocked = (Long) totallist[4]; int BlockedPercentage = (int)
			 * Math.round(Blocked * 100.0 / Planned); Long Untested = (Long)
			 * totallist[5]; int UntestedPercentage = (int) Math.round(Untested
			 * * 100.0 / Planned); ReportBean reportBean = new ReportBean();
			 * reportBean.setPlanDescription("Total");
			 * reportBean.setPlanned(Planned); reportBean.setExecuted(Executed);
			 * reportBean.setFailed(Failed); reportBean.setPassed(Passed);
			 * reportBean.setBlocked(Blocked); reportBean.setUntested(Untested);
			 * reportBean.setExecutedPercentage(ExecutedPercentage);
			 * reportBean.setFailedPercentage(FailedPercentage);
			 * reportBean.setPassedPercentage(PassedPercentage);
			 * reportBean.setBlockedPercentage(BlockedPercentage);
			 * reportBean.setUntestedPercentage(UntestedPercentage);
			 * returningResultList.add(reportBean); }
			 
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getReportQuery Web Chart Exception", e);
		}
		log.debug("ReportController::getReportQuery()"+resultList);
		System.out.println(resultList);
		return resultList;
	}*/

	/**
	 * Author: Shasahank Description: Table for All defects input:PlanName
	 * output:list of all defects For a plan(pdefectsFinal)
	 */

/*	@RequestMapping(value = "/ords/preprod/getAllDefectDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getAllDefects(
			@RequestParam(value = "planName", required = false) String planName) {
		List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
		log.debug("ReportController::getAllDefects()");
		try {
			resultList = reportService.getAllDefects(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getAllDefects  Exception", e);
		}
		return resultList;
	}
*/
	/**
	 * Author: Shasahank Description: Fetches popUpWebTable Details
	 * input:PlanName output:list of all popUpWebTable Details For a
	 * plan(PTestInstanceFinal)
	 */

	@RequestMapping(value = "/ords/preprod/getPopupWebDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getPopupWebDetails(
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "component", required = false) String component,
			@RequestParam(value = "column", required = false) String column,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "testtype", required = false) String testtype) {
		List<PTestInstanceFinal> resultList = new<PTestInstanceFinal> ArrayList();
		log.debug("ReportController::getPopupWebDetails()");
		try {
			resultList = reportService.getPopupWebDetails(planName, component,
					column,cycleName, testtype);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getPopupWebDetails  Exception", e);
		}
		return resultList;
	}

	/**
	 * Author: Shasahank Description: Fetches CommentDetails input:PlanName
	 * output:list of all CommentDetails Details For a plan(PTestInstanceFinal)
	 */

	/*@RequestMapping(value = "/ords/preprod/getCommentDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getCommentDetails(
			@RequestParam(value = "planName", required = false) String planName) {
		List<PTestInstanceFinal> resultList = new<PTestInstanceFinal> ArrayList();
		log.debug("ReportController::getCommentDetails()");
		try {
			resultList = reportService.getCommentDetails(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getCommentDetails  Exception", e);
		}
		return resultList;
	}
*/
	/**
	 * Author: Shasahank Description: Update and Insert to CommentDetails
	 *//*
	@RequestMapping(value = "/ords/preprod/InsertUpdateCommentDetails", method = RequestMethod.POST)
	@ResponseBody
	public void insertUpdateCommentDetails(
			@RequestBody PcommentsBean pcommentsBean) {
		log.debug("insertUpdateCommentDetails: Input=>");
		try {
			reportService.insertUpdateCommentDetails(pcommentsBean);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("insertUpdateCommentDetails", e);
		}

	}*/

	/**
	 * Author: Shasahank Description: Distinct Data for Dsr Screen
	 * input:PlanName
	 */

	/*@RequestMapping(value = "/ords/preprod/distinctDataForDsr", method = RequestMethod.GET)
	@ResponseBody
	public List distinctDataForDsr(
			@RequestParam(value = "planName", required = false) String planName) {
		List resultList = new ArrayList();
		log.debug("ReportController::distinctDataForDsr()");
		try {
			resultList = reportService.distinctDataForDsr(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("distinctDataForDsr  Exception", e);
		}
		return resultList;
	}*/

	/**
	 * Author: Shasahank Description: Distinct Data for get Sit Defect ViewAll
	 * input:PlanName
	 */

	/*@RequestMapping(value = "/ords/preprod/getSitDefectViewAll", method = RequestMethod.GET)
	@ResponseBody
	public List getSitDefectViewAll() {
		List resultList = new ArrayList();
		log.debug("ReportController::getSitDefectViewAll()");
		try {
			resultList = reportService.getSitDefectViewAll();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getSitDefectViewAll  Exception", e);
		}
		return resultList;
	}*/

	/**
	 * Author: Shasahank Description: Distinct Data for get Sit Defect ViewAll
	 * input:PlanName
	 *//*

	@RequestMapping(value = "/ords/preprod/getSitDefectView", method = RequestMethod.GET)
	@ResponseBody
	public List getSitDefectView() {
		List resultList = new ArrayList();
		log.debug("ReportController::getSitDefectView()");
		try {
			resultList = reportService.getSitDefectView();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getSitDefectView  Exception", e);
		}
		return resultList;
	}*/
	
	
	/**
	 * Author: Shasahank Description: Rest API to get Details of Pop Up Pie
	 * Chart params : planName,testType1,status
	 */

	@RequestMapping(value = "/ords/preprod/getpopupPiechartDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getpopupPiechartDetails(
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "testType1", required = false) String testType1,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "status", required = false) String status) {
		
		
		List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		log.debug("barChartController::getpopupPiechartDetails");
		try {
			popupPiechartDetails = barchartService.getpopupPiechartDetails(
					planName, testType1,cycleName, status);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("barChartController Exception", e);
		}
		return popupPiechartDetails;
	}
	
	
	
	/**
	 * Author: Shasahank Description: Rest API to get Details of Pop Up Bar
	 * Chart params : planName,testType1,component,status
	 */

	@RequestMapping(value = "/ords/preprod/getpopupBarchartDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getpopupBarchartDetails(@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "testType1", required = false) String testType1,
			@RequestParam(value = "component", required = false) String component,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "status", required = false) String status) {
		
		
		List<PTestInstanceFinal> popupBarchartDetails = new<PTestInstanceFinal> ArrayList();
		log.debug("barChartController::getpopupBarchartDetails");
		try {
			popupBarchartDetails = barchartService.getpopupBarchartDetails(
					planName, testType1, component,cycleName, status);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("barChartController Exception", e);
		}
		return popupBarchartDetails;
	}

}
