package com.zxj.action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ModelDriven;
import com.zxj.entity.User;
import com.zxj.imp.UserDao;
import com.zxj.inter.UserInter;

public class UserAction extends SuperAction implements ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	//验证登陆
	public String login()
	{
		UserInter ud = new UserDao();
		if(ud.loginSuccess(user))
		{
			session.setAttribute("loginUserName",user.getUsername());
			return "login_success";
		}
		else
		{
			return "input";
		}
	}
	//退出系统,跳过检验vaildate()
	@SkipValidation
	public String loginOut()
	{
		if(session.getAttribute("loginUserName")!=null)
		{
			session.removeAttribute("loginUserName");
		}
		return INPUT;
	}
	@Override
	public User getModel() {
		return this.user;
	}
	/**
	 * 用户登陆表单错误提示,定义了vaildate方法，一定要有返回的结果指令input
	 * 如果系统的fieldErrors包含失败信息，Struts2会将请求转发到input的result，在inputs视图中
	 * 可以通过<s:fielderror/>显示失败信息
	 */
	@Override
	public void validate() {
		if(user.getUsername().trim().equals(""))
		{
			this.addFieldError("usernameErr", "用户名不能为空");
		}
		if(user.getPassword().length()>6 || user.getPassword().trim().equals("") )
		{
			this.addFieldError("passwordErr", "密码不能大于6位或者为空");
		}
	}
	
}
