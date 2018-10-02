package com.deloitte.twb.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deloitte.twb.service.ReportService;
import com.deloitte.twb.util.ClientCall;

@Controller
public class LoginController {

	static Logger log = Logger.getLogger(LoginController.class.getName());
	/*@Autowired
	ReportService reportService;
*/
	
	/**
	 * Author: Shasahank Description: Fetches CommentDetails input:PlanName
	 * output:list of all CommentDetails Details For a plan(PTestInstanceFinal)
	 */

	@RequestMapping(value = "/ords/preprod/Login", method = RequestMethod.GET)
	@ResponseBody
	public List Login(@RequestHeader HttpHeaders headers,
			@RequestParam(value = "username", required = false) String username) {
		List<PTestInstanceFinal> resultList = new<PTestInstanceFinal> ArrayList();
		log.debug("ReportController::getCommentDetails()");
		String author="";
		try {
			//String authorization = httpRequest.getHeader("Authorization");
			//headers.getContentType();
			author = headers.getValuesAsList("authorization").get(0);
			System.out.println(author);
			ClientCall clientcall = new ClientCall();
			//String uri = "https://jira.charter.com/rest/api/2/user?username="+username+"&os_authType=basic";
			String uri = "https://jira.charter.com/rest/api/2/user?username="+username+"";
			clientcall.get(uri, author);
			//resultList = reportService.getCommentDetails(planName);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("getCommentDetails  Exception", e);
		}
		return resultList;
	}
	
}
