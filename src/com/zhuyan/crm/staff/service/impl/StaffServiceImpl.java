package com.zhuyan.crm.staff.service.impl;

import java.util.List;

import com.zhuyan.crm.staff.dao.StaffDao;
import com.zhuyan.crm.staff.domain.CrmStaff;
import com.zhuyan.crm.staff.service.StaffService;
import com.zhuyan.crm.utils.MyStringUtils;

public class StaffServiceImpl implements StaffService{
	
	private StaffDao staffDao;
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	public CrmStaff login(CrmStaff staff) {
		String logginPwd =MyStringUtils.getMD5Value(staff.getLoginPwd());
		return staffDao.find(staff.getLoginName(),logginPwd);
	}
	public List<CrmStaff> findAll() {
		List<CrmStaff> allStaff=staffDao.findAll();
		return allStaff;
	}
	public CrmStaff findById(String staffId) {
		return this.staffDao.findById(staffId);
	}
	public void updateStaff(CrmStaff staff) {
		CrmStaff findStaff = staffDao.findById(staff.getStaffId());
		if(! findStaff.getLoginPwd().equals(staff.getLoginPwd())){
			findStaff.setLoginPwd(MyStringUtils.getMD5Value(staff.getLoginPwd()));
		}
		findStaff.setLoginName(staff.getLoginName());
		findStaff.setStaffName(staff.getStaffName());
		findStaff.setGender(staff.getGender());
		findStaff.setOnDutyDate(staff.getOnDutyDate());
		findStaff.setPost(staff.getPost());
	}

}
