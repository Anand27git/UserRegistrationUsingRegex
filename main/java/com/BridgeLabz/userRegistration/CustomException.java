package com.BridgeLabz.userRegistration;

/****
 * 
 * @author ANAND
 *
 */
public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;
	public String errormessage;
    
    // Constructor for CustomException
	public CustomException(String message) {
		this.errormessage = message;	
	}
}
