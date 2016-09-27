package com.zhuyan.crm.staff.domain.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zhuyan.crm.staff.dao.StaffDao;
import com.zhuyan.crm.staff.domain.CrmStaff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {
	
	public CrmStaff find(String loginName, String loginPwd) {
		List<CrmStaff> allStaff=this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd=?",loginName,loginPwd);
		if(allStaff!=null){
			return allStaff.get(0);
		}
		return null;
	}

}
