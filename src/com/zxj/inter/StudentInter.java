package com.zxj.inter;

import java.util.List;

import com.zxj.entity.Student;

/**
 * StudentDao的接口
 * @author 12423
 *
 */
public interface StudentInter {
	//查看所有的学生信息
	public List<Student> students();
	//根据学生的学号删除学生
	public boolean deleteStudentById(String sid);
}
