package com.zhuyan.crm.coursetype.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zhuyan.crm.coursetype.dao.CourseTypeDao;
import com.zhuyan.crm.coursetype.domain.CrmCourseType;

public class CourseTypeDaoImpl extends HibernateDaoSupport implements
		CourseTypeDao {

	public List<CrmCourseType> findAll() {
		return this.getHibernateTemplate().find("from CrmCourseType");
	}

	public List<CrmCourseType> findAll(String condition, Object[] params) {
		String hql = "from CrmCourseType where 1=1 " + condition;
		return this.getHibernateTemplate().find(hql,params);
	}

	public CrmCourseType findById(String courseTypeId) {
		return this.getHibernateTemplate().get(CrmCourseType.class, courseTypeId);
	}

	public void saveOrEdit(CrmCourseType courseType) {
		this.getHibernateTemplate().saveOrUpdate(courseType);
	}

}
