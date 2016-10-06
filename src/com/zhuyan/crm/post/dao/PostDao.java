package com.zhuyan.crm.post.dao;

import java.util.List;

import com.zhuyan.crm.department.domain.CrmDepartment;
import com.zhuyan.crm.post.domain.CrmPost;

public interface PostDao {
	public List<CrmPost> findAll(CrmDepartment department);
}
