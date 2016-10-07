package com.zhuyan.crm.coursetype.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll(courseType);
		ActionContext.getContext().put("allCourseType", allCourseType);
		return "findAll";
	}
	public String addOrEditUI(){
		if(StringUtils.isNotBlank(this.courseType.getCourseTypeId())){
			//将查询的详情压入到栈顶，方便标签自动的回显
			CrmCourseType findCourseType = this.courseTypeService.findById(this.courseType.getCourseTypeId());
			ActionContext.getContext().getValueStack().push(findCourseType);
		}
		return "addOrEditUI";
	}
	public String addOrEdit(){
		this.courseTypeService.addOrUpdate(courseType);
		return "addOrEdit";
	}
}
