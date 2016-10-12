package com.zxj.action;

import java.util.List;

import com.zxj.entity.Student;
import com.zxj.imp.StudentDao;

public class StudentAction extends SuperAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * �������ѧ��
	 * @return
	 */
	public String getAllStudents()
	{
		StudentDao sd = new StudentDao();
		List<Student> students = sd.students();
		session.setAttribute("students", students);
		return "students";
	}
	/**
	 * ����ѧ��idɾ��ѧ��
	 * @return
	 */
	public String deleteStudentById()
	{
		String id = request.getParameter("sid");
		new StudentDao().deleteStudentById(id);
		return "delete_success";
	}
}
