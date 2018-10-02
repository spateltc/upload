package com.deloitte.twb.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.deloitte.twb.bean.TestSuiteBean;
import com.google.gson.JsonObject;

public class TestPerformance {

	static String TEST_SUITE_URI_PROD = "https://twb.dev-charter.net/ords/preprod/suite/";
	//static String TEST_SUITE_URI_DEV = "http://10.118.5.248:8081/TWB/ords/preprod/suite/";
	static String TEST_SUITE_URI_DEV = "https://twb.dev-charter.net/TWB/ords/preprod/suite/";
	
	static String TEST_STEPS_URI_PROD = "https://twb.dev-charter.net/ords/preprod/teststep/";
	static String TEST_STEPS_URI_DEV = "https://twb.dev-charter.net/TWB/ords/preprod/teststep/";
	
	static String TEST_CASE_URI_PROD = "https://twb.dev-charter.net/ords/preprod/testcase/";
	static String TEST_CASE_URI_DEV = "https://twb.dev-charter.net/TWB/ords/preprod/testcase/";

	static String TEST_SCREENSHOT_URI_DEV = "http://10.118.5.248:8081/TWB/ords/preprod/postScreenshots/9088";
	static String TEST_SCREENSHOT_URI_PROD = "https://twb.dev-charter.net/ords/preprod/postScreenshots/260976";
	static String NEW_TEST_SCREENSHOT_URI_PROD = "https://twb.dev-charter.net/TWB/ords/preprod/postScreenshots/260976";
	//////////////////////////////////////////
	//test suite
static String CUSTOM_FWK_TEST_SUITE_URI_DEV="http://10.118.5.248:8081/TWB/ords/preprod/suite/";
static String APEX_TEST_SUITE_URI_DEV="http://10.118.5.125/ords/tw_dev/suite_program/";
static String CUSTOM_FWK_TEST_SUITE_URI_PROD="http://twb.dev-charter.net/TWB/ords/preprod/suite/";
static String APEX_TEST_SUITE_URI_PROD="https://twb.dev-charter.net/ords/preprod/suite/";

//test step
static String CUSTOM_FWK_TEST_STEP_URI_DEV="http://10.118.5.248:8081/TWB/ords/preprod/teststep/";
static String APEX_TEST_STEP_URI_DEV="http://10.118.5.125/ords/tw_dev/teststep/";
static String CUSTOM_FWK_TEST_STEP_URI_PROD="http://twb.dev-charter.net/TWB/ords/preprod/teststep/";
static String APEX_TEST_STEP_URI_PROD="https://twb.dev-charter.net/ords/preprod/teststep/";

//test case
static String CUSTOM_FWK_TEST_CASE_URI_DEV="http://10.118.5.248:8081/TWB/ords/preprod/testcase/";
static String APEX_TEST_CASE_URI_DEV="http://10.118.5.125/ords/tw_dev/testcase/";
static String CUSTOM_FWK_TEST_CASE_URI_PROD="http://twb.dev-charter.net/TWB/ords/preprod/testcase/";
static String APEX_TEST_CASE_URI_PROD="https://twb.dev-charter.net/ords/preprod/testcase/";

//test screen shot
static String CUSTOM_FWK_TEST_SCREENSHOT_URI_DEV="http://10.118.5.248:8081/TWB/ords/preprod/postScreenshots/89231";
static String APEX_TEST_SCREENSHOT_URI_DEV="http://10.118.5.125/ords/tw_dev/postScreenshots/260976";
static String CUSTOM_FWK_TEST_SCREENSHOT_URI_PROD="https://twb.dev-charter.net/TWB/ords/preprod/postScreenshots/260976";
static String APEX_TEST_SCREENSHOT_URI_PROD="https://twb.dev-charter.net/ords/preprod/postScreenshots/260976";
static String CUSTOM_FWK_TEST_SCREENSHOT_URI_LOCAL="http://localhost:8080/TWB/ords/preprod/postScreenshots/9098";

static String CUSTOM_FWK_BAR_CHART_URI_LOCAL="http://localhost:8080/TWB/ords/preprod/count";

	public static void main(String[] args) {
		//callSuiteService(APEX_TEST_SUITE_URI_PROD);
		//callSuiteService(CUSTOM_FWK_TEST_SUITE_URI_PROD);
		//callSuiteService(APEX_TEST_SUITE_URI_DEV);
		//callSuiteService(CUSTOM_FWK_TEST_SUITE_URI_DEV);
		
		//callTestStepsService(APEX_TEST_STEP_URI_PROD);
		//callTestStepsService(CUSTOM_FWK_TEST_STEP_URI_PROD);
		//callTestStepsService(APEX_TEST_STEP_URI_DEV);
		//callTestStepsService(CUSTOM_FWK_TEST_STEP_URI_DEV);
		
		//callTestCaseService(APEX_TEST_CASE_URI_PROD);
		//callTestCaseService(CUSTOM_FWK_TEST_CASE_URI_PROD);
		//callTestCaseService(CUSTOM_FWK_TEST_CASE_URI_DEV);
		
		//callTestScreenshotService(TEST_SCREENSHOT_URI_DEV);
	
		
		//callTestScreenshotService(APEX_TEST_SCREENSHOT_URI_PROD);
		//callTestScreenshotService(CUSTOM_FWK_TEST_SCREENSHOT_URI_DEV);
		//callTestScreenshotService(CUSTOM_FWK_TEST_SCREENSHOT_URI_PROD);
		//callTestScreenshotService(CUSTOM_FWK_TEST_SCREENSHOT_URI_DEV);
		//method1(CUSTOM_FWK_TEST_SCREENSHOT_URI_DEV);
		method2(CUSTOM_FWK_TEST_SCREENSHOT_URI_PROD);
	}

	public static void callSuiteService(String uri) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(
				new MappingJackson2HttpMessageConverter());
		String input = "{\"test_suite_name\":\"suite1\",\"tester_name\":\"t@deloitte.com\",\"program_application_name\":\"Charter.net\",\"environment\":\"demo\",\"browser\":\"Chrome\",\"browser_version\":\"53.0.2787\",\"operating_system\":\"Windows\",\"operating_system\":\"Windows\",\"operating_system_version\":\"Andriod 4.2\"}";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//headers.set("Authorization", "Basic " + "xxxxxxxxxxxx");
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		ResponseEntity<String> response = restTemplate.exchange(uri,
				HttpMethod.POST, entity, String.class);
		System.out.println("!!response="+response);
		long time1 = System.nanoTime();
		
			restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);

		
		long time2 = System.nanoTime();
		long timeTaken = time2 - time1;
		System.out.println("testSuiteService::Time taken " + timeTaken + " ns");
	}

	public static void callTestStepsService(String uri) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(
				new MappingJackson2HttpMessageConverter());
		//String input = "{\"suite_instance_id\":\"60111\",\"step_status\":\"Passed\",\"application_name\":\"Charter.net\"}";//
		String input = "{\"suite_instance_id\":\"60463\",\"step_status\":\"Passed\",\"application_name\":\"Charter.net\"}";//
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Basic " + "xxxxxxxxxxxx");
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		ResponseEntity<String> response = restTemplate.exchange(uri,
				HttpMethod.POST, entity, String.class);
		long time1 = System.nanoTime();
		//for (int i = 0; i < 500; i++) {
			restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);

		//}
		long time2 = System.nanoTime();
		long timeTaken = time2 - time1;
		System.out.println("testSuiteService::Time taken " + timeTaken + " ns");
	}
	
	public static void callTestCaseService(String uri) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(
				new MappingJackson2HttpMessageConverter());
		String input = "{\"test_case_name\":\"test case name\",\"head_end\":\"H1H8\"}";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//headers.set("Authorization", "Basic " + "xxxxxxxxxxxx");
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		ResponseEntity<String> response = restTemplate.exchange(uri,
				HttpMethod.POST, entity, String.class);
		long time1 = System.nanoTime();
		//for (int i = 0; i < 500; i++) {
			restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);

		//}
		long time2 = System.nanoTime();
		long timeTaken = time2 - time1;
		System.out.println("TestCaseService::Time taken " + timeTaken + " ns");
	}
	

	
	public static void method1(String url){
		
		InputStream in=null;
		try {
			in = new ClassPathResource("screenshot.png").getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 MultiValueMap<String, Object> parts = 
		          new LinkedMultiValueMap<String, Object>();
		  try {
			parts.add("file", new ByteArrayResource(IOUtils.toByteArray(in)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // parts.add("filename", file.getOriginalFilename());

		  RestTemplate restTemplate = new RestTemplate();
		  HttpHeaders headers = new HttpHeaders();
		  headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		  HttpEntity<MultiValueMap<String, Object>> requestEntity =
		          new HttpEntity<MultiValueMap<String, Object>>(parts, headers);
		  restTemplate.postForObject(url, requestEntity, String.class);
	}
	
	public static void method2(String url){
		//InputStream in = new ClassPathResource("screenshot.png").getInputStream();
		RestTemplate restTemplate = new RestTemplate();
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new ClassPathResource("screenshot.png"));
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new    HttpEntity<LinkedMultiValueMap<String, Object>>(
		                    map, headers);
		ResponseEntity<String> result = restTemplate.exchange(
		                    url, HttpMethod.POST, requestEntity,
		                    String.class);
	}
	
	
	public static void testPerformanceOfBarChartQuery(){
		
		
	}
}
