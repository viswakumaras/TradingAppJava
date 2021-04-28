package in.Trading;
import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidateTest {

	@Test
	public void test() {        //correct format
		String Password="Viswa@2000";
		Boolean actual=PasswordValidator.isValidPassword(Password);
		assertTrue(actual);
		
	}
	@Test
	public void test1() {    //no input
		String Password="";
		Boolean actual=PasswordValidator.isValidPassword(Password);
		assertTrue(actual);

}
	@Test
	public void test2() { //excess charc
		String Password="Viswa@2000ooooooooo";
		Boolean actual=PasswordValidator.isValidPassword(Password);
		assertTrue(actual);
}
	@Test
	public void test3() {   //special charc is missing
		String Password="Viswa2000";
		Boolean actual=PasswordValidator.isValidPassword(Password);
		assertTrue(actual);
}
}


