package com.BridgeLabz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/************************************
 * 
 * @author ANAND 
 * purpose: User Registration 
 * UC-1-validate the first name
 *
 *************************************/
public class UserRegistration {

	/*******
	 * 
	 * @param name
	 * @return
	 */
	public static boolean validateName(String name) {
		String patternString = "(^[A-Z])[A-Za-z]{2,}$";
		boolean matches = regexMatch(name, patternString);
		return matches;
	}

	/**********
	 * 
	 * @param matchname
	 * @param patternString
	 * @return
	 */
	public static boolean regexMatch(String matchname, String patternString) {
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(matchname);
		boolean matchedname = m.find();
		System.out.println(matchedname);
		return matchedname;
	}
}
