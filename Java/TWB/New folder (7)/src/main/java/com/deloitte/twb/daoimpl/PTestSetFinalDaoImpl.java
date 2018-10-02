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


import com.deloitte.twb.dao.PTestSetFinalDao;

@Repository
public class PTestSetFinalDaoImpl implements PTestSetFinalDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 	Author: Shasahank
	 *	Description: DAO Implementation to Fetch the Item List Which Acts as a Parameter to the Next
	 *	input:	1.planName, 2.RankNum,3.TestType
	 *	output:	Details of the webChart																	PTestSetFinal
	 */
	@Override
	@Transactional
	public List getItemList(String planName,String testType1) throws Exception {
		//List item3list = new ArrayList();
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql4 = "select distinct tsf.item3   from PTestSetFinal tsf, PTestInstanceFinal tif 			where tsf.planName =  :pName       and tsf.planName=tif.planName       and tsf.		testSetId=tif.testSetId       and tif.testType in (:tType1)	      GROUP BY tsf.item3 order by tsf.item3 ";
		Query query4 = currentSession.createQuery(hql4);
		query4.setParameter("pName", planName);
		query4.setParameter("tType1", testType1);
		//query4.setParameter("tType2", testType2);
		//item3list = query4.list();
		return  query4.list();
		
	}
	
	
	
	
	
	
	
}
