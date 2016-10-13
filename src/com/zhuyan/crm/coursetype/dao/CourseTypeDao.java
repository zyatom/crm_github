package com.zhuyan.crm.coursetype.dao;

import java.util.List;

import com.zhuyan.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeDao {
	public List<CrmCourseType> findAll();

	public List<CrmCourseType> findAll(String condition, Object[] params);
	
	public CrmCourseType findById(String courseTypeId);
	public void saveOrEdit(CrmCourseType courseType);

	public int getTotalRecord(String condition, Object[] params);

	public List<CrmCourseType> findAll(String condition, Object[] params,
			int startIndex, int pageSize);
}
