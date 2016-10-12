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
	 * 获得所有学生
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
	 * 根据学生id删除学生
	 * @return
	 */
	public String deleteStudentById()
	{
		String id = request.getParameter("sid");
		new StudentDao().deleteStudentById(id);
		return "delete_success";
	}
}
