package com.zhuyan.crm.coursetype.service;

import java.util.List;

import com.zhuyan.crm.coursetype.domain.CrmCourseType;
import com.zhuyan.crm.page.PageBean;

public interface CourseTypeService {
	public List<CrmCourseType> findAll();

	public List<CrmCourseType> findAll(CrmCourseType courseType);

	public CrmCourseType findById(String courseTypeId);

	public void addOrUpdate(CrmCourseType courseType);

	public PageBean<CrmCourseType> findAll(CrmCourseType courseType, int pageNum,
			int pageSize);
}
