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
import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.LGDefectsStatusBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.TestPlanList;
import com.deloitte.twb.bean.UtilityBean;
import com.deloitte.twb.dao.PDefectsFinalDAO;
@Repository
public class PDefectsFinalDAOImpl  implements PDefectsFinalDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<PDefectsFinal> getLaunchGatingDefectsByPlanName(String planName) throws Exception{
		String hql="SELECT pdf FROM PDefectsFinal pdf  where pdf.planName=:planName and item7='LaunchGating'";
		Session session=this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("planName", planName);
		return (List<PDefectsFinal>)query.list();
	}
	@Override
	@Transactional
	public List getAllDefects(String planName) throws Exception {
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "select PDF from PDefectsFinal PDF where planName=:pName";
		Query query = currentSession.createQuery(hql);
		query.setParameter("pName", planName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<PDefectsFinal>) query.list();
	}
	
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch Sit DefectView All																	
	 */
	@Override
	@Transactional
	public List getSitDefectViewAll() throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select project , count(defect_id) total_defects , count(sit_ind) sit_defects , sum(case when status != 'Closed' then 1 else 0 end) total_nc , sum(case when status != 'Closed' and sit_ind = 'SIT' then 1 else 0 end) sit_nc , sum(case when launch like 'LaunchGating%' then 1 else 0 end) total_lg , sum(case when sit_ind = 'SIT' and launch like 'LaunchGating%' then 1 else 0 end) sit_lg , sum(case when launch like 'LaunchGating%' and status != 'Closed' then 1 else 0 end) total_lg_nc , sum(case when sit_ind = 'SIT' and launch like 'LaunchGating%' and status != 'Closed' then 1 else 0 end) sit_lg_nc from (select df.plan_name project , df.defect_id , (case when (df.item_9 like 'E2E' or label like '%E2E%' or test_type like '%SIT%' or test_type like '%E2E%' or label like '%SIT%') then 'SIT' else null end) SIT_IND , df.status status , df.item_7 launch from p_defects_final df ) group by project";
		Query query2 = currentSession.createNativeQuery(hql4);
		//l_value = query2.list();
		return query2.list();
	}
	@Override
	@Transactional
	public List<Object[]> getLGDefectsStatusCount(String planName)
			throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT pdf.status,sum(case when pdf.priority='Blocker/Emergency' then 1 else 0 end),sum(case when pdf.priority='Major/Medium' then 1 else 0 end),sum(case when pdf.priority='Critical/High' then 1 else 0 end),count(pdf) FROM PDefectsFinal pdf  where pdf.planName=:planName and pdf.item7='LaunchGating' group by pdf.status";
		Query query = currentSession.createQuery(hql);
		query.setParameter("planName", planName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<Object[]>) query.list();
	}
	@Override
	@Transactional
	public List<Object[]> getAllDefectsStatusCount(String planName)
			throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT pdf.status,sum(case when pdf.priority='Blocker/Emergency' then 1 else 0 end),sum(case when pdf.priority='Critical/High' then 1 else 0 end),sum(case when pdf.priority='Major/Medium' then 1 else 0 end),sum(case when pdf.priority='Minor/Low' then 1 else 0 end),count(pdf) FROM PDefectsFinal pdf  where pdf.planName=:planName group by pdf.status";
		Query query = currentSession.createQuery(hql);
		query.setParameter("planName", planName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<Object[]>) query.list();
	}
	
	
	@Override
	@Transactional
	public List getstatusCount(String planName,String Category)
			throws Exception {
		// TODO Auto-generated method stub			
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT COUNT (*) as count," + Category + " as pieChartLabel FROM  PDefectsFinal WHERE planName =:planName GROUP BY(" + Category + ")";
		Query query = currentSession.createQuery(hql).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));
		query.setParameter("planName", planName);
		
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<UtilityBean>) query.list();
	}
	
	@Override
	@Transactional
	public List getstatusCount(String planName)
			throws Exception {
		// TODO Auto-generated method stub			
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "select count(pf.status) as count ,pf.status as pieChartLabel,cd.DEFECTCOLOR as color from PDefectsFinal pf JOIN ColorsDefectsStatus cd ON pf.status = cd.STATUS where pf.planName=:planName group by (pf.status,cd.DEFECTCOLOR ) order by pf.status";
		Query query = currentSession.createQuery(hql).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));
		query.setParameter("planName", planName);
		
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<UtilityBean>) query.list();
	}
	

	
	@Override
	@Transactional
	public List getpriority(String planName)
			throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
	//	String hql = "SELECT COUNT (*) as count,priority as pieChartLabel FROM  PDefectsFinal WHERE planName =:planName GROUP BY(priority)";
		String hql =   "select count(pf.priority) as count ,pf.priority as pieChartLabel,cd.defectcolor as color from PDefectsFinal pf JOIN ColorsDefectPriority cd ON pf.priority = cd.defectpriority where pf.planName=:planName  group by (pf.priority,cd.defectcolor ) order by pf.priority";
		Query query = currentSession.createQuery(hql).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));
		query.setParameter("planName", planName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<UtilityBean>) query.list();
	}

	
	@Override
	@Transactional
	public List getTotalCount(String planName)
			throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT COUNT (*) as totalCount FROM  PDefectsFinal WHERE planName =:planName";
		Query query = currentSession.createQuery(hql).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));
		query.setParameter("planName", planName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		return(List<UtilityBean>) query.list();
	}
	
	@Override
	@Transactional
	public List getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue)  throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT pdf FROM GhostRiderBean pdf  where pdf.REPORTNAME='C3 Audit'";
		Query query = currentSession.createQuery(hql);
		//query.setParameter("planName", planName);
		return (List<GhostRiderBean>)query.list();
		//String hql = "SELECT pdf FROM GhostRiderBean pdf  where pdf.REPORTNAME='C3 Audit'";
		//Query query = currentSession.createQuery(hql).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));;
		//query.setParameter("planName", ReportName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
	//	resultList = query.list();
		//return(List<UtilityBean>) query.list();
	}
	
	
	@Override
	@Transactional
	public List MapLocation()  throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT pdf FROM MapBean pdf";
		Query query = currentSession.createQuery(hql);
		//query.setParameter("planName", planName);
		return (List<MapBean>)query.list();
		//String hql = "SELECT pdf FROM GhostRiderBean pdf  where pdf.REPORTNAME='C3 Audit'";
		//Query query = currentSession.createQuery(hql).setResultTransformer(Transformers.aliasToBean(UtilityBean.class));;
		//query.setParameter("planName", ReportName);
		//List<PDefectsFinal> resultList = new<PDefectsFinal> ArrayList();
		//resultList = query.list();
		//return(List<UtilityBean>) query.list();
	}
	
	
	
	
	

}
