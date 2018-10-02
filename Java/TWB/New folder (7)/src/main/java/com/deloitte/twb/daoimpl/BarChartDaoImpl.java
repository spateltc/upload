package com.deloitte.twb.daoimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.bean.TestSuiteBean;
import com.deloitte.twb.controller.TestSuiteController;
import com.deloitte.twb.dao.BarChartDao;

@Repository
public class BarChartDaoImpl implements BarChartDao {

	@Autowired
	private SessionFactory sessionFactory;
	static Logger log = Logger.getLogger(TestSuiteController.class.getName());
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Result (Distinct TestType)
	 *	input:	1.planName,2.testType1,3.testType2
	 *	output:	Details of the BarChart																PTestInstanceFinal
	 */
	
	@Override
	@Transactional
	public List getDistinctItem(String planName,String testType1,String testType2) throws Exception {
		log.debug("BarChartDaoImpl::getDistinctItem()");
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT DISTINCT ptf.testType  FROM   PTestInstanceFinal ptf  WHERE  planName=:pName and  testType in (:tType1,:tType2)";
		Query query = currentSession.createQuery(hql);
		query.setParameter("pName", planName);
		query.setParameter("tType1", testType1);
		query.setParameter("tType2", testType2);
		log.debug("BarChartDaoImpl::getBarChartDetails()");
		return query.list();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the sitProgression Value
	 *	input:	1.planName
	 *	output:	Details of the BarChart																TestPlanList
	 */																								
	@Override
	@Transactional
	public List getProgressionLvalueList(String planName) throws Exception {
		log.debug("BarChartDaoImpl::getProgressionLvalueList()");
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql1 = "SELECT sitProgression  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query1 = currentSession.createQuery(hql1);
		query1.setParameter("pName", planName);
		//l_value = query1.list();
		log.debug("BarChartDaoImpl::getProgressionLvalueList()");
		return  query1.list();
	}

	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the sitRegression Value
	 *	input:	1.planName
	 *	output:	Details of the BarChart																TestPlanList
	 */
	@Override
	@Transactional
	public List getRegressionLvalueList(String planName) throws Exception {
		log.debug("BarChartDaoImpl::getRegressionLvalueList()");
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql1 = "SELECT sitRegression  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query1 = currentSession.createQuery(hql1);
		query1.setParameter("pName", planName);
	//	l_value = query1.list();
		log.debug("BarChartDaoImpl::getRegressionLvalueList()");
		return query1.list();

		}
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Automated Value
	 *	input:	1.planName
	 *	output:	Details of the BarChart																TestPlanList
	 */
	
	@Override
	@Transactional
	public List getautomatedvalueList(String planName) throws Exception {
		log.debug("BarChartDaoImpl::getautomatedvalueList()");
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql2 = "SELECT automated  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query2 = currentSession.createQuery(hql2);
		query2.setParameter("pName", planName);
		//l_value = query2.list();
		log.debug("BarChartDaoImpl::getautomatedvalueList()");
		return query2.list();
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Item List Which Acts as a Parameter to the Next
	 *	input:	1.planName, 2.RankNum,3.TestType
	 *	output:	Details of the BarChart																	PTestSetFinal
	 */
	@Override
	@Transactional
	public List getItemList(String planName,String testType1,String testType2) throws Exception {
		log.debug("BarChartDaoImpl::getItemList()");
		//List item3list = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select distinct tsf.item3   from PTestSetFinal tsf, PTestInstanceFinal tif 			where tsf.planName =  :pName       and tsf.planName=tif.planName       and tsf.		testSetId=tif.testSetId       and tif.testType in (:tType1,:tType2)	      GROUP BY tsf.item3 order by tsf.item3 ";
		Query query4 = currentSession.createQuery(hql4);
		query4.setParameter("pName", planName);
		query4.setParameter("tType1", testType1);
		query4.setParameter("tType2", testType2);
		//item3list = query4.list();
		log.debug("BarChartDaoImpl::getItemList()");
		return query4.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to BarChart(Component)
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item
	 *	output:	Details of the BarChart																	PTestInstanceFinal
	 */
	@Override
	@Transactional
	public List componentBarcharDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		log.debug("BarChartDaoImpl::componentBarcharDetails()");
		//List componentBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT  coalesce(replace(i.item2,'\"' ,' '),'Not Categorised'),sum( case when i.status in ('PASS','Conditional Pass','Passed')   then 1 else 0 end), sum( case when i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL')  then 1 else 0 end) ,   sum( case when i.status not in ('Failed','EXPECTED_FAILURE','NEW_FAILURE', 'FAIL','PASS','Conditional Pass','Passed') then 1 else 0 end)     FROM       PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1  and i.planName=p.planName  and i.testSetId=p.testSetId    and i.planName =  :pName   and 	i.testType in (:tType1,:tType2) AND p.item3=:Item  AND 1=1 GROUP BY   i.item2  	ORDER BY        i.item2";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2",testType2);
		query5.setParameter("Item", Item);
		//componentBarcharDetailsList = query5.list();
		log.debug("BarChartDaoImpl::componentBarcharDetails()");
		return  query5.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to BarChart(requirement)
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item
	 *	output:	Details of the BarChart																	PTestInstanceFinal
	 */
	
	@Override
	@Transactional
	public List requirementBarcharDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		log.debug("BarChartDaoImpl::requirementBarcharDetails()");
		//List requirementBarcharDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT  coalesce(replace(pr.name,'\"',' '),'Not Categorised'),  sum( case when i.status in ('PASS','Conditional Pass','Passed')   then 1 else 0 end) , sum( case when i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL')  then 1 else 0 end),      sum( case when i.status not in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL','PASS','Conditional Pass','Passed') then 1 else 0 end)     FROM       PTestInstanceFinal i,PTestSetFinal p  ,PReqFinal pr , AlmReqMapping arm WHERE 1=1  and i.planName=p.planNameand i.testSetId=p.testSetId    and i.planName =  :pName   and 	i.testType in (:tType1,:tType2)	    and  i.testId=arm.testId          and  i.planName = arm.planName         and arm.planName=pr.planName         and arm.reqId=pr.reqId	 AND p.item3=:Item AND 1=1  GROUP BY  pr.name  	ORDER BY        pr.name";
		Query query5 = currentSession.createQuery(hql5).set;
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
		//requirementBarcharDetailsList = query5.list();
		log.debug("BarChartDaoImpl::requirementBarcharDetails()");
		return query5.list();
		
	}
	
	/**
	 * 	Author: Shasahank
	 *	Description: Dao Implementation to Fetch the Result Set Related to BarChart(testSet)
	 *	input:	1.planName, 2.RankNum,3.TestType,4.Item
	 *	output:	Details of the BarChart																	PTestInstanceFinal
	 */
	
	@Override
	@Transactional
	public List testSetbarChartDetails(String planName,String testType1,String testType2,String Item) throws Exception {
		log.debug("BarChartDaoImpl::testSetbarChartDetails()");
	//	List testSetbarChartDetailsList = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql5 = "SELECT  coalesce(replace(i.item5,'\"',' '),'Not Categorised'),sum( case when i.status in ('PASS','Conditional Pass','Passed')   then 1 else 0 end) , sum( case when i.status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL')  then 1 else 0 end) ,    sum( case when i.status not in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL','PASS','Conditional Pass','Passed') then 1 else 0 end)  FROM       PTestInstanceFinal i,PTestSetFinal p  WHERE 1=1  and i.planName=p.planName   and i.testSetId=p.testSetId            and i.planName =  :pName   			and 	i.testType in (:tType1,:tType2) AND p.item3=:Item AND 1=1  GROUP BY   i.item5   ORDER BY               i.item5";
		Query query5 = currentSession.createQuery(hql5);
		query5.setParameter("pName", planName);
		query5.setParameter("tType1", testType1);
		query5.setParameter("tType2", testType2);
		query5.setParameter("Item", Item);
		//testSetbarChartDetailsList = query5.list();
		log.debug("BarChartDaoImpl::testSetbarChartDetails()");
		return query5.list();
		
	}
	
	
	
}
