package com.zxj.imp;
/**
 * StudentInter的实现类
 */
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zxj.entity.Student;
import com.zxj.inter.StudentInter;
import com.zxj.util.HibernateSessionFactory;

public class StudentDao implements StudentInter{

	@Override
	public List<Student> students() {
		String hql = "from Student";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		List<Student> students = query.list();
		HibernateSessionFactory.closeSession();
		return students;
	}

	@Override
	public boolean deleteStudentById(String sid) {
		//要提交事务，才能删除
		Session session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		try{
			Student s = (Student)session.get(Student.class, sid);
			session.delete(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally{
			tr.commit();
			HibernateSessionFactory.closeSession();
		}
		return true;
	}

}
