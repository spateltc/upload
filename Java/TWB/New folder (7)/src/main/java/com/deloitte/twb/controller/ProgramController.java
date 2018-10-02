package com.deloitte.twb.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.TestSuiteBean;
import com.deloitte.twb.service.BarChartService;
import com.deloitte.twb.service.DrawChartService;

@Controller
public class ProgramController {

	static Logger log = Logger.getLogger(TestSuiteController.class.getName());
	@Autowired
	BarChartService barchartService;
	
	
	@Autowired
	DrawChartService drawChartService;
	

	/**
	 * Author: Shasahank Description: RestApi to Fetch the Result Set Related to
	 * BarChart input: 1.planName, 2.RankNum,3.TestType output: Details of the
	 * BarChart
	 *//*

	@RequestMapping(value = "/ords/preprod/getbarChartDetails", method = RequestMethod.GET)
	@ResponseBody
	public List getBarChart(
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "cycleName", required = false) String cycleName,
			@RequestParam(value = "testType", required = false) String testType) {
		List resultList = new ArrayList();

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
	}*/
	
	/**
	 * Author: Shasahank Description: Rest API to get list of Program names
	 * output: list of Program names
	 */
	 
	@RequestMapping(value = "/ords/preprod/drawChart", method = RequestMethod.GET)
	@ResponseBody
	public List<BarChartBean> drawChart(HttpServletResponse response,
			@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "entity", required = false) String entity,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "chartType", required = false) String chartType) {
		//List<BarChartBean> resultList = new<String> ArrayList();
		log.debug("barChartController::getProgramNames");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
			return  drawChartService.drawChart( planName,  entity, category, chartType);
			 
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return null;
		//return resultList;
	}
	
	
	
	@RequestMapping(value = "/ords/preprod/distinctStatus", method = RequestMethod.GET)
	@ResponseBody
	public List<PTestInstanceFinal> distinctStatus(HttpServletResponse response,
			@RequestParam(value = "planName", required = false)  String planName ){
		log.debug("barChartController::distinctStatus");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
			return  drawChartService.distinctStatus( planName);
			 
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return null;
	}

	/**
	 * Author: Shasahank Description: Rest API to get list of Program names
	 * output: list of Program names
	 * @throws JSONException 
	 */
	 
	@RequestMapping(value = "/ords/preprod/getEntityNames", method = RequestMethod.GET)
	@ResponseBody
	public String  getEntityNames(HttpServletResponse response,
			@RequestParam(value = "entity", required = false) String entity,
			@RequestParam(value = "chartType", required = false) String chartType
			) throws JSONException {
		List resultList = new ArrayList();
		JSONObject jsonString=new JSONObject(); 
		JSONObject jsonString1=new JSONObject();  
		 JSONArray ja = new JSONArray();
		 
		
		
		String json ="";
		log.debug("barChartController::getProgramNames");
		try {
			int foo = Integer.parseInt(entity);
			if(foo == 1){
				json ="["+  "{"+"\"category\""+":"+"\"status\""+"}"+  "," +       "{"+"\"category\""+":"+"\"priority\""+"}" +"]";
			}else if(foo == 0){
				json ="["+  "{"+"\"category\""+":"+"\"NA\""+"}"+"]";
			}
			jsonString.put("category", "status");
			jsonString1.put("category", "priority");
			JSONObject combined = new JSONObject();
				ja.put(jsonString);
				ja.put(jsonString1);
				ja.toString();
			// json ="["+  "{"+"\"category\""+":"+"\"status\""+"}"+  "," +       "{"+"\"category\""+":"+"\"priority\""+"}" +"]";

			//resultList = barchartService.getProgramNames();
				resultList.add(ja);
			 response.setHeader("Access-Control-Allow-Origin","*");
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return json;
	}
	
	
	
	/**
	 * Author: Shasahank Description: Rest API to get list of Program names
	 * output: list of Program names
	 */
	 
	@RequestMapping(value = "/ords/preprod/getProgramNames", method = RequestMethod.GET)
	@ResponseBody
	public List<BarChartBean> getProgramNames(HttpServletResponse response) {
		List<BarChartBean> resultList = new<String> ArrayList();
		log.debug("barChartController::getProgramNames");
		try {
			resultList = barchartService.getProgramNames();
			 response.setHeader("Access-Control-Allow-Origin","*");
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return resultList;
	}
	
	/**
	 * Author: Shasahank Description: Rest API to get list of Readable column Name 
	 * output: list of Readable names
	 */

	@RequestMapping(value = "/ords/preprod/getReadableNames", method = RequestMethod.GET)
	@ResponseBody
	public List<DtwIntegration> getReadableNames(@RequestParam(value = "planName", required = false) String planName,
			@RequestParam(value = "dtwColumnName", required = false) String dtwColumnName,
			@RequestParam(value = "category", required = false) String category) {
		List<DtwIntegration> resultList = new<DtwIntegration> ArrayList();
		log.debug("barChartController::getReadableNames");
		try {
			resultList = barchartService.getReadableNames(planName,dtwColumnName,category);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return resultList;
	}
	
	
	/**
	 * Author: Shasahank Description: Rest API to get list of Readable column Name 
	 * output: list of Readable names
	 */

	@RequestMapping(value = "/ords/preprod/getReadableNamesForCategory", method = RequestMethod.GET)
	@ResponseBody
	public List<DtwIntegration> getReadableNamesForCategory(HttpServletResponse response,@RequestParam(value = "planName", required = false) String planName) {
		List<DtwIntegration> resultList = new<DtwIntegration> ArrayList();
		log.debug("barChartController::getReadableNames");
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
			resultList = barchartService.getReadableNamesForCategory(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return resultList;
	}
	
	
	/**
	 * Author: Shasahank Description: Rest API to get list of Readable column Name  of web Table 
	 * output: list of Readable names
	 */

	@RequestMapping(value = "/ords/preprod/getReadableNamesForColumn", method = RequestMethod.GET)
	@ResponseBody
	public String getReadableNamesForColumn(HttpServletResponse response,
			@RequestParam(value = "entity", required = false) String entity,
			@RequestParam(value = "planName", required = false) String planName) {
		List<DtwIntegration> resultList = new<DtwIntegration> ArrayList();
		log.debug("barChartController::getReadableNames");
		String json ="";
		log.debug("barChartController::getProgramNames");
		try {
			int foo = Integer.parseInt(entity);
			if(foo == 1){
				json ="["+ "{"+"\"columnName\""+":"+"\"Test Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Actual Execution Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Status\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Set Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Instance Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Planned Start Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Planned End Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Last Modified\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"PlanName\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Run Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Actual Strat Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Actual End Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Name\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Description\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Leaf Tasks\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Project\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Phase\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Assigned To\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Estimate\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Estimate Forecast\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Milestone Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Priority\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Refs\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Type\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Input Source\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Created By\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Created On\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Testing Type\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Comments\""+"}" ;
			}else if(foo == 0){
				json ="["+"{"+"\"columnName\""+":"+"\"Test Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Status\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Planned Start Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Planned End Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Last Modified\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"PlanName\""+"}"+ ","  + "{"+"\"columnName\""+":"+"\"Actual Strat Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Actual End Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Name\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Description\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Leaf Tasks\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Project\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Phase\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Estimate\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Estimate Forecast\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Milestone Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Priority\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Refs\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Type\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Input Source\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Created By\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Created On\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Comments\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Parent Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Risk Rating\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Execution Status\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Updated By\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Suite Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Hierarchial Path\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Functionality\""+"}" ;
			}
			else if(foo == 2){
				json ="["+"{"+"\"columnName\""+":"+"\"Status\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"PlanName\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Description\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Project\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Assigned To\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Priority\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Type\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Comments\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Input Source\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Decfect Id\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Severity\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Root Cause\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Defect Type\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Detected By\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Detected On Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Closing Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Closed in buid \""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Actual Fix Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Detected In Environment\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Summary\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Resolution\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Test Id Ref\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Target Fix Date\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Updated On\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Release\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Label\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"Line\""+"}"+ "," + "{"+"\"columnName\""+":"+"\"key\""+"}" ;
			}
			resultList = barchartService.getReadableNamesForCategory(planName);
			if(resultList.size() > 1){
			for (int i = 0; i < resultList.size(); i++) {
				DtwIntegration totallistObjects =  resultList.get(i);
				String readableName = totallistObjects.getReadableName();
				json =	json + "," + "{"+"\"columnName\""+":"+"\""+readableName+  "\""   +       "}";
			}
			}
			
			json =	json + "]";
			
			 response.setHeader("Access-Control-Allow-Origin","*");
		}  catch (Exception e) {
			e.printStackTrace();
			log.error("ProgramController Exception", e);
		}
		return json;
	}
	


	
}
