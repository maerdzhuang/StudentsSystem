package imp;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.zxj.entity.Grade;
import com.zxj.entity.Student;
import com.zxj.imp.StudentDao;
import com.zxj.util.HibernateSessionFactory;

public class TestStudent {
	//批量添加student
	@Test
	public void saveStudentBatch()
	{
		Session session  = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		Grade g = new Grade( "信计1313", "信息与计算科学1313");
		for(int i=0;i<20;i++)
		{
			Student se = new Student("2013211430"+i, g, "庄小佳", "男", 23, new Date());
			session.save(se);
		}
		session.save(g);
		tr.commit();
		HibernateSessionFactory.closeSession();
	}
	//查询所有学生
	@Test
	public void lookAllstudents()
	{
		StudentDao sd = new StudentDao();
		List<Student> students = sd.students();
		for(Student stu : students)
		{
			System.out.println(stu);
		}
	}
	
	@Test
	public void deleteStudent()
	{
		String sdi = "20132114303";
		System.out.println(new StudentDao().deleteStudentById(sdi));
	}
}
