package com.zhuyan.crm.coursetype.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhuyan.crm.coursetype.domain.CrmCourseType;
import com.zhuyan.crm.coursetype.service.CourseTypeService;

public class CourseTypeAction extends ActionSupport implements ModelDriven<CrmCourseType> {

	private CrmCourseType courseType=new CrmCourseType();

	public CrmCourseType getModel() {
		return courseType;
	}
	private CourseTypeService courseTypeService;
	public void setCourseTypeService(CourseTypeService courseTypeService) {
		this.courseTypeService = courseTypeService;
	}
	public String findAll(){
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll();
		ActionContext.getContext().put("allCourseType", allCourseType);
		return "findAll";
	}
}
