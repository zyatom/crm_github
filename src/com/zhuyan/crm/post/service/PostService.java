package com.zhuyan.crm.post.service;

import java.util.List;

import com.zhuyan.crm.department.domain.CrmDepartment;
import com.zhuyan.crm.post.domain.CrmPost;

public interface PostService {
	public List<CrmPost> findAll(CrmDepartment department);
}
