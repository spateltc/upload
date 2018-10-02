package com.deloitte.twb.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PTestInstanceFinal;
import com.deloitte.twb.bean.UtilityBean;
import com.deloitte.twb.dao.PTestInstanceFinalDAO;

@Repository
public class PTestInstanceFinalDAOImpl implements PTestInstanceFinalDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List getTestInstanceFinalByTestTypeAndPlanName(String testType,
			String planName) throws Exception {
		// TODO Auto-generated method stub
		String hql = " select distinct ptf from PTestInstanceFinal ptf where valueExists(ptf.testType,:testType)>0 and ptf.planName=:planName";
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("testType", testType);
		query.setParameter("planName", planName);
		return query.list();
	}

	@Override
	@Transactional
	public List getDistinctItem(String planName, String testType1
			) throws Exception {

		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT DISTINCT ptf.testType  FROM   PTestInstanceFinal ptf  WHERE  planName=:pName and  testType in (:tType1)";
		Query query = currentSession.createQuery(hql);
		query.setParameter("pName", planName);
		query.setParameter("tType1", testType1);
		//query.setParameter("tType2", testType2);
	//	List results = query.list();
		return query.list();
	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to BarChart(Component) input: 1.planName,
	 * 2.RankNum,3.TestType,4.Item output: Details of the BarChart
	 * PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List<BarChartBean> componentBarcharDetails(String planName, String testType1,
			 String Item) throws Exception {

	//	List componentBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT  coalesce(replace(i.item2,'\"' ,' '),'Not Categorised') AS component,sum( case when i.status in ('PASS','Conditional Pass','Passed')   then 1 else 0 end) AS passed, sum( case when i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL')  then 1 else 0 end) AS failed ,   sum( case when i.status not in ('Failed','EXPECTED_FAILURE','NEW_FAILURE', 'FAIL','PASS','Conditional Pass','Passed')  then 1 else 0 end) AS notcategorized    FROM       PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1  and i.planName=p.planName  and i.testSetId=p.testSetId    and i.planName =  :pName   and 	i.testType in (:tType1) AND p.item3=:Item  AND 1=1 GROUP BY   i.item2  	ORDER BY        i.item2";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		//query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
		//componentBarcharDetailsList = query5.list();
		return (List<BarChartBean>)query5.list();

	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to BarChart(requirement) input: 1.planName,
	 * 2.RankNum,3.TestType,4.Item output: Details of the BarChart
	 * PTestInstanceFinal
	 */

	@Override
	@Transactional
	public List<BarChartBean> requirementBarcharDetails(String planName, String testType1,
			 String Item) throws Exception {

	//	List requirementBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT  coalesce(replace(pr.name,'\"',' '),'Not Categorised') AS component ,  sum( case when i.status in ('PASS','Conditional Pass','Passed')   then 1 else 0 end) AS  passed , sum( case when i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL')  then 1 else 0 end) AS  failed  ,      sum( case when i.status not in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL','PASS','Conditional Pass','Passed') then 1 else 0 end)   AS notcategorized    FROM       PTestInstanceFinal i,PTestSetFinal p  ,PReqFinal pr , AlmReqMapping arm WHERE 1=1  and i.planName=p.planNameand i.testSetId=p.testSetId    and i.planName =  :pName   and 	i.testType in (:tType1)	    and  i.testId=arm.testId          and  i.planName = arm.planName         and arm.planName=pr.planName         and arm.reqId=pr.reqId	 AND p.item3=:Item AND 1=1  GROUP BY  pr.name  	ORDER BY        pr.name";
		Query query5 = currentSession.createQuery(hql5).setResultTransformer(Transformers.aliasToBean(BarChartBean.class));
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		//query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	requirementBarcharDetailsList = query5.list();
		return  (List<BarChartBean>)query5.list();
	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to BarChart(testSet) input: 1.planName,
	 * 2.RankNum,3.TestType,4.Item output: Details of the BarChart
	 * PTestInstanceFinal
	 */

	@Override
	@Transactional
	public List<BarChartBean> testSetbarChartDetails(String planName, String testType1,
			String Item) throws Exception {

		//List testSetbarChartDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT  coalesce(replace(i.item5,'\"',' '),'Not Categorised') AS component ,sum( case when i.status in ('PASS','Conditional Pass','Passed')   then 1 else 0 end) AS  passed , sum( case when i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL')  then 1 else 0 end) AS  failed ,    sum( case when i.status not in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL','PASS','Conditional Pass','Passed') then 1 else 0 end) AS notcategorized  FROM       PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1  and i.planName=p.planName   and i.testSetId=p.testSetId            and i.planName =  :pName   			and 	i.testType in (:tType1) AND p.item3=:Item AND 1=1  GROUP BY   i.item5   ORDER BY               i.item5";
		Query query5 = currentSession.createQuery(hql5).setResultTransformer(Transformers.aliasToBean(BarChartBean.class));
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		//query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	testSetbarChartDetailsList = query5.list();
		return (List<BarChartBean>)query5.list();

	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to webChart(Component) input: 1.planName,
	 * 2.RankNum,3.TestType,4.Item PTestInstanceFinal output: Details of the
	 * webChart
	 */
	@Override
	@Transactional
	public List componentReportDetails(String planName, String testType1,
			 String Item) throws Exception {
	//	List componentBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT i.item2, sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) AS notcategorized FROM PTestInstanceFinal i,PTestSetFinal p WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1) and p.item3 = :Item GROUP BY p.item3, i.item2 ORDER BY i.item2";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		//query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	componentBarcharDetailsList = query5.list();
		return query5.list();

	}

	/**
	 * Author: Shasahank Description: Total Count of the Above Query input:
	 * 1.planName, 2.RankNum,3.TestType,4.Item output: Details of the webChart
	 * PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List unionComponentReportDetails(String planName, String testType1,
			String Item) throws Exception {
	//	List componentBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1) and p.item3 = :Item ORDER BY i.item2 ";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		//query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	componentBarcharDetailsList = query5.list();
		return query5.list();

	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to WebChart(requirement) input: 1.planName,
	 * 2.RankNum,3.TestType,4.Item output: Details of the WebChart
	 * PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List requirementReportcharDetails(String planName, String testType1,
			 String Item) throws Exception {
	//	List requirementBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT pr.name, sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p,PReqFinal pr,AlmReqMapping arm WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1) and i.testId=arm.testId and i.planName = arm.planName and arm.planName=pr.planName and arm.reqId=pr.reqId and p.item3 = :Item GROUP BY p.item3, pr.name ORDER BY pr.name";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		//query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	requirementBarcharDetailsList = query5.list();
		return query5.list();

	}

	/**
	 * Author: Shasahank Description: Total Count of the Above Query input:
	 * 1.planName, 2.RankNum,3.TestType,4.Item output: Details of the WebChart
	 * PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List unionRequirementReportcharDetails(String planName,
			String testType1,  String Item) throws Exception {
	//	List requirementBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p ,PReqFinal pr,AlmReqMapping arm  WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1)   and i.testId=arm.testId and i.planName = arm.planName and arm.planName=pr.planName and arm.reqId=pr.reqId  and p.item3 = :Item ORDER BY pr.name ";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
	//	query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
		//requirementBarcharDetailsList = query5.list();
		return  query5.list();

	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to WebChart(testSet) input: 1.planName,2.TestTypes,3.Item output:
	 * Details of the BarChart PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List testSetReportDetails(String planName, String testType1,
			 String Item) throws Exception {
	//	List testSetbarChartDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT i.item5, sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1) and p.item3 = :Item GROUP BY p.item3, i.item5 ORDER BY i.item5";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
	//	query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
	//	testSetbarChartDetailsList = query5.list();
		return query5.list();

	}

	/**
	 * Author: Shasahank Description: Dao Implementation to Fetch the Result Set
	 * Related to WebChart(testSet) input: 1.planName, 2.TestTypes,3.Item
	 * output: Details of the BarChart PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List unionTestSetReportDetails(String planName, String testType1,
			String Item) throws Exception {
	//	List testSetbarChartDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select sum(CASE WHEN i.status not in ('N/A','Not Applicable') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') THEN 1 ELSE 0 END) , SUM( CASE WHEN i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('PASS','Conditional Pass','Passed') THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status='Blocked' THEN 1 ELSE 0 END ) , SUM( CASE WHEN i.status in ('Untested','In Progress','NOT_RUN','No Run','Not Completed') THEN 1 ELSE 0 END ) FROM PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1 and i.planName=p.planName and i.testSetId=p.testSetId and i.planName = :pName and i.testType in (:tType1) and p.item3 = :Item ORDER BY i.item5";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		///query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
		//testSetbarChartDetailsList = query5.list();
		return query5.list();

	}
	
	
	
	/**
	 * Author: Shasahank
	 * Description: Dao Implementation to Fetch Details of PopUpBar Chart
	 * Params: 1.planName, 2.TestTypes,3.component,4.status
	 * output: Details of the BarChart PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List getpopupBarchartDetails(String planName, String testType1,
			String component, String cycleName, String status) throws Exception {
	//	List<PTestInstanceFinal> popupBarchartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status,name,coalesce(item2,'Not Categorized'),testType FROM PTestInstanceFinal WHERE planName = :pName AND coalesce(testType,'Not Categorized')  =  coalesce(:tType1,testType) AND coalesce(item2,'Not Categorized')   =  coalesce(:component,item2) AND item3=:cycleName and status in (:status)";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("tType1",testType1);
		query5.setParameter("component",component);
		query5.setParameter("status", status);
		query5.setParameter("cycleName",cycleName);
		//popupBarchartDetails = query5.list();
		return (List<PTestInstanceFinal>) query5.list(); 
	}
	
	
	
	
	/**
	 * Author: Shasahank
	 * Description: Dao Implementation to Fetch Details of PopUp Pie Chart
	 * Params: 1.planName, 2.TestTypes,3.status
	 * output: Details of the BarChart PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List getpopupPiechartDetails(String planName, String testType1,String cycleName,String status) throws Exception {
	//	List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status,name,coalesce(item2,'Not Categorized') ,testType FROM PTestInstanceFinal WHERE planName = :pName AND coalesce(testType,'Not Categorized')   =  coalesce(:tType1,testType) AND item3=:cycleName AND status = :status";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("tType1",testType1);
		query5.setParameter("status", status);
		query5.setParameter("cycleName",cycleName);
	//	popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	
	
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getTotalExecutedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item3=:cycleName and  status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("cycleName",cycleName);
	//	popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getTotalFailedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
	//	List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item3=:cycleName and status in ('Failed','EXPECTED_FAILURE')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("cycleName",cycleName);
	//	popupPiechartDetails = query5.list();
		return  (List<PTestInstanceFinal>)query5.list(); 
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getTotalPassedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
	//	List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item3=:cycleName and  status in ('PASS','Conditional Pass','Passed')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getTotalBlockedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
	//	List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = " SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item3=:cycleName and status = 'Blocked'";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}

	
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getTotalUntestedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item3=:cycleName  and status in ('Untested','In Progress','NOT_RUN')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	

	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getExecutedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item2 =:component  AND item3=:cycleName  and status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("component",component);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getFailedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = " SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item2 =:component AND item3=:cycleName  and status in ('Failed','EXPECTED_FAILURE')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("component",component);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getPassedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
	//	List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item2 =:component AND item3=:cycleName  and status in ('PASS','Conditional Pass','Passed')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("component",component);
		query5.setParameter("cycleName",cycleName);
	//	popupPiechartDetails = query5.list();

		return (List<PTestInstanceFinal>)query5.list();
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getBlockedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = " SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item2 =:component and item3=:cycleName  and status = 'Blocked' ";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("component",component);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	

	/**
	 * 	Author: Shasahank
	 *	Description:  DAO Implementation to Fetches popUpWebTable Details  
	 *	input:PlanName,component,column,testType1
	 *	output:list of all popUpWebTable Details For a plan(PTestInstanceFinal)
	 */
	@Override
	@Transactional
	public List getUntestedPopupWebDetails(String planName,String component,String column,String cycleName,String testType1) throws Exception{
		//List<PTestInstanceFinal> popupPiechartDetails = new<PTestInstanceFinal> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT status, name, priority, coalesce(item2,'Not Categorized'), testType FROM PTestInstanceFinal WHERE planName =:pName and testType=:testType1 AND item2 =:component and  item3=:cycleName  and status in ('Untested','In Progress','NOT_RUN')";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		query5.setParameter("testType1",testType1);
		query5.setParameter("component",component);
		query5.setParameter("cycleName",cycleName);
		//popupPiechartDetails = query5.list();
		return (List<PTestInstanceFinal>)query5.list();
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Distinct Data for Dsr Screen   
	 *	input:PlanName
	 */
	
	@Override
	@Transactional
	public List distinctDataForDsr(String planName)throws Exception{
		//List list = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "select distinct item3,testType,planName from PTestInstanceFinal where planName=:pName and testType IS NOT NULL  order by testType,item3";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName",planName);
		//list = query5.list();
		return query5.list();
	}

	@Override
	@Transactional
	public List getstatusPassedFailedCount(String planName,String columnName)throws Exception{
		Session currentSession = this.sessionFactory.getCurrentSession();
		
		//String hql5 = "SELECT  coalesce(replace(item2,'\"' ,' '),'Not Categorised') AS component,sum( case when status in ('PASSED','Passed')   then 1 else 0 end) AS passedCount,sum( case when status in ('FAILED','Failed')  then 1 else 0 end) AS failedCount ,sum( case when status not in ('PASSED','Passed','FAILED', 'Failed')  then 1 else 0 end) AS OthersCount,  sum( case when 1  in (1)  then 1 else 0 end) AS totalCount FROM       PTestInstanceFinal WHERE planName =  :pName  GROUP BY  item2  ORDER BY  item2";
		String hql5 = "select count(*) as count ,status as status ," + columnName + " as component from PTestInstanceFinal WHERE planName = :pName  group by status," + columnName + " order by  " + columnName + "";
		Query query = currentSession.createQuery(hql5).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));
		//Query query5 = currentSession.createQuery(hql5);
		query.setParameter("pName",planName);
		//query.setParameter("columnName",columnName);
		return (List<UtilityBean>)query.list();
	}
	
	
	@Override
	@Transactional
	public List<UtilityBean> distinctStatus(String planName)throws Exception{
		Session currentSession = this.sessionFactory.getCurrentSession();
		//String hql5 = "select distinct(status) as status from PTestInstanceFinal WHERE planName =:pName";
		String hql5 ="select distinct(pf.status) as status ,ct.color as color	from PTestInstanceFinal pf left join   ColorsTestCasesStatus ct on pf.status=ct.status where  pf.planName =:pName";
		Query query = currentSession.createQuery(hql5).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));
		query.setParameter("pName",planName);
		return (List<UtilityBean>)query.list();
	}
	
	
	
	
	
}
