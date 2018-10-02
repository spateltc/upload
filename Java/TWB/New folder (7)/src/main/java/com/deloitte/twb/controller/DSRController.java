package com.deloitte.twb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.twb.bean.AllDefectsStatusBean;
import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.DSRQueryInputBean;
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.LGDefectsStatusBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.ReportBean;
import com.deloitte.twb.bean.SITDates;
import com.deloitte.twb.bean.TestInstanceStatusBean;
import com.deloitte.twb.bean.TestPlanList;
import com.deloitte.twb.service.BarChartService;
import com.deloitte.twb.service.DSRService;
import com.deloitte.twb.service.ReportService;

@Controller
public class DSRController {

	@Autowired
	DSRService dSRService;
	
	@Autowired
	ReportService reportService;
	
	@Autowired
	BarChartService barchartService;
	

	static Logger log = Logger.getLogger(TestCaseController.class.getName());

	/**
	 * Service for getting pie chart data by passing plan name,rank num and test
	 * type as Input via dSRQueryInputBean
	 * 
	 * @param DSRQueryInputBean
	 *            dSRQueryInputBean
	 * @return List<TestInstanceStatusBean>
	 */
	@RequestMapping(value = "/ords/preprod/piechart/", method = RequestMethod.POST)
	@ResponseBody
	public List<TestInstanceStatusBean> getPieChartData(
			@RequestBody DSRQueryInputBean dSRQueryInputBean) {
		String planname = dSRQueryInputBean.getPlanName();
		String cycleName = dSRQueryInputBean.getCycleName();
		String testType = dSRQueryInputBean.getTestType();
		log.debug("DSRController:getPieChartData: Input=>" + dSRQueryInputBean);
		try {
			return dSRService.getPieChartData(planname, cycleName, testType);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getPieChartData:Exception", e);
		}
		return null;
	}

	/**
	 * Service for getting list of test plan by passing program name as Input
	 * via testPlanListInput
	 * 
	 * @param TestPlanList
	 *            testPlanList
	 * @return List<TestPlanList>
	 */
	@RequestMapping(value = "/ords/preprod/listtestplan/", method = RequestMethod.GET)
	@ResponseBody
	public List<DtwIntegration> getActiveTestPlanList(HttpServletResponse response) {
		//String programName = testPlanListInput.getTestPlanType();
		log.debug("DSRController:getActiveTestPlanList: Input=>");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
			return dSRService.getActiveTestPlanList();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getActiveTestPlanList:Exception", e);
		}
		return null;
	}

	/**
	 * Service for getting launch gating defects by passing plan name as Input
	 * via pDefectsFinalInput
	 * 
	 * @param PDefectsFinalInput
	 *            pDefectsFinalInput
	 * @return List<PDefectsFinal>
	 */
	@RequestMapping(value = "/ords/preprod/listLaunchGatingDefects/", method = RequestMethod.POST)
	@ResponseBody
	public List<PDefectsFinal> getLaunchGatingDefects(
			@RequestBody PDefectsFinal pDefectsFinalInput) {
		String planName = pDefectsFinalInput.getPlanName();
		log.debug("DSRController:getLaunchGatingDefects: Input=>"
				+ pDefectsFinalInput);
		try {
			return dSRService.getLaunchGatingDefects(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getLaunchGatingDefects:Exception", e);
		}
		return null;
	}

	@RequestMapping(value = "/ords/preprod/allDefectsInformationPopup/", method = RequestMethod.POST)
	@ResponseBody
	public List<PDefectsFinal> getAllDefectsInformationPopup(
			@RequestBody PDefectsFinal pDefectsFinalInput) {
		String planName = pDefectsFinalInput.getPlanName();
		String status = pDefectsFinalInput.getStatus();
		String priority = pDefectsFinalInput.getPriority();
		String pCheck = pDefectsFinalInput.getpCheck();
		String pClosedFlag = pDefectsFinalInput.getpClosedFlag();
		log.debug("DSRController:allDefectsInformationPopup: Input=>"
				+ pDefectsFinalInput);
		try {
			return dSRService.getAllDefectsInformationPopup(planName, status,
					priority, pCheck, pClosedFlag);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:allDefectsInformationPopup:Exception", e);
		}
		return null;
	}

	@RequestMapping(value = "/ords/preprod/lGDefectsInformationPopup/", method = RequestMethod.POST)
	@ResponseBody
	public List<PDefectsFinal> getLaunchGatingDefectsInformationPopup(
			@RequestBody PDefectsFinal pDefectsFinalInput) {
		String planName = pDefectsFinalInput.getPlanName();
		String status = pDefectsFinalInput.getStatus();
		String priority = pDefectsFinalInput.getPriority();
		String pCheck = pDefectsFinalInput.getpCheck();
		String pClosedFlag = pDefectsFinalInput.getpClosedFlag();
		log.debug("DSRController:getLaunchGatingDefectsInformationPopup: Input=>"
				+ pDefectsFinalInput);
		try {
			return dSRService.getLaunchGatingDefectsInformationPopup(planName,
					status, priority, pCheck, pClosedFlag);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(
					"DSRController:getLaunchGatingDefectsInformationPopup:Exception",
					e);
		}
		return null;
	}

	@RequestMapping(value = "/ords/preprod/SITDates/", method = RequestMethod.POST)
	@ResponseBody
	public List<SITDates> getSITDatesInfo() {
		try {
			return dSRService.getSITDatesInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("DSRController:getSITDatesInfo:Exception", e);
		}
		return null;
	}

	@RequestMapping(value = "/programName")
	@ResponseBody
	public ModelAndView getProgramName() {
		return new ModelAndView("ProgramNames");
	}

	@RequestMapping(value = "/plans")
	@ResponseBody
	public ModelAndView getPlan( @RequestParam(value="plan", required=false) String planName) {
		return new ModelAndView("PlanList");
	}
	
	@RequestMapping(value = "/testTypes")
	@ResponseBody
	public ModelAndView getTestTypes( @RequestParam(value="plan", required=false) String planName) {
		return new ModelAndView("TestType");
	}
	
	
	
	
	/**
	 * Author: Shasahank Description: Method to Fetch the Result Set of
	 * Planned,Executed,Blocked,Failed,Untested Percentage
	 * Input:PlanName,RankNum,testType Output:list of WebChart Details
	 */

	@RequestMapping(value = "/ords/preprod/getReportDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getReportQuery(
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "testType", required = false) String testType) {
		List<ReportBean> resultList = new<ReportBean> ArrayList();
		/*
		 * List<ReportBean> returningResultList = new<ReportBean> ArrayList();
		 * Object[] totallist = new Object[5]; Object[] totallistObjects = new
		 * Object[6];
		 */

		log.debug("ReportController::getReportQuery()");
		try {
			resultList = reportService.getReportQuery(planName, cycleName,
					testType);
			/*
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
			 */
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getReportQuery Web Chart Exception", e);
		}
		log.debug("ReportController::getReportQuery()"+resultList);
		System.out.println(resultList);
		return resultList;
	}
	
	
	
	/**
	 * Author: Shasahank Description: RestApi to Fetch the Result Set Related to
	 * BarChart input: 1.planName, 2.RankNum,3.TestType output: Details of the
	 * BarChart
	 */

	@RequestMapping(value = "/ords/preprod/getbarChartDetails", method = RequestMethod.GET)
	@ResponseBody
	public List<BarChartBean> getBarChart(
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "testType", required = false) String testType) {
		List<BarChartBean> resultList = new ArrayList();

		log.debug("barChartController::getBarChart"+planName+"cycleName"+cycleName+"testType"+testType);
		try {
			resultList = barchartService.getBarChartDetails(planName,
					cycleName, testType);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("barChartController Exception", e);
		}                                                                             
		log.debug("barChartController::getBarChart"+resultList);              
		return resultList;                                             
	}                                                                    
	
	
	/**
	 * Author: Shasahank Description: Distinct Data for Dsr Screen
	 * input:PlanName
	 */

	@RequestMapping(value = "/ords/preprod/distinctDataForDsr", method = RequestMethod.GET)
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
	}
	
	
	/**
	 * Service for getting launch gating defects by passing plan name as Input
	 * via pDefectsFinalInput
	 * 
	 * @param PDefectsFinalInput
	 *            pDefectsFinalInput
	 * @return List<PDefectsFinal>
	 */
	@RequestMapping(value = "/ords/preprod/getLGDefectsStatusCount/", method = RequestMethod.POST)
	@ResponseBody
	public List<LGDefectsStatusBean> getLGDefectsStatusCount(
			@RequestBody PDefectsFinal pDefectsFinalInput) {
		String planName = pDefectsFinalInput.getPlanName();
		log.debug("DSRController:getLaunchGatingDefects: Input=>"
				+ pDefectsFinalInput);
		try {
			return dSRService.getLGDefectsStatusCount(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getLaunchGatingDefects:Exception", e);
		}
		return null;
	}
	
	/**
	 * Service for getting all defects by passing plan name as Input
	 * via pDefectsFinalInput
	 * 
	 * @param PDefectsFinalInput
	 *            pDefectsFinalInput
	 * @return List<PDefectsFinal>
	 */
	@RequestMapping(value = "/ords/preprod/getAllDefectsStatusCount/", method = RequestMethod.POST)
	@ResponseBody
	public List<AllDefectsStatusBean> getAllDefectsStatusCount(
			@RequestBody PDefectsFinal pDefectsFinalInput) {
		String planName = pDefectsFinalInput.getPlanName();
		log.debug("DSRController:getAllDefectsStatusCount: Input=>"
				+ pDefectsFinalInput);
		try {
			return dSRService.getAllDefectsStatusCount(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getAllDefectsStatusCount:Exception", e);
		}
		return null;
	}
	
	
	@RequestMapping(value = "ords/preprod/MapReportTable", method = RequestMethod.GET)
	@ResponseBody
	public List<GhostRiderBean> MapReportTable(HttpServletResponse response,
			@RequestParam(value = "startDateValue", required = false) String startDateValue,
			@RequestParam(value = "endDateValue", required = false) String endDateValue,
			@RequestParam(value = "reportName", required = false) String reportName
			) {
		//String planName = pDefectsFinalInput.getPlanName();
		log.debug("DSRController:getAllDefectsStatusCount: Input=>"
				+ "shashnak");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
			return  dSRService.getGhostRiderTableData(reportName,startDateValue,endDateValue);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getAllDefectsStatusCount:Exception", e);
		}
		return null;
	}
	
	
	@RequestMapping(value = "ords/preprod/MapLocation", method = RequestMethod.GET)
	@ResponseBody
	public List<MapBean> MapLocation(HttpServletResponse response
		//	@RequestParam(value = "startDateValue", required = false) String startDateValue,
	    //  @RequestParam(value = "endDateValue", required = false) String endDateValue,
		//  @RequestParam(value = "reportName", required = false) String reportName
			) {
		//String planName = pDefectsFinalInput.getPlanName();
		log.debug("DSRController:getAllDefectsStatusCount: Input=>"
				+ "shashnak");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
		//	return  dSRService.getGhostRiderTableData(reportName,startDateValue,endDateValue);
			return  dSRService.MapLocation();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getAllDefectsStatusCount:Exception", e);
		}
		return null;
	}
	
	
}
