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

import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.bean.TestPlanList;
import com.deloitte.twb.dao.TestPlanListDAO;
@Repository
public class TestPlanListDAOImpl implements TestPlanListDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public TestPlanList getTestPlanListByPlanName(String planName) throws Exception{
		String hql="select tpl from TestPlanList tpl where tpl.planName=:planName";
		Session session=this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("planName", planName);
		return (TestPlanList)query.uniqueResult();
	}
	@Override
	@Transactional
	public List<DtwIntegration> getActiveTestPlanListByProgramName() throws Exception{
		String hql="select planName as planName from TestPlanList tpl  where  tpl.homePageInd='Y'";
		Session session=this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql).setResultTransformer(Transformers.aliasToBean(DtwIntegration.class));;
		//query.setParameter("programName", programName);
		return (List<DtwIntegration>)query.list();
	}
	
	
	


	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the sitProgression Value
	 *	input:	1.planName
	 *	output:	sitProgression Value													
	 */
	@Override
	@Transactional
	public List getProgressionLvalueList(String planName) throws Exception {
	//	List l_value = new ArrayList();
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
	 *	output:	sitRegression Value																
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
	 *	output:	automated	Value																		
	 */
	@Override
	@Transactional
	public List getautomatedvalueList(String planName) throws Exception {
	//	List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql2 = "SELECT automated  FROM   TestPlanList "
				+ "WHERE  planName = :pName";
		Query query2 = currentSession.createQuery(hql2);
		query2.setParameter("pName", planName);
	//	l_value = query2.list();
		return query2.list();
	}
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch sit_test_cases																	
	 */
	@Override
	@Transactional
	public List getSitTestCaseDetails() throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql2 = "select tpl.planName  ,count(tif.id), sum(case when status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') then 1 else 0 end)  , sum(case when status in ('PASS','Conditional Pass','Passed') then 1 else 0 end)  , sum(case when status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') then 1 else 0 end)  , sum(case when status = 'Blocked' then 1 else 0 end)  from TestPlanList tpl , PTestInstanceFinal tif where tpl.homePageInd = 'Y' and tpl.planName = tif.planName group by tpl.planName";
		Query query2 = currentSession.createQuery(hql2);
	//	l_value = query2.list();
		return query2.list();
	}
	
	
	

	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch get Sit Defect View																	
	 */
	@Override
	@Transactional
	public List getSitDefectView() throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select project , count(defect_id) total_defects , count(sit_ind) sit_defects , sum(case when status != 'Closed' then 1 else 0 end) total_nc , sum(case when status != 'Closed' and sit_ind = 'SIT' then 1 else 0 end) sit_nc , sum(case when launch like 'Launch%Gating%' then 1 else 0 end) total_lg , sum(case when sit_ind = 'SIT' and launch like 'Launch%Gating%' then 1 else 0 end) sit_lg , sum(case when launch like 'Launch%Gating%' and status != 'Closed' then 1 else 0 end) total_lg_nc , sum(case when sit_ind = 'SIT' and launch like 'Launch%Gating%' and status != 'Closed' then 1 else 0 end) sit_lg_nc from (select tpl.plan_name project , df.defect_id , (case when (label like '%E2E%' or test_type like '%SIT%') then 'SIT' else null end) SIT_IND , df.status status , df.item_7 launch from test_plan_list tpl , p_defects_final df where tpl.home_page_ind = 'Y' and tpl.plan_name = df.plan_name) group by project";
		//String hql2 = "select tpl.planName  ,count(tif.id), sum(case when status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') then 1 else 0 end)  , sum(case when status in ('PASS','Conditional Pass','Passed') then 1 else 0 end)  , sum(case when status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') then 1 else 0 end)  , sum(case when status = 'Blocked' then 1 else 0 end)  from TestPlanList tpl , PTestInstanceFinal tif where tpl.homePageInd = 'Y' and tpl.planName = tif.planName group by tpl.planName";
		Query query2 = currentSession.createNativeQuery(hql4);
		//l_value = query2.list();
		return query2.list();
	}
	
	
	

}
