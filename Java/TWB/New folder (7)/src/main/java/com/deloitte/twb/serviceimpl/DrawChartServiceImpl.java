package com.deloitte.twb.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.PcommentsBean;
import com.deloitte.twb.bean.ReportBean;
import com.deloitte.twb.bean.UtilityBean;
import com.deloitte.twb.constants.TestTypeConstants;
import com.deloitte.twb.dao.DtwIntegrationDao;
import com.deloitte.twb.dao.PDefectsFinalDAO;
import com.deloitte.twb.dao.PTestInstanceFinalDAO;
import com.deloitte.twb.dao.PTestSetFinalDao;
import com.deloitte.twb.dao.PcommentsDao;
import com.deloitte.twb.dao.ReportChartDao;
import com.deloitte.twb.dao.TestPlanListDAO;
import com.deloitte.twb.service.DrawChartService;
import com.deloitte.twb.service.ReportService;

@Service
public class DrawChartServiceImpl implements  DrawChartService{

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
	
	@Autowired
	DtwIntegrationDao dtwIntegrationDao;
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Services to get the WebChart Details 
	 *	input:1.PlanName 2.RankNum 3.testType
	 *	output:list of all defects For a plan(pdefectsFinal) 
	 */
	

	public List drawChart(String planName, String Entity,String Category,String chartType)throws Exception
	{
		List TotalCount = pDefectsFinalDao.getTotalCount(planName);	
		Long TotalCoun = null ;
		List<UtilityBean> resStatusCount = new ArrayList<UtilityBean>();
		List<UtilityBean> respriorityCount = new ArrayList<UtilityBean>();
		if (TotalCount != null) {
			for (int i = 0; i <= TotalCount.size() - 1; i++) {
				UtilityBean totallistObjects = (UtilityBean) TotalCount.get(i);
				TotalCoun = totallistObjects.getTotalCount();
			}
		}
		int foo = Integer.parseInt(Entity);
		if(Category.equals("status") && chartType.equals("PieChart") ){
			List<UtilityBean> statusCount = pDefectsFinalDao.getstatusCount(planName);
			
			if (statusCount != null) {
				for (int i = 0; i <= statusCount.size() - 1; i++) {
					UtilityBean totallistObjects = (UtilityBean) statusCount.get(i);
					Long Count = (Long) totallistObjects.getCount();
					int Percentage = (int) Math.round( Count * 100.0 / TotalCoun);
					totallistObjects.setPercentage(Percentage);	

					resStatusCount.add(totallistObjects);
				}
			}			
			return resStatusCount;
		}
		else if(chartType.equals("BarChrat")){
			//Test Type Should be handled  
			
			//testType
			if(Category.equals("0")){
				List<UtilityBean> statusCount = pTestInstanceFinalDao.getstatusPassedFailedCount(planName,"testType");
				return statusCount;
				
			}
			String columnName = dtwIntegrationDao.getcolumnName(planName,Category);
			if(columnName!=null){
				char l = columnName.charAt(columnName.length() - 1);
				String column;
				if(l == '0'){
					 column = "item"+"10";	
				}
				else{
					 column = "item"+l;	
				}
				
				List<UtilityBean> statusCount = pTestInstanceFinalDao.getstatusPassedFailedCount(planName,column);
				return statusCount;
			}
			
		}
		else if(Category.equals("priority") ){
			List<UtilityBean> totalCountList= pDefectsFinalDao.getpriority(planName);
			
			
			if (totalCountList != null) {
				for (int i = 0; i <= totalCountList.size() - 1; i++) {
					UtilityBean totallistObjects = (UtilityBean) totalCountList.get(i);
					Long Count = (Long) totallistObjects.getCount();
					int Percentage = (int) Math.round( Count * 100.0 / TotalCoun);
					totallistObjects.setPercentage(Percentage);	
					
					respriorityCount.add(totallistObjects);
				}   
			}	
			
			return respriorityCount;
		}
		
		 
	
		return null;
	}
	
	
	
	public List<PTestInstanceFinal> distinctStatus(String planName ) throws Exception{
		return (List<PTestInstanceFinal>)pTestInstanceFinalDao.distinctStatus( planName );
	}
	
}
