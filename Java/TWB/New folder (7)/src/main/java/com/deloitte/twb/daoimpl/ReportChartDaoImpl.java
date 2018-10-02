package com.deloitte.twb.daoimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.TestSuiteBean;
import com.deloitte.twb.dao.BarChartDao;
import com.deloitte.twb.dao.ReportChartDao;

@Repository
public class ReportChartDaoImpl implements ReportChartDao {

	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Result (Distinct TestType)
	 *	input:	1.planName,2.testType1,3.testType2
	 *	output:	Details of the WebChart																PTestInstanceFinal
	 */
	
	@Override
	@Transactional
	public List getDistinctItem(String planName,String testType1,String testType2) throws Exception {
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT DISTINCT ptf.testType  FROM   PTestInstanceFinal ptf  WHERE  planName=:pName and  testType in (:tType1,:tType2)";
		Query query = currentSession.createQuery(hql);
		query.setParameter("pName", planName);
		query.setParameter("tType1", testType1);
		query.setParameter("tType2", testType2);
		//List results = query.list();
		return query.list();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the sitProgression Value
	 *	input:	1.planName
	 *	output:	Details of the WebChart															TestPlanList
	 */
	@Override
	@Transactional
	public List getProgressionLvalueList(String planName) throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql1 = "SELECT sitProgression  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query1 = currentSession.createQuery(hql1);
		query1.setParameter("pName", planName);
		//l_value = query1.list();
		return query1.list();
	}

	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the sitRegression Value
	 *	input:	1.planName
	 *	output:	Details of the WebChart																TestPlanList
	 */
	@Override
	@Transactional
	public List getRegressionLvalueList(String planName) throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql1 = "SELECT sitRegression  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query1 = currentSession.createQuery(hql1);
		query1.setParameter("pName", planName);
		//l_value = query1.list();
		return query1.list();

		}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Automated Value
	 *	input:	1.planName
	 *	output:	Details of the WebChart																			TestPlanList
	 */
	@Override
	@Transactional
	public List getautomatedvalueList(String planName) throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql2 = "SELECT automated  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query2 = currentSession.createQuery(hql2);
		query2.setParameter("pName", planName);
		//l_value = query2.list();
		return query2.list();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Item List Which Acts as a Parameter to the Next
	 *	input:	1.planName, 2.RankNum,3.TestType
	 *	output:	Details of the webChart																	PTestSetFinal
	 */
	@Override
	@Transactional
	public List getItemList(String planName,String testType1,String testType2) throws Exception {
		//List item3list = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select distinct tsf.item3   from PTestSetFinal tsf, PTestInstanceFinal tif 			where tsf.planName =  :pName       and tsf.planName=tif.planName       and tsf.		testSetId=tif.testSetId       and tif.testType in (:tType1,:tType2)	      GROUP BY tsf.item3 order by tsf.item3 ";
		Query query4 = currentSession.createQuery(hql4);
		query4.setParameter("pName", planName);
		query4.setParameter("tType1", testType1);
		query4.setParameter("tType2", testType2);
	//	item3list = query4.list();
		return query4.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to webChart(Component)
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item															PTestInstanceFinal
	 *	output:	Details of the webChart
	 */
	@Override
	@Transactional
	public List componentReportDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		//List componentBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT i.item2, sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1,:tType2) and p.item3 = :Item GROUP BY p.item3, i.item2 ORDER BY i.item2";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2",testType2);
		query5.setParameter("Item", Item);
		//componentBarcharDetailsList = query5.list();
		return query5.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Total Count of the Above Query
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item
	 *	output:	Details of the webChart																		PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List unionComponentReportDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		//List componentBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1,:tType2) and p.item3 = :Item ORDER BY i.item2 ";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2",testType2);
		query5.setParameter("Item", Item);
	//	componentBarcharDetailsList = query5.list();
		return query5.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to WebChart(requirement)
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item
	 *	output:	Details of the WebChart															PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List requirementReportcharDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		//List requirementBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT pr.name, sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p,PReqFinal pr,AlmReqMapping arm WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1,:tType2) and i.testId=arm.testId and i.planName = arm.planName and arm.planName=pr.planName and arm.reqId=pr.reqId and p.item3 = :Item GROUP BY p.item3, pr.name ORDER BY pr.name";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	requirementBarcharDetailsList = query5.list();
		return query5.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Total Count of the Above Query
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item
	 *	output:	Details of the WebChart															PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List unionRequirementReportcharDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		//List requirementBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p ,PReqFinal pr,AlmReqMapping arm  WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1,:tType2)   and i.testId=arm.testId and i.planName = arm.planName and arm.planName=pr.planName and arm.reqId=pr.reqId  and p.item3 = :Item ORDER BY pr.name ";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	requirementBarcharDetailsList = query5.list();
		return query5.list();
		
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to WebChart(testSet)
	 *	input:	1.planName,2.TestTypes,3.Item
	 *	output:	Details of the BarChart																			PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List testSetReportDetails(String planName,String testType1,String testType2,String Item) throws Exception {
	//	List testSetbarChartDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT i.item5, sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1,:tType2) and p.item3 = :Item GROUP BY p.item3, i.item5 ORDER BY i.item5";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	testSetbarChartDetailsList = query5.list();
		return query5.list();
		
	}
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to WebChart(testSet)
	 *	input:	1.planName, 2.TestTypes,3.Item
	 *	output:	Details of the BarChart																					PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List unionTestSetReportDetails(String planName,String testType1,String testType2,String Item) throws Exception {
	//	List testSetbarChartDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1,:tType2) and p.item3 = :Item ORDER BY i.item5";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	testSetbarChartDetailsList = query5.list();
		return query5.list();
		
	}
	
	
	
}
