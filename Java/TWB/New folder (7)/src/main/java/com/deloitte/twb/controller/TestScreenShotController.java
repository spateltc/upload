package com.deloitte.twb.controller;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.deloitte.twb.bean.TestScreenShotBean;
import com.deloitte.twb.service.TestScreenshotService;

@Controller
public class TestScreenShotController {
	static Logger log = Logger.getLogger(TestScreenShotController.class
			.getName());
	@Autowired
	TestScreenshotService testScreenshotService;

	@RequestMapping(value = "/ords/preprod/postScreenshots/{htdp_detail_instance_id}", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ResponseBody
	public void insertTestScreenshotInfo(
			javax.servlet.http.HttpServletRequest request,
			@PathVariable("htdp_detail_instance_id") BigDecimal htdp_detail_instance_id) {

		log.debug("TestScreenShotController::insertTestScreenshotInfo");
		log.debug("htdp_detail_instance_id=" + htdp_detail_instance_id);
		TestScreenShotBean screenShotBean = new TestScreenShotBean();
		byte[] imageBytes = null;
		try {
			if (ServletFileUpload.isMultipartContent(request)) {
				final FileItemFactory factory = new DiskFileItemFactory();
				final ServletFileUpload upload = new ServletFileUpload(factory);

				try {
					final List items = upload.parseRequest(request);

					for (Iterator itr = items.iterator(); itr.hasNext();) {
						final FileItem item = (FileItem) itr.next();

						if (!item.isFormField()) {
							imageBytes = item.get();
						}
					}
				} catch (FileUploadException e) {
					e.printStackTrace();
				}
			}
			screenShotBean.setHtdpDetailInstanceId(htdp_detail_instance_id);
			screenShotBean.setScreenShotPic(imageBytes);
			testScreenshotService.addScreenShot(screenShotBean);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("TestScreenShotController Exception", e);
		}

	}
}
