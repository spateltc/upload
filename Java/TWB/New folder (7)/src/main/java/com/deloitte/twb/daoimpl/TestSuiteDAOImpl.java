package com.deloitte.twb.daoimpl;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.TestSuiteBean;
import com.deloitte.twb.dao.TestSuiteDAO;

@Repository
public class TestSuiteDAOImpl implements TestSuiteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public BigDecimal addTestSuite(TestSuiteBean testSuiteBean) throws Exception{

		Session currentSession = this.sessionFactory.getCurrentSession();
		TestSuiteBean testSuiteBeanNew = (TestSuiteBean) currentSession
				.merge(testSuiteBean);
		return testSuiteBeanNew.getId();
	}

}
