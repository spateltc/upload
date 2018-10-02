package com.deloitte.twb.dao;

import java.util.List;

public interface UtilityDAO {

	public List executeHQL(String hql,Object[] params) throws Exception;
}
