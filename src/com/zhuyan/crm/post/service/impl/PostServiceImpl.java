package com.zhuyan.crm.post.service.impl;

import java.util.List;

import com.zhuyan.crm.department.domain.CrmDepartment;
import com.zhuyan.crm.post.dao.PostDao;
import com.zhuyan.crm.post.domain.CrmPost;
import com.zhuyan.crm.post.service.PostService;

public class PostServiceImpl implements PostService {
	private PostDao postDao;
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	public List<CrmPost> findAll(CrmDepartment department) {
		return postDao.findAll(department);
	}

}
