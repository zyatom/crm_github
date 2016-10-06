package com.zhuyan.crm.coursetype.dao;

import java.util.List;

import com.zhuyan.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeDao {
	public List<CrmCourseType> findAll();
}
