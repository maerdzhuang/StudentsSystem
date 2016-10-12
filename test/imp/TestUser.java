package imp;

import org.junit.Test;

import com.zxj.entity.User;
import com.zxj.imp.UserDao;

public class TestUser {
	@Test
	public void test01()
	{
		User u = new User(2,"zxj","521638");
		UserDao ud = new UserDao();
		System.out.println(ud.loginSuccess(u));
	}
}
