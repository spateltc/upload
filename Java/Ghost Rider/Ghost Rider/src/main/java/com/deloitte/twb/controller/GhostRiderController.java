package com.deloitte.twb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.bean.QuboBean;
import com.deloitte.twb.service.GhostRiderService;


@Controller
@SessionAttributes({"locationSession","reportNameSession","legacyCompanyNameSession"})
public class GhostRiderController {

	@Autowired
	GhostRiderService ghostRiderService;
	
	
	private String startDateValue;
	private String endDateValue;
	private String reportName;
	private String location;
	
	
	
	public String getStartDateValue() {
		return startDateValue;
	}


	public void setStartDateValue(String startDateValue) {
		this.startDateValue = startDateValue;
	}

	public String getEndDateValue() {
		return endDateValue;
	}


	public void setEndDateValue(String endDateValue) {
		this.endDateValue = endDateValue;
	}


	public String getReportName() {
		return reportName;
	}


	public void setReportName(String reportName) {
		this.reportName = reportName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	static Logger log = Logger.getLogger(GhostRiderController.class.getName());

	/**
	 * Service for getting pie chart data by passing plan name,rank num and test
	 * type as Input via dSRQueryInputBean
	 * 
	 * @param DSRQueryInputBean
	 *            dSRQueryInputBean
	 * @return List<TestInstanceStatusBean>
	 */
	
	
	
	@RequestMapping(value = "ords/preprod/MapReportTable", method = RequestMethod.GET)
	@ResponseBody
	public List<GhostRiderBean> MapReportTable(HttpServletResponse response,
			@RequestParam(value = "startDateValue", required = false) String startDateValue,
			@RequestParam(value = "endDateValue", required = false) String endDateValue,
			@RequestParam(value = "reportName", required = false) String reportName,
			@RequestParam(value = "location", required = false) String location,
			@ModelAttribute("locationSession") String locationSession,
			@ModelAttribute("reportNameSession") String reportNameSession,
			@ModelAttribute("legacyCompanyNameSession") String legacyCompanyNameSession
			) {
		//String planName = pDefectsFinalInput.getPlanName();
		log.debug("DSRController:getAllDefectsStatusCount: Input=>"   
				+ "shashnak");
		try {
			
			if(!reportNameSession.equalsIgnoreCase("")){
				response.setHeader("Access-Control-Allow-Origin","*");
				List<GhostRiderBean>  finalLGDefectsStatusCount=new ArrayList<GhostRiderBean>();
				finalLGDefectsStatusCount = ghostRiderService.getGhostRiderTableData(reportNameSession,startDateValue,endDateValue,locationSession);
				/*GhostRiderBean ghostRiderBean = new GhostRiderBean();
				ghostRiderBean.setLOCATION(locationSession); 
				ghostRiderBean.setLastRow(true);
				ghostRiderBean.setREPORTNAME(reportNameSession);
				finalLGDefectsStatusCount.add(ghostRiderBean);*/
				return  finalLGDefectsStatusCount;
			}
			else{
				response.setHeader("Access-Control-Allow-Origin","*");
				List<GhostRiderBean>  finalLGDefectsStatusCount=new ArrayList<GhostRiderBean>();
				finalLGDefectsStatusCount = ghostRiderService.getGhostRiderTableData(reportName,startDateValue,endDateValue,location);
				/*GhostRiderBean ghostRiderBean = new GhostRiderBean();
				ghostRiderBean.setLOCATION(location);
				ghostRiderBean.setREPORTNAME(reportName);
				finalLGDefectsStatusCount.add(ghostRiderBean);*/
				return  finalLGDefectsStatusCount;
			}
			
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
			return  ghostRiderService.MapLocation();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DSRController:getAllDefectsStatusCount:Exception", e);
		}
		return null;
	}
	
	
	
	@RequestMapping(value = "ords/preprod/getbotsReport", method = RequestMethod.POST)
	@ResponseBody
	public List<MapBean> getbotsReport(HttpServletResponse response,
		//	@RequestParam(value = "startDateValue", required = false) String startDateValue,
	    //  @RequestParam(value = "endDateValue", required = false) String endDateValue,
		//  @RequestParam(value = "reportName", required = false) String reportName
			@RequestBody QuboBean quboBean
			) {
		//String planName = pDefectsFinalInput.getPlanName();
		log.debug("GhostRiderController:getbotsReport: Input=>"
				+ "shashnak");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
		//	return  dSRService.getGhostRiderTableData(reportName,startDateValue,endDateValue);
			return  ghostRiderService.getbotsReport();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("GhostRiderController:getbotsReport:Exception", e);
		}
		return null;
	}
	
	
	
	
	/*@RequestMapping("/htmlView")
	public String renderHtmlView() {
	    return "index.html";
	}

	@RequestMapping("/jspView")
	public String renderJspView() {
	    return "index.jsp";
	}*/
	 
	
	@RequestMapping(value = "/")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("legacyCompanyNameSession","");
		mav.addObject("reportNameSession","");
		mav.addObject("locationSession","");
		mav.setViewName("index");
		return mav;
		//return new ModelAndView("index");
	}
	
	
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public ModelAndView gettable(HttpServletResponse response,
			//@RequestParam(value = "startDateValue", required = false) String startDateValue,
			@RequestParam(value = "legacyCompanyNameSession", required = false) String legacyCompanyNameSession,
			@RequestParam(value = "reportNameSession", required = false) String reportNameSession,
			@RequestParam(value = "locationSession", required = false) String locationSession) {
		
		QuboBean  quboBean = new QuboBean();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		if(legacyCompanyNameSession!=null){
			quboBean.setReportName(reportName);
		//this.legacyCompanyName=legacyCompanyName;
		mav.addObject("legacyCompanyNameSession", legacyCompanyNameSession);
		}
		
		if(reportNameSession!=null){
			quboBean.setStartDateValue(reportNameSession);
			mav.addObject("reportNameSession", reportNameSession);
			}
		
		if(locationSession!=null){
			quboBean.setEndDateValue(endDateValue);
			mav.addObject("locationSession", locationSession);
			}
		
		/*	if(location!=null){
			this.location=location;
			}
		*/
		
		

		/*Map<String,String> locationMap = new HashMap<String,String>(); 
		locationMap.put("startDateValue", startDateValue);
		locationMap.put("endDateValue", endDateValue);
		locationMap.put("reportName", reportName);
		locationMap.put("location", location);*/
		//return new ModelAndView("index",locationMap);
		//return new ModelAndView("index","quboBean",quboBean);
		//return new ModelAndView("index",locationMap);
			/*	String redirectUrl = "http://localhost:8080/GhostRider/table";
				return new ModelAndView("redirect:",redirectUrl);*/
		//	return new ModelAndView("index","quboBean",quboBean);
		return mav;
				}
	
	
}
