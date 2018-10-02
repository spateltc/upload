package com.deloitte.twb.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.twb.bean.GhostRiderBean;
import com.deloitte.twb.bean.MapBean;
import com.deloitte.twb.dao.GhostRiderDao;
import com.deloitte.twb.service.GhostRiderService;

@Service
public class GhostRiderServiceImpl implements GhostRiderService {

	

	@Autowired
	GhostRiderDao ghostRiderDao;
	
	@Override
	public List<GhostRiderBean> getGhostRiderTableData(String ReportName,String startDateValue,String endDateValue,String location)
			throws Exception {
		// TODO Auto-generated method stub
		List<GhostRiderBean>  finalLGDefectsStatusCount=new ArrayList<GhostRiderBean>();
		 finalLGDefectsStatusCount=ghostRiderDao.getGhostRiderTableData(ReportName,startDateValue,endDateValue,location);
		return finalLGDefectsStatusCount;
	}
	

	@Override
	public List<MapBean> MapLocation()
			throws Exception {
		// TODO Auto-generated method stub
		List<MapBean>  finalLGDefectsStatusCount=new ArrayList<MapBean>();		
		finalLGDefectsStatusCount=ghostRiderDao.MapLocation();
		return finalLGDefectsStatusCount;
	}
	
	@Override
	public List<MapBean> getbotsReport()
			throws Exception {
		// TODO Auto-generated method stub
		List<MapBean>  finalLGDefectsStatusCount=new ArrayList<MapBean>();		
		finalLGDefectsStatusCount=ghostRiderDao.getbotsReport();
		return finalLGDefectsStatusCount;
	}
	
	
}
