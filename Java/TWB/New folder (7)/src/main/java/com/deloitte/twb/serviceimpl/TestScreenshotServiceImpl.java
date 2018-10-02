package com.deloitte.twb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.TestScreenShotBean;
import com.deloitte.twb.dao.TestScreenshotDAO;
import com.deloitte.twb.service.TestScreenshotService;

@Service
public class TestScreenshotServiceImpl implements TestScreenshotService {

	@Autowired
	TestScreenshotDAO testScreenshotDAO;

	@Override
	public void addScreenShot(TestScreenShotBean screenShotBean) throws Exception{
		// TODO Auto-generated method stub
		testScreenshotDAO.addTestScreenshot(screenShotBean);
	}

}
