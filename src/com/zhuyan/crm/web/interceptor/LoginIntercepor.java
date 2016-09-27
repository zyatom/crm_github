package com.zhuyan.crm.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginIntercepor extends MethodFilterInterceptor {


	@Override
	public String doIntercept(ActionInvocation invocation) throws Exception {
		Object obj=ActionContext.getContext().getSession().get("loginStaff");
		if(obj==null){
			Object action = invocation.getAction();
			if(action instanceof ActionSupport){
				ActionSupport actionSupport=(ActionSupport) action;
				actionSupport.addFieldError("", "请先登录!");
			}
			return "login";
		}
		
		return invocation.invoke();
	}

}
