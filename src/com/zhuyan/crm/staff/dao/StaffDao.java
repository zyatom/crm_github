package com.zhuyan.crm.staff.dao;

import com.zhuyan.crm.staff.domain.CrmStaff;

public interface StaffDao {
	public CrmStaff find(String loginName,String loginPwd);
}
