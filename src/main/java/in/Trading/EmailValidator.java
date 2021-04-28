package in.Trading;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator {
	public static boolean emailValidate(String email) {
		/** Email validate with given below pattern
		 * Should contain one "@" one "."
		 * unnecessary special charc not allowed
		 */
	String check = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	 if(email==null)
	{
	     	return false;
	}
    	Pattern emailPattern = Pattern.compile(check);
	    Matcher emailMatch = emailPattern.matcher(email);
        return emailMatch.matches();
	}

}
