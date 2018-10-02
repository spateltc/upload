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
import com.deloitte.twb.bean.DtwIntegration;
import com.deloitte.twb.dao.DtwIntegrationDao;

@Repository
public class DtwIntegrationDaoImpl implements DtwIntegrationDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 	Author: Shasahank
	 *	Description: DAO Service Implementation to get Details of  DtwIntegration
	 */
	@Override
	@Transactional
	public List<DtwIntegration> getReadableNames(String planName ,String dtwColumnName,String category) throws Exception {
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select readableName as readableName  from DtwIntegration WHERE planName=:planName and dtwColumnName=:columnName and category=:category"; 
		Query query4 = currentSession.createQuery(hql4).setResultTransformer(Transformers.aliasToBean(DtwIntegration.class));
		query4.setParameter("planName", planName);
		query4.setParameter("columnName", dtwColumnName);
		query4.setParameter("category", category);
		return (List<DtwIntegration>)query4.list();
	}
	
	

	@Override
	@Transactional
	public List<DtwIntegration> getReadableNamesForCategory(String planName)
			throws Exception {
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select readableName as readableName  from DtwIntegration where planName=:planName and dtwColumnName in ('item_1','item_2','item_3','item_4','item_5','item_6','item_7','item_8','item_9','item_10')    AND readableName IS NOT NULL"; 
		Query query4 = currentSession.createQuery(hql4).setResultTransformer(Transformers.aliasToBean(DtwIntegration.class));
		query4.setParameter("planName", planName);
		return (List<DtwIntegration>)query4.list();
	}
	
	@Override
	@Transactional
	public String getcolumnName(String planName,String Category) throws Exception{
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select dtwColumnName from DtwIntegration where planName=:planName and readableName=:Category"; 
		Query query4 = currentSession.createQuery(hql4);
		query4.setParameter("planName", planName);
		query4.setParameter("Category", Category);
		return (String)query4.uniqueResult();
	}
	
	
	
}
