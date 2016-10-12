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
	//��֤��½
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
	//�˳�ϵͳ,��������vaildate()
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
	 * �û���½��������ʾ,������vaildate������һ��Ҫ�з��صĽ��ָ��input
	 * ���ϵͳ��fieldErrors����ʧ����Ϣ��Struts2�Ὣ����ת����input��result����inputs��ͼ��
	 * ����ͨ��<s:fielderror/>��ʾʧ����Ϣ
	 */
	@Override
	public void validate() {
		if(user.getUsername().trim().equals(""))
		{
			this.addFieldError("usernameErr", "�û�������Ϊ��");
		}
		if(user.getPassword().length()>6 || user.getPassword().trim().equals("") )
		{
			this.addFieldError("passwordErr", "���벻�ܴ���6λ����Ϊ��");
		}
	}
	
}
