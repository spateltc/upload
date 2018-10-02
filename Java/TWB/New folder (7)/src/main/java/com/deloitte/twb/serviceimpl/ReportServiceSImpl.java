package com.deloitte.twb.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.PcommentsBean;
import com.deloitte.twb.bean.ReportBean;
import com.deloitte.twb.constants.TestTypeConstants;
import com.deloitte.twb.dao.PDefectsFinalDAO;
import com.deloitte.twb.dao.PTestInstanceFinalDAO;
import com.deloitte.twb.dao.PTestSetFinalDao;
import com.deloitte.twb.dao.PcommentsDao;
import com.deloitte.twb.dao.ReportChartDao;
import com.deloitte.twb.dao.TestPlanListDAO;
import com.deloitte.twb.service.ReportService;

@Service
public class ReportServiceSImpl implements ReportService {

	@Autowired
	ReportChartDao reportChartDao;

	@Autowired
	PTestSetFinalDao pTestSetFinalDao;

	@Autowired
	PDefectsFinalDAO pDefectsFinalDao;
	
	@Autowired
	PcommentsDao pcommentsDao;
	
	@Autowired
	PTestInstanceFinalDAO pTestInstanceFinalDao;
	
	@Autowired
	TestPlanListDAO testPlanListDao;
	/**
	 * 	Author: Shasahank
	 *	Description: Services to get the WebChart Details 
	 *	input:1.PlanName 2.RankNum 3.testType
	 *	output:list of all defects For a plan(pdefectsFinal) 
	 */
	
	@Override
	public List getReportQuery(String planName, String RankNum,String testType) throws Exception {
		List<ReportBean> returningResultList = new<ReportBean> ArrayList();
		Object[] totallist = new Object[5];
		Object[] totallistObjects = new Object[6];

		List DistinctItemList = new ArrayList();
		List ItemList = new ArrayList();
		List resultList = new ArrayList();
		List unionList = new ArrayList();
		List lValueList = new ArrayList();
		/*String SITProgression = new String("SIT Progression");
		String E2EProgression = new String("E2E Progression");
		String SITRegression = new String("SIT Regression");
		String E2ERegression = new String("E2E Regression");
		String Automated = new String("Automated");
		String C = new String("C");
		String R = new String("R");
		String T = new String("T");*/
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
		//ItemList = pTestSetFinalDao.getItemList(planName,testType1,testType2);
		
		/*int foo = Integer.parseInt(RankNum);
		String Item="";
		if (foo <= ItemList.size()) {
			int index = foo - 1;
			Item = (String) ItemList.get(index);
		}*/
			
		//Component
		if(lValueList.contains(TestTypeConstants.C)){
			resultList = pTestInstanceFinalDao.componentReportDetails(planName, testType, RankNum);
			unionList = pTestInstanceFinalDao.unionComponentReportDetails(planName, testType, RankNum);
			resultList.removeAll(unionList);
			resultList.addAll(unionList);
		}
		
		//Requirement
		if(lValueList.contains(TestTypeConstants.R)){
			resultList = 	pTestInstanceFinalDao.requirementReportcharDetails(planName, testType, RankNum);
			unionList = pTestInstanceFinalDao.unionComponentReportDetails(planName, testType, RankNum);
			resultList.removeAll(unionList);
			resultList.addAll(unionList);
		}

		//TestSet
		if(lValueList.contains(TestTypeConstants.T)){
			resultList = pTestInstanceFinalDao.testSetReportDetails(planName, testType, RankNum);
			unionList = pTestInstanceFinalDao.unionComponentReportDetails(planName, testType, RankNum);
			resultList.removeAll(unionList);
			resultList.addAll(unionList);
		}
		
		if (resultList != null) {
			for (int i = 0; i < resultList.size() - 1; i++) {
				totallistObjects = (Object[]) resultList.get(i);
				String PlanDescription = (String) totallistObjects[0];
				Long Planned = (Long) totallistObjects[1];
				Long Executed = (Long) totallistObjects[2];
				int ExecutedPercentage = (int) Math.round(Executed * 100.0
						/ Planned);
				Long Failed = (Long) totallistObjects[3];
				int FailedPercentage = (int) Math.round(Failed * 100.0
						/ Planned);
				Long Passed = (Long) totallistObjects[4];
				int PassedPercentage = (int) Math.round(Passed * 100.0
						/ Planned);
				Long Blocked = (Long) totallistObjects[5];
				int BlockedPercentage = (int) Math.round(Blocked * 100.0
						/ Planned);
				Long Untested = (Long) totallistObjects[6];
				int UntestedPercentage = (int) Math.round(Untested * 100.0
						/ Planned);
				ReportBean reportBean = new ReportBean();
				reportBean.setPlanDescription(PlanDescription);
				reportBean.setPlanned(Planned);
				reportBean.setExecuted(Executed);
				reportBean.setFailed(Failed);
				reportBean.setPassed(Passed);
				reportBean.setBlocked(Blocked);
				reportBean.setUntested(Untested);
				reportBean.setExecutedPercentage(ExecutedPercentage);
				reportBean.setFailedPercentage(FailedPercentage);
				reportBean.setPassedPercentage(PassedPercentage);
				reportBean.setBlockedPercentage(BlockedPercentage);
				reportBean.setUntestedPercentage(UntestedPercentage);
				returningResultList.add(reportBean);
			}
		}
		if (resultList != null) {
			totallist = (Object[]) resultList.get(resultList.size() - 1);
		
		if (totallist != null) {
			Long Planned = (Long) totallist[0];
			Long Executed = (Long) totallist[1];
			int ExecutedPercentage = (int) Math.round(Executed * 100.0
					/ Planned);
			Long Failed = (Long) totallist[2];
			int FailedPercentage = (int) Math.round(Failed * 100.0
					/ Planned);
			Long Passed = (Long) totallist[3];
			int PassedPercentage = (int) Math.round(Passed * 100.0
					/ Planned);
			Long Blocked = (Long) totallist[4];
			int BlockedPercentage = (int) Math.round(Blocked * 100.0
					/ Planned);
			Long Untested = (Long) totallist[5];
			int UntestedPercentage = (int) Math.round(Untested * 100.0
					/ Planned);
			ReportBean reportBean = new ReportBean();
			reportBean.setPlanDescription("Total");
			reportBean.setPlanned(Planned);
			reportBean.setExecuted(Executed);
			reportBean.setFailed(Failed);
			reportBean.setPassed(Passed);
			reportBean.setBlocked(Blocked);
			reportBean.setUntested(Untested);
			reportBean.setExecutedPercentage(ExecutedPercentage);
			reportBean.setFailedPercentage(FailedPercentage);
			reportBean.setPassedPercentage(PassedPercentage);
			reportBean.setBlockedPercentage(BlockedPercentage);
			reportBean.setUntestedPercentage(UntestedPercentage);
			returningResultList.add(reportBean);
		}
		}
		return returningResultList;
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Services Implementation to get the  List for All defects
	 *	input:PlanName
	 *	output:list of all defects For a plan(pdefectsFinal)
	 */
	
	
	@Override
	public List getAllDefects(String planName) throws Exception {
	//	List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
		//resultList=pDefectsFinalDao.getAllDefects(planName);
		return pDefectsFinalDao.getAllDefects(planName);
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description:  Services Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */

	public List  getPopupWebDetails(String planName,String component,String column,String cycleName,String testtype)throws Exception{
		List<PTestInstanceFinal> resultList = new<PTestInstanceFinal> ArrayList();
		 if(component.equalsIgnoreCase(TestTypeConstants.Total)){
			 if(column.equalsIgnoreCase(TestTypeConstants.Executed)){
				 resultList=pTestInstanceFinalDao.getTotalExecutedPopupWebDetails( planName, component, column,cycleName, testtype);
			}
			if (column.equalsIgnoreCase(TestTypeConstants.Failed)) {
				resultList=pTestInstanceFinalDao.getTotalFailedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

			if (column.equalsIgnoreCase(TestTypeConstants.Passed)) {
				resultList=pTestInstanceFinalDao.getTotalPassedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

			if (column.equalsIgnoreCase(TestTypeConstants.Blocked)) {
				resultList=pTestInstanceFinalDao.getTotalBlockedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

			if (column.equalsIgnoreCase(TestTypeConstants.Untested)) {
				resultList=pTestInstanceFinalDao.getTotalUntestedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

		 }
		 else{
			 if(column.equalsIgnoreCase(TestTypeConstants.Executed)){
				 resultList=pTestInstanceFinalDao.getExecutedPopupWebDetails( planName, component, column,cycleName, testtype);
			}
			if (column.equalsIgnoreCase(TestTypeConstants.Failed)) {
				resultList=pTestInstanceFinalDao.getFailedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

			if (column.equalsIgnoreCase(TestTypeConstants.Passed)) {
				resultList=pTestInstanceFinalDao.getPassedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

			if (column.equalsIgnoreCase(TestTypeConstants.Blocked)) {
				resultList=pTestInstanceFinalDao.getBlockedPopupWebDetails( planName, component, column,cycleName, testtype);
			}

			if (column.equalsIgnoreCase(TestTypeConstants.Untested)) {
				resultList=pTestInstanceFinalDao.getUntestedPopupWebDetails( planName, component, column,cycleName, testtype);
			}
		 }
		
		return resultList;
	}
	/**
	 * 	Author: Shasahank
	 *	Description:  Services Implementation to Fetches CommentDetails Details  
	 *	input:PlanName
	 *	output:list of all CommentDetails Details For a plan(PTestInstanceFinal)
	 */
	
	public List getCommentDetails(String planName)throws Exception{
		//List resultList = new ArrayList();
		//resultList=pcommentsDao.getCommentDetails(planName);
		return pcommentsDao.getCommentDetails(planName);
	}

	/**
	 * 	Author: Shasahank
	 *	Description: Distinct Data for Dsr Screen   
	 *	input:PlanName
	 */
	
	public List distinctDataForDsr(String planName)throws Exception{
		//List resultList = new ArrayList();
		//resultList=pTestInstanceFinalDao.distinctDataForDsr(planName);
		return pTestInstanceFinalDao.distinctDataForDsr(planName);
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Update and Insert to CommentDetails   
	 */
	
	
	public void insertUpdateCommentDetails(PcommentsBean pcommentsBean)throws Exception{
		pcommentsDao.insertUpdateCommentDetails(pcommentsBean);
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description:	Fetches Sit Defect View All  
	 * @return 
	 */
	
	
	public List getSitDefectViewAll() throws Exception{
		//List resultList = new ArrayList();
	//	resultList = pDefectsFinalDao.getSitDefectViewAll();
		return pDefectsFinalDao.getSitDefectViewAll();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description:	Fetches Sit Defect View   
	 * @return 
	 */
	
	
	public List getSitDefectView() throws Exception{
		//List resultList = new ArrayList();
		//resultList = testPlanListDao.getSitDefectView();
		return testPlanListDao.getSitDefectView();
	}
	
	
}
