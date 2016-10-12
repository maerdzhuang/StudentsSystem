package com.zxj.imp;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.zxj.entity.User;
import com.zxj.inter.UserInter;
import com.zxj.util.HibernateSessionFactory;

public class UserDao implements UserInter{
	//判断用户是否完成登陆
	@Override
	public boolean loginSuccess(User u) {
		if(u==null)
			return false;
		Session session = HibernateSessionFactory.getSession();
		String hql = "from User where username=? and password=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, u.getUsername());
		query.setParameter(1,u.getPassword());
		List<User> result = query.list();
		if(result.size()>0)
			return true;
		return false;
	}

}
