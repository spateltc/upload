package com.deloitte.twb.service;

import java.util.List;

import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.MapBean;


public interface GhostRiderService {
	List<GhostRiderBean> getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue,String location) throws Exception;
	List<MapBean> MapLocation() throws Exception;
	List<MapBean> getbotsReport() throws Exception;
}
