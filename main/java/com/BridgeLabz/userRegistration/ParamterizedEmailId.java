package com.BridgeLabz.userRegistration;

import java.util.regex.Pattern;

/*******
 * 
 * @author ANAND
 *
 */
public class ParamterizedEmailId {

	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([.+-_][0-9a-zA-Z]+)*"
			+ "@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}+([.][a-zA-Z]{0,3})?$";

	//method to Check Paramterized Email ids
	public boolean isValidEmailId(String emailId) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matcher(emailId).matches();
	}
}