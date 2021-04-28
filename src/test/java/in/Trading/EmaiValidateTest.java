package in.Trading;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmaiValidateTest {

	@Test
	public void test() {
		String email="viswakumaras@gmail.com";
		Boolean actual=EmailValidator.emailValidate(email);
		//assertEquals("TRUE",actual);
	//	System.out.println(actual);
		assertTrue(actual);
		
	}
	@Test
	public void test1() {
	String email="viswakumaras@@gmail.com";
	Boolean actual=EmailValidator.emailValidate(email);
	//assertEquals("TRUE",actual);
//	System.out.println(actual);
	assertFalse(actual);
	}
	@Test
	public void test2() {
	String email="viswakumaras@gmail.,commmmmmmmmm";
	Boolean actual=EmailValidator.emailValidate(email);
	//assertEquals("TRUE",actual);
//	System.out.println(actual);
	assertTrue(actual);
	}

}
