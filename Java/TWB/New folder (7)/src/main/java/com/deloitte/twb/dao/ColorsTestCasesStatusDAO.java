package com.deloitte.twb.dao;

import com.deloitte.twb.bean.ColorsTestCasesStatus;

public interface ColorsTestCasesStatusDAO {
	ColorsTestCasesStatus getColorsTestCasesStatusByStatus(String status) throws Exception;
}
