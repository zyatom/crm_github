package com.zhuyan.crm.department.dao;

import java.util.List;

import com.zhuyan.crm.department.domain.CrmDepartment;

public interface DepartmentDao {
	public List<CrmDepartment> findAll();
}
