package com.deloitte.twb.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.TestScreenShotBean;
import com.deloitte.twb.dao.TestScreenshotDAO;

@Repository
public class TestScreenshotDAOImpl implements TestScreenshotDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addTestScreenshot(TestScreenShotBean testScreenShotBean) throws Exception {

		this.sessionFactory.getCurrentSession().save(testScreenShotBean);
	}

}
