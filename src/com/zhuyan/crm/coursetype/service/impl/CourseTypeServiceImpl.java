package com.zhuyan.crm.coursetype.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
	public List<CrmCourseType> findAll(CrmCourseType courseType) {
		StringBuilder builder=new StringBuilder();
		List<Object> paramsList = new ArrayList<Object>();
		
		if(StringUtils.isNotBlank(courseType.getCourseName())){
			builder.append(" and courseName like ?");
			paramsList.add("%"+courseType.getCourseName()+"%");
		}
		if(StringUtils.isNotBlank(courseType.getRemark())){
			builder.append(" and Remark like ?");
			paramsList.add("%"+courseType.getRemark()+"%");
		}
		if(StringUtils.isNotBlank(courseType.getTotalStart())){
			builder.append(" and total >= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalStart()));
		}
		if(StringUtils.isNotBlank(courseType.getTotalEnd())){
			builder.append(" and total <= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalEnd()));
		}
		if(StringUtils.isNotBlank(courseType.getCourseCostStart())){
			builder.append(" and courseCost >= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostStart()));
		}
		if(StringUtils.isNotBlank(courseType.getCourseCostEnd())){
			builder.append(" and courseCost <= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostEnd()));
		}
		String condition = builder.toString();
		Object[] params = paramsList.toArray();
		
		return courseTypeDao.findAll(condition,params);
	}
	public CrmCourseType findById(String courseTypeId) {
		return courseTypeDao.findById(courseTypeId);
	}
	public void addOrUpdate(CrmCourseType courseType) {
		courseTypeDao.saveOrEdit(courseType);
		
	}

}
