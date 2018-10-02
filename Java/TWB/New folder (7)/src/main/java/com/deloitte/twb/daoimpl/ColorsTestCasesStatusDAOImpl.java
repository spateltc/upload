package com.deloitte.twb.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.ColorsTestCasesStatus;
import com.deloitte.twb.bean.TestPlanList;
import com.deloitte.twb.dao.ColorsTestCasesStatusDAO;
@Repository
public class ColorsTestCasesStatusDAOImpl implements ColorsTestCasesStatusDAO{


	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public ColorsTestCasesStatus getColorsTestCasesStatusByStatus(String status) throws Exception {
		// TODO Auto-generated method stub
		String hql="select d from ColorsTestCasesStatus d where d.status=:status";
		Session session=this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("status", status);
		return (ColorsTestCasesStatus)query.uniqueResult();
		
	}

}
