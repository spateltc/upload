package com.deloitte.twb.daoimpl;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.TestCaseBean;
import com.deloitte.twb.dao.TestCaseDAO;

@Repository
public class TestCaseDAOImpl implements TestCaseDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public BigDecimal addTestCase(TestCaseBean testCaseBean) throws Exception{

		Session currentSession = this.sessionFactory.getCurrentSession();
		TestCaseBean testCaseBeanNew = (TestCaseBean) currentSession
				.merge(testCaseBean);
		return testCaseBeanNew.getId();
	}

}
