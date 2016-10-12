package com.zxj.inter;

import com.zxj.entity.User;

/**
 * UserDao的接口
 * @author 12423
 *
 */
public interface UserInter {
	//判断用户是否正确
	public boolean loginSuccess(User u);
}
