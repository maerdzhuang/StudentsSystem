package com.zxj.inter;

import java.util.List;

import com.zxj.entity.Student;

/**
 * StudentDao�Ľӿ�
 * @author 12423
 *
 */
public interface StudentInter {
	//�鿴���е�ѧ����Ϣ
	public List<Student> students();
	//����ѧ����ѧ��ɾ��ѧ��
	public boolean deleteStudentById(String sid);
}
