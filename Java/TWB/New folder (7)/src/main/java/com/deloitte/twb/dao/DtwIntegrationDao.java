package com.deloitte.twb.dao;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.DtwIntegration;


/**
 * 	Author: Shasahank
 *	Description: DAO Service  to Fetch the Result Set Related to DtwIntegration
 */
public interface DtwIntegrationDao {
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Service to get list of Readable names
	 */
	List<DtwIntegration> getReadableNames(String planName ,String dtwColumnName,String category) throws Exception ;
	
	List<DtwIntegration> getReadableNamesForCategory(String planName) throws Exception ;
	
	String getcolumnName(String planName,String Category) throws Exception ; 
	

}
