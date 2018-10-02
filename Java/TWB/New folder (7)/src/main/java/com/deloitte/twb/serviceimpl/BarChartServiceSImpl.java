package com.deloitte.twb.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.ReportBean;
import com.deloitte.twb.constants.TestTypeConstants;
import com.deloitte.twb.controller.TestSuiteController;
import com.deloitte.twb.dao.BarChartDao;
import com.deloitte.twb.dao.DtwIntegrationDao;
import com.deloitte.twb.dao.DtwProgramListDAO;
import com.deloitte.twb.dao.PTestInstanceFinalDAO;
import com.deloitte.twb.dao.PTestSetFinalDao;
import com.deloitte.twb.dao.TestPlanListDAO;
import com.deloitte.twb.service.BarChartService;

@Service
public class BarChartServiceSImpl implements BarChartService {
	
	static Logger log = Logger.getLogger(TestSuiteController.class.getName());

	@Autowired
	BarChartDao barChartDao;
	
	@Autowired
	PTestInstanceFinalDAO pTestInstanceFinalDao;
	
	
	@Autowired
	DtwIntegrationDao dtwIntegrationDao;
	
	@Autowired
	TestPlanListDAO testPlanListDao;
	
	@Autowired
	PTestSetFinalDao pTestSetFinalDao;

	@Autowired
	DtwProgramListDAO dtwProgramListDAO;

	/**
	 * 	Author: Shasahank
	 *	Description: Service Implementation to Fetch the Result Set Related to BarChart
	 *	input:	1.planName, 2.RankNum,3.TestType 
	 *	output:	Details of the BarChart
	 */

	@Override
	public List<BarChartBean> getBarChartDetails(String planName, String RankNum,String testType) throws Exception {
		log.debug("barChartServiceImpl::getBarChartDetails");
		List DistinctItemList = new ArrayList();
		List ItemList = new ArrayList();
		List<BarChartBean> returningResultList = new<BarChartBean> ArrayList();
		List resultList = new ArrayList();
		Object[] totallistObjects = new Object[4];
		List lValueList = new ArrayList();
		/*String SITProgression = new String("SIT Progression");
		String E2EProgression = new String("E2E Progression");
		String SITRegression = new String("SIT Regression");
		String E2ERegression = new String("E2E Regression");
		String Automated = new String("Automated");*/
		String C = new String("C");
		String R = new String("R");
		String T = new String("T");
		/*String[] words=testType.split(":");
		String testType1 = words[0];
		String testType2 = words[1];*/
		
		DistinctItemList = pTestInstanceFinalDao.getDistinctItem(planName,testType);
		
		if (DistinctItemList.contains(TestTypeConstants.SIT_PROGRESSION_VALUE) || DistinctItemList.contains(TestTypeConstants.E2E_Progression)) {
			lValueList = testPlanListDao.getProgressionLvalueList(planName);
		}
		
		if (DistinctItemList.contains(TestTypeConstants.SIT_REGRESSION_VALUE) || DistinctItemList.contains(TestTypeConstants.E2E_Regression)) {
			lValueList = testPlanListDao.getRegressionLvalueList(planName);
		}
		
		
		if (DistinctItemList.contains(TestTypeConstants.AUTOMATED_VALUE) ) {
			lValueList = testPlanListDao.getautomatedvalueList(planName);
		}
		
		ItemList = pTestSetFinalDao.getItemList(planName,testType);
		
		/*int foo = Integer.parseInt(RankNum);
		String Item="";
		if (foo <= ItemList.size()) {
			int index = foo - 1;
			Item = (String) ItemList.get(index);
		}   */ 
		
		//Component
		if(lValueList.contains(TestTypeConstants.C)){
			resultList = pTestInstanceFinalDao.componentBarcharDetails(planName, testType, RankNum);
		}
		
		//Requirement
		if(lValueList.contains(TestTypeConstants.R)){
			resultList = 	pTestInstanceFinalDao.requirementBarcharDetails(planName, testType, RankNum);
		}
		
		//Test Set
		if(lValueList.contains(TestTypeConstants.T)){
			resultList = pTestInstanceFinalDao.testSetbarChartDetails(planName, testType,  RankNum);
			
		}
		
		/*if (resultList != null) {
			for (int i = 0; i < resultList.size(); i++) {
				totallistObjects = (Object[]) resultList.get(i);
				BarChartBean barChartBean = new BarChartBean();
				String Component = (String) totallistObjects[0];
				Long Passed = (Long) totallistObjects[1];
				Long Failed = (Long) totallistObjects[2];
				Long NotCategorized = (Long) totallistObjects[3];
				barChartBean.setPassed(Passed);
				barChartBean.setFailed(Failed);
				barChartBean.setNotcategorized(NotCategorized);
				barChartBean.setComponent(Component);
				returningResultList.add(barChartBean);
			}
		}*/
		log.debug("barChartServiceImpl::getBarChartDetails");
		return resultList;
	}

	/**
	 * 	Author: Shasahank
	 *	Description: ServiceImpl to get list of Program names
	 */
	public List getProgramNames() throws Exception{
		//List<String> resultList = new<String> ArrayList();
		//resultList = dtwProgramListDAO.getProgramNames();
		return (List<BarChartBean>)dtwProgramListDAO.getProgramNames();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service Implemenatation to get Details of Pop Up Bar Chart
	 */
	public List getpopupBarchartDetails(String planName, String testType1,	String component,String cycleName, String status) throws Exception{
		//List<PTestInstanceFinal> popupBarchartDetails = new<PTestInstanceFinal> ArrayList();
		//popupBarchartDetails = pTestInstanceFinalDao.getpopupBarchartDetails(planName,testType1,component,status);
		return (List<PTestInstanceFinal>)pTestInstanceFinalDao.getpopupBarchartDetails(planName,testType1,component,cycleName,status);
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service Implemenatation to get Details of Pop Up Pie Chart
	 */
	public List getpopupPiechartDetails(String planName, String testType1,String cycleName,String status) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		//popupPiechartDetails = pTestInstanceFinalDao.getpopupPiechartDetails(planName,testType1,status);
		return (List<PTestInstanceFinal>)pTestInstanceFinalDao.getpopupPiechartDetails(planName,testType1,cycleName, status);
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service Implemenatation to get  SIT_TEST_CASES Details 
	 */
	public List getSitTestCaseDetails() throws Exception{
		List resultList = new ArrayList();
		List returningResultList = new ArrayList();
		Object[] totallist = new Object[5];
		Object[] totallistObjects = new Object[6];
		resultList = testPlanListDao.getSitTestCaseDetails();
		if (resultList != null) {
			for (int i = 0; i < resultList.size(); i++) {
				totallistObjects = (Object[]) resultList.get(i);
				String Project = (String) totallistObjects[0];
				Long Total = (Long) totallistObjects[1];
				if (Total == null || Total == 0) {
					Total = (long) 1;
				}
				Long Executed = (Long) totallistObjects[2];
				int ExecutedPercentage = (int) Math.ceil(Executed * 100.0
						/ Total);
				Long Passed = (Long) totallistObjects[3];
				int PassedPercentage = (int) Math.ceil(Passed * 100.0
						/ Total);
				Long Failed = (Long) totallistObjects[4];
				int FailedPercentage = (int) Math.ceil(Failed * 100.0
						/ Total);
				Long Blocked = (Long) totallistObjects[5];
				int BlockedPercentage = (int) Math.ceil(Blocked * 100.0
						/ Total);
				ReportBean reportBean = new ReportBean();
				reportBean.setPlanDescription(Project);
				reportBean.setTotal(Total);
				reportBean.setExecuted(Executed);
				reportBean.setExecutedPercentage(ExecutedPercentage);
				reportBean.setPassed(Passed);
				reportBean.setPassedPercentage(PassedPercentage);
				reportBean.setFailed(Failed);
				reportBean.setFailedPercentage(FailedPercentage);
				reportBean.setBlocked(Blocked);
				reportBean.setBlockedPercentage(BlockedPercentage);
				returningResultList.add(reportBean);
			}
		}
		return returningResultList;
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service Implemenatation to get  readable Names Details 
	 */
	
	
	public List<DtwIntegration> getReadableNames(String planName ,String dtwColumnName,String category) throws Exception{
		return (List<DtwIntegration>)dtwIntegrationDao.getReadableNames( planName , dtwColumnName, category);
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Service Implemenatation to get  readable Names Details  FOR UI
	 */
	
	
	public List<DtwIntegration> getReadableNamesForCategory(String planName ) throws Exception{
		return (List<DtwIntegration>)dtwIntegrationDao.getReadableNamesForCategory( planName );
	}
	

}
