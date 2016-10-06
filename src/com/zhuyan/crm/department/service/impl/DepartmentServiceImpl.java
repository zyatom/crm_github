package com.zhuyan.crm.department.service.impl;

import java.util.List;

import com.zhuyan.crm.department.dao.DepartmentDao;
import com.zhuyan.crm.department.domain.CrmDepartment;
import com.zhuyan.crm.department.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDao departmentDao;
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	public List<CrmDepartment> findAll() {
		return departmentDao.findAll();
	}

}
