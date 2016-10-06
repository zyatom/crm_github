package com.zhuyan.crm.staff.service;

import java.util.List;

import com.zhuyan.crm.staff.domain.CrmStaff;

public interface StaffService {
	public CrmStaff login(CrmStaff staff);
	public List<CrmStaff> findAll();
	public CrmStaff findById(String staffId);
}
