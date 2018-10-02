package com.deloitte.twb.daoimpl;

import java.util.List;

import javax.swing.text.Utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.dao.UtilityDAO;

@Repository
public class UtilityDAOImpl implements UtilityDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List executeHQL(String hql, Object[] params) throws Exception{
		// TODO Auto-generated method stub
		Object retVal = null;
		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createQuery(hql);
		if(params!=null && params.length>0){
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		}
		return query.list();

	}

}
