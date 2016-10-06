package com.zhuyan.crm.department.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zhuyan.crm.department.dao.DepartmentDao;
import com.zhuyan.crm.department.domain.CrmDepartment;

public class DepartmentDaoImpl extends HibernateDaoSupport implements
		DepartmentDao {

	public List<CrmDepartment> findAll() {
		
		return this.getHibernateTemplate().find("from CrmDepartment");
	}

}
