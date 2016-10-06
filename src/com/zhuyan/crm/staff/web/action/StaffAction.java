package com.zhuyan.crm.staff.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhuyan.crm.department.domain.CrmDepartment;
import com.zhuyan.crm.department.service.DepartmentService;
import com.zhuyan.crm.staff.domain.CrmStaff;
import com.zhuyan.crm.staff.service.StaffService;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {
	
	private CrmStaff staff=new CrmStaff();

	public CrmStaff getModel() {
		return staff;
	}
	
	private StaffService staffService;
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	private DepartmentService departmentService;
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public String login(){
		CrmStaff crmStaff = staffService.login(staff);
		if(crmStaff!=null){
			ActionContext.getContext().getSession().put("loginStaff", crmStaff);
			return "success";
		}
		this.addFieldError("", "用户名或密码错误");
		return "login";
	}
	public String home(){
		return "home";
	}
	public String findAll(){
		List<CrmStaff> allStaff=this.staffService.findAll();
		ActionContext.getContext().put("allStaff", allStaff);
		return "findAll";
	}
	
	public String editUI(){
		CrmStaff findStaff = this.staffService.findById(staff.getStaffId());
		ActionContext.getContext().getValueStack().push(findStaff);
		List<CrmDepartment> allDepartment = departmentService.findAll();
		ActionContext.getContext().getValueStack().set("allDepartment",allDepartment);
		
		return "editUI";
	}
	
}
