package com.deloitte.twb.dao;

import java.util.List;

import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PcommentsBean;

public interface PcommentsDao{
	List getCommentDetails(String planName) throws Exception;
	void insertUpdateCommentDetails(PcommentsBean pcommentsBean)throws Exception;
}
