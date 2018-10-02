package com.deloitte.twb.dao;

import java.math.BigDecimal;
import java.util.List;

import com.deloitte.twb.bean.BarChartBean;


/**
 * 	Author: Shasahank
 *	Description: DAO Service  to Fetch the Result Set Related to BarChart
 */
public interface DtwProgramListDAO {
	/**
	 * 	Author: Shasahank
	 *	Description: DAO Service to get list of Program names
	 */
	List<BarChartBean> getProgramNames() throws Exception ;

}
