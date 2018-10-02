package com.deloitte.twb.serviceimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.AllDefectsStatusBean;
import com.deloitte.twb.bean.ColorsTestCasesStatus;
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.LGDefectsStatusBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.SITDates;
import com.deloitte.twb.bean.TestInstanceStatusBean;
import com.deloitte.twb.bean.TestPlanList;
import com.deloitte.twb.dao.ColorsTestCasesStatusDAO;
import com.deloitte.twb.dao.PDefectsFinalDAO;
import com.deloitte.twb.dao.PTestInstanceFinalDAO;
import com.deloitte.twb.dao.TestPlanListDAO;
import com.deloitte.twb.dao.UtilityDAO;
import com.deloitte.twb.service.DSRService;

@Service
public class DSRServiceImpl implements DSRService {

	@Autowired
	UtilityDAO utilityDAO;

	@Autowired
	PDefectsFinalDAO pDefectsFinalDAO;

	@Autowired
	PTestInstanceFinalDAO pTestInstanceFinalDAO;

	@Autowired
	TestPlanListDAO testPlanListDAO;

	@Autowired
	ColorsTestCasesStatusDAO colorsTestCasesStatusDAO;

	static String SIT_PROGRESSION_VALUE = "SIT Progression";
	static String SIT_REGRESSION_VALUE = "SIT Regression";
	static String AUTOMATED_VALUE = "Automated";
	static boolean isLaunchGatingDefect=false;

	@Override
	public List<TestInstanceStatusBean> getPieChartData(String planName,
			String cycleName, String testType) throws Exception {

		String testTypeProgression = getTestTypeProgression(testType, planName);

		String lValue = getlValueByTestTypeProgression(planName,
				testTypeProgression);

		//String item3Value = getItem3Value(planName, testType, rankNum);

		List<TestInstanceStatusBean> instanceStatusBeans = getPieChartData(
				lValue, planName, testType, cycleName);

		return processFinalResult(instanceStatusBeans);
	}
/**
 * Gets final data(i.e status,count,color records) after constructing final Pie Chart query(based on R/T/C value)
 * @param lValue
 * @param planName
 * @param testType
 * @param item3Value
 * @return List<TestInstanceStatusBean>
 * @throws Exception
 */
	public List<TestInstanceStatusBean> getPieChartData(String lValue,
			String planName, String testType, String item3Value)
			throws Exception {
		String finalPieChartHQL = contructPieChartQuery(lValue);
		List<Object[]> finalResultsForPieChart = utilityDAO.executeHQL(
				finalPieChartHQL,
				new Object[] { planName, testType, item3Value });
		TestInstanceStatusBean instanceStatusBean = null;
		List<TestInstanceStatusBean> instanceStatusBeans = new ArrayList<TestInstanceStatusBean>();
		for (Object[] row : finalResultsForPieChart) {
			instanceStatusBean = new TestInstanceStatusBean();
			instanceStatusBean.setStatus((String) row[0]);
			instanceStatusBean.setCount((long) row[1]);
			instanceStatusBeans.add(instanceStatusBean);
		}
		return instanceStatusBeans;
	}
/**
 * returns the final result by mapping colors to each of the pie chart data records based on the status
 * @param testInstanceStatusBeans
 * @return List<TestInstanceStatusBean>
 * @throws Exception
 */
	public List<TestInstanceStatusBean> processFinalResult(
			List<TestInstanceStatusBean> testInstanceStatusBeans)
			throws Exception {
		ColorsTestCasesStatus colorsTestCasesStatus = null;
		for (TestInstanceStatusBean item : testInstanceStatusBeans) {
			colorsTestCasesStatus = colorsTestCasesStatusDAO
					.getColorsTestCasesStatusByStatus(item.getStatus());
			item.setColor(colorsTestCasesStatus.getColor());
		}

		return testInstanceStatusBeans;
	}
/**
 * Returns lValue i.e. R/T/C(group by value for data) depending on plan name and test type progression
 * @param planName
 * @param testTypeProgression
 * @return lValue
 * @throws Exception
 */
	public String getlValueByTestTypeProgression(String planName,
			String testTypeProgression) throws Exception {
		TestPlanList testPlanListByPlanName = testPlanListDAO
				.getTestPlanListByPlanName(planName);
		if (testTypeProgression != null) {
			if (testTypeProgression.equalsIgnoreCase(SIT_PROGRESSION_VALUE)
					|| testTypeProgression.equalsIgnoreCase("E2E Progression")) {
				return testPlanListByPlanName.getSitProgression();
			} else if (testTypeProgression
					.equalsIgnoreCase(SIT_REGRESSION_VALUE)
					|| testTypeProgression.equalsIgnoreCase("E2E Regression")) {
				return testPlanListByPlanName.getSitRegression();
			} else if (testTypeProgression.equalsIgnoreCase(AUTOMATED_VALUE)) {
				return testPlanListByPlanName.getAutomated();
			}
		}
		return null;
	}
/**
 * constructs the hql needed to get final pie chart data 
 * @param lValue
 * @return String
 */
	public String contructPieChartQuery(String lValue) {
		String nestedPieChartHQL = " SELECT i.status,"
				+ // equivalent of "t"
				"  COUNT(*) ," + "  p.item3" + " FROM PTestInstanceFinal i,"
				+ "     PTestSetFinal p";
		if (lValue.equalsIgnoreCase("R")) {
			nestedPieChartHQL = nestedPieChartHQL + "    ,PReqFinal pr,"
					+ "   AlmReqMapping arm";
		}
		nestedPieChartHQL = nestedPieChartHQL + " WHERE 1=1"
				+ " AND i.planName=p.planName" + " AND i.testSetId=p.testSetId"
				+ " AND i.planName = ?" + "  AND valueExists(i.testType,?) >0";
		if (lValue.equalsIgnoreCase("R")) {
			nestedPieChartHQL = nestedPieChartHQL + " AND i.testId=arm.testId"
					+ " AND i.planName = arm.planName"
					+ " AND arm.planName=pr.planName"
					+ " AND arm.reqId=pr.reqId";
		}
		nestedPieChartHQL = nestedPieChartHQL + " AND p.item3 =? AND 1=1"
				+ "        GROUP BY i.status," + "       p.item3";
		return nestedPieChartHQL;
	}
/**
 * returns item_3 value from PTestSetFinal based on planName,testType and rankNum
 * @param planName
 * @param testType
 * @param rankNum
 * @return
 * @throws Exception
 */
/*	public String getItem3Value(String planName, String testType, int rankNum)
			throws Exception {
		String hql = "select distinct tsf.item3 from PTestSetFinal tsf, PTestInstanceFinal tif where tsf.planName =  ?  and tsf.planName=tif.planName  and tsf.testSetId=tif.testSetId   and valueExists(tif.testType,?) > 0   GROUP BY tsf.item3 order by tsf.item3";
		List results = utilityDAO.executeHQL(hql, new Object[] { planName,
				testType });
		int index = rankNum - 1;
		return (String) results.get(index);
	}*/
	/**
	 * Returns test type progression value(SIT Progression/SIT Regression/Automated) based on testType and planName
	 * @param testType
	 * @param planName
	 * @return test type progression
	 * @throws Exception
	 */
	public String getTestTypeProgression(String testType, String planName)
			throws Exception {
		List result = pTestInstanceFinalDAO
				.getTestInstanceFinalByTestTypeAndPlanName(testType, planName);
		if (result.size() > 0) {
			return ((PTestInstanceFinal) result.get(0)).getTestType();
		}
		return null;
	}

	@Override
	public List<DtwIntegration> getActiveTestPlanList()
			throws Exception {
		// TODO Auto-generated method stub
		return testPlanListDAO.getActiveTestPlanListByProgramName();

	}

	@Override
	public List<PDefectsFinal> getLaunchGatingDefects(String planName)
			throws Exception {

		return pDefectsFinalDAO.getLaunchGatingDefectsByPlanName(planName);
	}
	@Override
	public List<PDefectsFinal> getAllDefectsInformationPopup(String planName,
			String status, String priority, String pCheck, String pClosedFlag)
			throws Exception {
		String hql=constructHQLForAllDefectsInformationPopup(pClosedFlag,priority,status);
		Object[] params=getQueryParameters(planName,status,priority,pCheck,pClosedFlag);
		return (List<PDefectsFinal>)utilityDAO.executeHQL(hql, params);
		
	}

	public Object[] getQueryParameters(String planName,
			String status, String priority, String pCheck, String pClosedFlag){
		List<String> params= new ArrayList<String>();
		params.add(planName);
		params.add(pCheck);
		params.add(pCheck);
		params.add(pCheck);
		params.add(pCheck);
		if(!priority.equalsIgnoreCase("Total")){
			params.add(priority);
		}
		if(!status.equalsIgnoreCase("'Total Unique Issues")){
			params.add(status);
		}
		return params.toArray();
	}
	public String constructHQLForAllDefectsInformationPopup(String pClosedFlag,String priority,String status){
		String hql="select  pdf.defectId "   
       +" ,pdf.item2   "        
       +" ,pdf.status    "         
       +",pdf.priority   "        
       +",pdf.severity    "            
       +",pdf.defectType  "      
       +",pdf.detectedOnDate "      
       +",pdf.closingDate   "
       +"from PDefectsFinal pdf " 
       +"where 1 = 1 "
       +"and pdf.planName=? ";
		if(isLaunchGatingDefect){
			hql=hql+" and pdf.item7 = 'LaunchGating'";
		}
		if(pClosedFlag==null){
			hql=hql+"and pdf.status != 'Closed' ";
		}
		hql=hql+"and (pdf.testType like decode(?,1,'%SIT%',pdf.testType) or pdf.item9 like decode(?,1,'SIT',pdf.item9) or pdf.label like decode(?,1,'%SIT%',pdf.label) and pdf.testType like decode(?,1,'%SIT%',pdf.testType)) ";

		if(!priority.equalsIgnoreCase("Total")){
			hql=hql+" and pdf.priority=? "; 
		}
		if(!status.equalsIgnoreCase("'Total Unique Issues")){
			hql=hql+"and pdf.status=? "; 
		}
		hql=hql+"order by pdf.defectId ";
		return hql;
	}
	@Override
	public List<PDefectsFinal> getLaunchGatingDefectsInformationPopup(
			String planName, String status, String priority, String pCheck,
			String pClosedFlag) throws Exception {
		this.isLaunchGatingDefect=true;
		String hql=constructHQLForAllDefectsInformationPopup(pClosedFlag,priority,status);
		Object[] params=getQueryParameters(planName,status,priority,pCheck,pClosedFlag);
		return (List<PDefectsFinal>)utilityDAO.executeHQL(hql, params);
	}
	@Override
	public List<SITDates> getSITDatesInfo() throws Exception{
		// TODO Auto-generated method stub
		String hql="select tpl.planName "
    +" , max(case when tp.parentId is null " 
         +"  then coalesce(tp.manualColor,tp.colorId)" 
           +" else 1 end)" 
    +" , min(case when tp.task = 'Project kick off' then tp.plannedStartDate "
         +"  else null end) " 
    +" , min(case when tp.task like 'E2E%' then tp.plannedStartDate "
               +" when tp.task like 'SIT%' then tp.plannedStartDate "
          +" else null end) " 
    +" , max(case when tp.task like 'E2E%' then tp.plannedEndDate "
              +"  when tp.task like 'SIT%' then tp.plannedEndDate "
          +" else null end) "  
           
    +" , max(case when tp.task = 'Project deployment' then tp.plannedEndDate "
         +"  else null end "
           +")" 
  +" from TestPlanList tpl "
     +" , TasksPlanning tp "   
  +" where tpl.homePageInd = 'Y' "
  +" and tpl.planName = tp.planName"
  +" group by tpl.planName";
		List<Object[]> sITDatesResults= utilityDAO.executeHQL(hql, null);
		return convertToSITDates(sITDatesResults);
		
	}
	private List<SITDates> convertToSITDates(List<Object[]> sITDatesResults ){
		SITDates sitDateInstance = null;
		List<SITDates> sitDates = new ArrayList<SITDates>();
		for (Object[] row : sITDatesResults) {
			sitDateInstance = new SITDates();
			sitDateInstance.setProject((String) row[0]);
			sitDateInstance.setStatus((BigDecimal) row[1]);
			sitDateInstance.setProjectStart((Date) row[2]);
			sitDateInstance.setSitStart((Date) row[3]);
			sitDateInstance.setSitEnd((Date) row[4]);
			sitDateInstance.setDeployment((Date) row[5]);
			sitDates.add(sitDateInstance);
		}
		return sitDates;
	}
	@Override
	public List<LGDefectsStatusBean> getLGDefectsStatusCount(String planName)
			throws Exception {
		// TODO Auto-generated method stub
		List<LGDefectsStatusBean>  finalLGDefectsStatusCount=new ArrayList<LGDefectsStatusBean>();
		List<Object[]> lgDefectsStatusCountResults=pDefectsFinalDAO.getLGDefectsStatusCount(planName);
		LGDefectsStatusBean lGDefectsStatusBean = null;
		for (Object[] row : lgDefectsStatusCountResults) {
			lGDefectsStatusBean = new LGDefectsStatusBean();
			lGDefectsStatusBean.setStatus((String) row[0]);
			lGDefectsStatusBean.setP0Count((long) row[1]);
			lGDefectsStatusBean.setP2Count((long) row[2]);
			lGDefectsStatusBean.setP1Count((long) row[3]);
			lGDefectsStatusBean.setTotalCount((long) row[4]);
			finalLGDefectsStatusCount.add(lGDefectsStatusBean);
		}
		return finalLGDefectsStatusCount;
	}
	@Override
	public List<AllDefectsStatusBean> getAllDefectsStatusCount(String planName)
			throws Exception {
		// TODO Auto-generated method stub
		List<AllDefectsStatusBean>  finalLGDefectsStatusCount=new ArrayList<AllDefectsStatusBean>();
		List<Object[]> lgDefectsStatusCountResults=pDefectsFinalDAO.getAllDefectsStatusCount(planName);
		AllDefectsStatusBean allDefectsStatusBean = null;
		for (Object[] row : lgDefectsStatusCountResults) {
			allDefectsStatusBean = new AllDefectsStatusBean();
			allDefectsStatusBean.setStatus((String) row[0]);
			allDefectsStatusBean.setP0Count((long) row[1]);
			allDefectsStatusBean.setP1Count((long) row[2]);
			allDefectsStatusBean.setP2Count((long) row[3]);
			allDefectsStatusBean.setP3Count((long) row[4]);
			allDefectsStatusBean.setTotalCount((long) row[5]);
			finalLGDefectsStatusCount.add(allDefectsStatusBean);
		}
		return finalLGDefectsStatusCount;
	}
	
	
	
	@Override
	public List<GhostRiderBean> getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue)
			throws Exception {
		// TODO Auto-generated method stub
		List<GhostRiderBean>  finalLGDefectsStatusCount=new ArrayList<GhostRiderBean>();
		//List<Object[]> lgDefectsStatusCountResults=pDefectsFinalDAO.getGhostRiderTableData(ReportName);
		 finalLGDefectsStatusCount=pDefectsFinalDAO.getGhostRiderTableData(ReportName,startDateValue,endDateValue);
		//AllDefectsStatusBean allDefectsStatusBean = null;
		//for (Object[] row : lgDefectsStatusCountResults) {
		//	allDefectsStatusBean = new AllDefectsStatusBean();
			//allDefectsStatusBean.setStatus((String) row[0]);
		//	allDefectsStatusBean.setP0Count((long) row[1]);
	//		allDefectsStatusBean.setP1Count((long) row[2]);
		//	allDefectsStatusBean.setP2Count((long) row[3]);
	//		allDefectsStatusBean.setP3Count((long) row[4]);
		//	allDefectsStatusBean.setTotalCount((long) row[5]);
	//		finalLGDefectsStatusCount.add(allDefectsStatusBean);
		//}
		return finalLGDefectsStatusCount;
	}
	

	@Override
	public List<MapBean> MapLocation()
			throws Exception {
		// TODO Auto-generated method stub
		List<MapBean>  finalLGDefectsStatusCount=new ArrayList<MapBean>();
		//List<Object[]> lgDefectsStatusCountResults=pDefectsFinalDAO.getGhostRiderTableData(ReportName);
		 finalLGDefectsStatusCount=pDefectsFinalDAO.MapLocation();
		//AllDefectsStatusBean allDefectsStatusBean = null;
		//for (Object[] row : lgDefectsStatusCountResults) {
		//	allDefectsStatusBean = new AllDefectsStatusBean();
			//allDefectsStatusBean.setStatus((String) row[0]);
		//	allDefectsStatusBean.setP0Count((long) row[1]);
	//		allDefectsStatusBean.setP1Count((long) row[2]);
		//	allDefectsStatusBean.setP2Count((long) row[3]);
	//		allDefectsStatusBean.setP3Count((long) row[4]);
		//	allDefectsStatusBean.setTotalCount((long) row[5]);
	//		finalLGDefectsStatusCount.add(allDefectsStatusBean);
		//}
		return finalLGDefectsStatusCount;
	}
	
	
	
	
	
	
	
}
