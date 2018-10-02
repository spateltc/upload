package com.deloitte.twb.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.TestStepsBean;
import com.deloitte.twb.dao.TestStepsDAO;

@Repository
public class TestStepsDAOImpl implements TestStepsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addTestSteps(TestStepsBean testStepsBean)throws Exception {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(testStepsBean);
	}

}
