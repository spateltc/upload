package com.deloitte.twb.daoimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




import com.deloitte.twb.bean.BarChartBean;
import com.deloitte.twb.dao.DtwProgramListDAO;

@Repository
public class DtwProgramListDAOImpl implements DtwProgramListDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 	Author: Shasahank
	 *	Description: DAO Service Implementation to get list of Program names
	 */
	@Override
	@Transactional
	public List getProgramNames() throws Exception {
		//List<String> resultList = new<String> ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		//String hql4 = "select project , count(defect_id) total_defects , count(sit_ind) sit_defects , sum(case when status != 'Closed' then 1 else 0 end) total_nc , sum(case when status != 'Closed' and sit_ind = 'SIT' then 1 else 0 end) sit_nc , sum(case when launch like 'Launch%Gating%' then 1 else 0 end) total_lg , sum(case when sit_ind = 'SIT' and launch like 'Launch%Gating%' then 1 else 0 end) sit_lg , sum(case when launch like 'Launch%Gating%' and status != 'Closed' then 1 else 0 end) total_lg_nc , sum(case when sit_ind = 'SIT' and launch like 'Launch%Gating%' and status != 'Closed' then 1 else 0 end) sit_lg_nc from (select tpl.plan_name project , df.defect_id , (case when (label like '%E2E%' or test_type like '%SIT%') then 'SIT' else null end) SIT_IND , df.status status , df.item_7 launch from test_plan_list tpl , p_defects_final df where tpl.home_page_ind = 'Y' and tpl.plan_name = df.plan_name) group by project"; 
		String hql4 = "select DISTINCT testPlanType as planName from DTWPrograms PDF"; 
		//String hql4 = "SELECT project , Count(defectid) AS total_defects , Count(sit_ind) AS sit_defects , SUM( CASE WHEN status != 'Closed' THEN 1 ELSE 0 END) AS total_nc , SUM( CASE WHEN status != 'Closed' AND sit_ind = 'SIT' THEN 1 ELSE 0 END) AS sit_nc , SUM( CASE WHEN launch LIKE 'Launch%Gating%' THEN 1 ELSE 0 END) AS total_lg , SUM( CASE WHEN sit_ind = 'SIT' AND launch LIKE 'Launch%Gating%' THEN 1 ELSE 0 END) AS sit_lg , SUM( CASE WHEN launch LIKE 'Launch%Gating%' AND status != 'Closed' THEN 1 ELSE 0 END) AS total_lg_nc , SUM( CASE WHEN sit_ind = 'SIT' AND launch LIKE 'Launch%Gating%' AND status != 'Closed' THEN 1 ELSE 0 END) AS sit_lg_nc FROM ( SELECT tpl.planname AS project , df.defectid, ( CASE WHEN ( label LIKE '%E2E%' OR test_type LIKE '%SIT%') THEN 'SIT' ELSE NULL END) AS sit_ind , df.status AS status , df.item7 AS launch FROM testplanlist tpl , pdefectsfinal df WHERE tpl.homepageind = 'Y' AND tpl.planname = df.planname ) GROUP BY tpl.planname";
		Query query4 = currentSession.createQuery(hql4).setResultTransformer(Transformers.aliasToBean(BarChartBean.class));
		//resultList = query4.list();
		return (List<BarChartBean>)query4.list();
		
	}
	
	//select tpl.planName as project , df.defectId , (case when (label like '%E2E%' or test_type like '%SIT%') then 'SIT' else null end) as SIT_IND , df.status as status , df.item7 as launch from TestPlanList tpl , PDefectsFinal df where tpl.homePageInd = 'Y' and tpl.planName = df.planName
	
	//select DISTINCT testPlanType from DTWPrograms PDF
	
}
