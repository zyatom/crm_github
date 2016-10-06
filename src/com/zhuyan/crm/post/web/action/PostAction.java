package com.zhuyan.crm.post.web.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhuyan.crm.post.domain.CrmPost;
import com.zhuyan.crm.post.service.PostService;

public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {
	private CrmPost post = new CrmPost();
	public CrmPost getModel() {
		// TODO Auto-generated method stub
		return post;
	}
	
	private PostService postService;
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	
	public String findAllWithDepartment() throws IOException{
		//1 查询
		List<CrmPost> allPost = this.postService.findAll(post.getDepartment());
		
		//2 将java对象 转换 json数据
		
		//2.1 排除不需要数据
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"department","staffSet"});
		//2.2 转换
		String jsonData = JSONArray.fromObject(allPost,jsonConfig).toString();
		
		//3 将json数据发送给浏览器
		//3.1 响应中文乱码
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		//3.2 发送
		ServletActionContext.getResponse().getWriter().print(jsonData);
		
		return "none";
	}
}
