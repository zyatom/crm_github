package com.zhuyan.crm.coursetype.service.impl;

import java.util.List;

import com.zhuyan.crm.coursetype.dao.CourseTypeDao;
import com.zhuyan.crm.coursetype.domain.CrmCourseType;
import com.zhuyan.crm.coursetype.service.CourseTypeService;

public class CourseTypeServiceImpl implements CourseTypeService {
	private CourseTypeDao courseTypeDao;
	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}
	public List<CrmCourseType> findAll() {
		return courseTypeDao.findAll();
	}

}
