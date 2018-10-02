package com.deloitte.twb.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.dao.GhostRiderDao;
@Repository
public class GhostRiderDAOImpl  implements GhostRiderDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue,String location)  throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT pdf FROM GhostRiderBean pdf  where pdf.REPORTNAME=:ReportName and  LOCATION=:location and TO_CHAR(ADD_TIMESTAMP ,'yyyy-mm-dd')  BETWEEN :startDateValue AND :endDateValue order by ADD_TIMESTAMP desc";
		Query query = currentSession.createQuery(hql);
		query.setParameter("ReportName", ReportName);
		query.setParameter("startDateValue", startDateValue);
		query.setParameter("endDateValue", endDateValue);
		query.setParameter("location", location);
		return (List<GhostRiderBean>)query.list();
	}
	
	
	/*@Override
	@Transactional
	public List MapLocation()  throws Exception {
		// TODO Auto-generated method stub
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "SELECT pdf FROM MapBean pdf";
		Query query = currentSession.createQuery(hql);
		return (List<MapBean>)query.list();
	}*/
	
	@Override
	@Transactional
	public List MapLocation() throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "SELECT distinct(GHOSTRIDER_REPORT.location) AS LOCATION,first_value(GHOSTRIDER_REPORT.ADD_TIMESTAMP ) over (partition by GHOSTRIDER_REPORT.location order by GHOSTRIDER_REPORT.ADD_TIMESTAMP desc) AS TSTAMP,first_value(GHOSTRIDER_REPORT.status_color) over (partition by GHOSTRIDER_REPORT.location order by GHOSTRIDER_REPORT.ADD_TIMESTAMP desc) AS COLOR,GHOST_RIDER_LOCATION.LONGITUDE AS LONGITUDE,GHOST_RIDER_LOCATION.LATITUDE AS LATITUDE FROM GHOSTRIDER_REPORT INNER  JOIN GHOST_RIDER_LOCATION ON GHOST_RIDER_LOCATION.LOCATION=GHOSTRIDER_REPORT.LOCATION";
		//String hql2 = "select tpl.planName  ,count(tif.id), sum(case when status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') then 1 else 0 end)  , sum(case when status in ('PASS','Conditional Pass','Passed') then 1 else 0 end)  , sum(case when status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') then 1 else 0 end)  , sum(case when status = 'Blocked' then 1 else 0 end)  from TestPlanList tpl , PTestInstanceFinal tif where tpl.homePageInd = 'Y' and tpl.planName = tif.planName group by tpl.planName";
		Query query2 = currentSession.createNativeQuery(hql4).setResultTransformer(Transformers.aliasToBean(MapBean.class));
		//l_value = query2.list();
		return (List<MapBean>)query2.list();
	}
	
	
	@Override
	@Transactional
	public List getbotsReport() throws Exception {
		//List l_value = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "SELECT distinct(GHOSTRIDER_REPORT.location) AS LOCATION,first_value(GHOSTRIDER_REPORT.ADD_TIMESTAMP ) over (partition by GHOSTRIDER_REPORT.location order by GHOSTRIDER_REPORT.ADD_TIMESTAMP desc) AS TSTAMP,first_value(GHOSTRIDER_REPORT.status_color) over (partition by GHOSTRIDER_REPORT.location order by GHOSTRIDER_REPORT.ADD_TIMESTAMP desc) AS COLOR,GHOST_RIDER_LOCATION.LONGITUDE AS LONGITUDE,GHOST_RIDER_LOCATION.LATITUDE AS LATITUDE FROM GHOSTRIDER_REPORT INNER  JOIN GHOST_RIDER_LOCATION ON GHOST_RIDER_LOCATION.LOCATION=GHOSTRIDER_REPORT.LOCATION";
		//String hql2 = "select tpl.planName  ,count(tif.id), sum(case when status in ('Failed','PASS','Conditional Pass','Passed','EXPECTED_FAILURE','Retest','NEW_FAILURE') then 1 else 0 end)  , sum(case when status in ('PASS','Conditional Pass','Passed') then 1 else 0 end)  , sum(case when status in ('Failed','EXPECTED_FAILURE','NEW_FAILURE','FAIL') then 1 else 0 end)  , sum(case when status = 'Blocked' then 1 else 0 end)  from TestPlanList tpl , PTestInstanceFinal tif where tpl.homePageInd = 'Y' and tpl.planName = tif.planName group by tpl.planName";
		Query query2 = currentSession.createNativeQuery(hql4).setResultTransformer(Transformers.aliasToBean(MapBean.class));
		//l_value = query2.list();
		return (List<MapBean>)query2.list();
	}
	


}
