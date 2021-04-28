package in.Trading;
import static org.junit.Assert.*;

import org.junit.Test;


public class UserManagerTest {
	
	
	@Test
	public void test() {         // correct user name and password
		String email="john@live.com";
		String password="1234";
		boolean actual=UserManager.login(email, password);
		assertTrue(actual);
	}
	
	@Test
	public void test1() {     //wrong user name 
		String email="viswakumar@live.com";
		String password="1234";
		boolean actual=UserManager.login(email, password);
		assertTrue(actual);
	}
	
	@Test
	public void test2() {     //wrong password
		String email="virat@live.com";
		String password="125678";
		boolean actual=UserManager.login(email, password);
		assertTrue(actual);
	}
	
	
}
