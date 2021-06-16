package com.BridgeLabz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/************************************
 * 
 * @author ANAND 
 * purpose: User Registration 
 * UC-1-validate the User first name
 * UC-2-validate the User Last name
 * UC-3-validate the User Email ID
 * UC-4-validate the User Mobile number
 * 
 *************************************/
public class UserRegistration {

	/*******
	 * 
	 * @param name
	 * @return
	 */
	// Method to validate first name and Lastname
	public static boolean validateName(String name) {
		String patternString = "(^[A-Z])[A-Za-z]{2,}$";
		boolean matches = regexMatch(name, patternString);
		return matches;
	}

	/**********
	 * 
	 * @param email
	 * @return
	 */
	//method to validate email Id
	public static boolean validateEmail(String email) {
		String patternString = "^[a-zA-z]{1}([.]{0,1}[a-zA-z0-9+-]{1,}){0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]{1}[a-z]{2}){0,1}$";
		boolean emailMatches = regexMatch(email, patternString);
		return emailMatches;
	}	
	//method to validate MobileNo
	public static boolean validateMobile(String mobileNubmer) {
		String patternString = "^([0-9]{2})[\\s]([7-9]{1}[0-9]{9})";
		boolean phoneMatches = regexMatch(mobileNubmer, patternString);
		return phoneMatches;
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
