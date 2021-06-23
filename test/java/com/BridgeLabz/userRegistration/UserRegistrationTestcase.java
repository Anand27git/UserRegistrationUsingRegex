package com.BridgeLabz.userRegistration;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
/******************************
 * 
 * @author ANAND
 * UC-1- Test case to validate  the first Name starting with Capital Letter
 * UC-2- Test case to validate the last Name of user starting with Capital Letter
 * UC-3- Test case to validate User Email ID
 * UC-4- Test case to validate User Mobile number
 * UC-5- Test cases to validate password is with minimum 8 characters
 * UC-6- Test cases to validate at Least 1 UpperCase Letter in Password
 * UC-7- Test cases to validate atLeast 1 Number in Password
 * UC-8- Test cases to validate atLeast 1 Special Characters in Password
 * UC-9- Test cases to validate all sample email Id given
 * UC-10-Test Cases to Refactor the code 
 * Uc-11-Junit test case to validate multiple entry of Email IDs
 **************************/
public class UserRegistrationTestcase {

	// UC-1- Test case to validate the first Name starting with Capital Letter
	@Test
	public void firstName_whenValid_returnValid() {
		boolean firstName = UserRegistration.validateName("Anand"); // valid true
		Assert.assertEquals(true, firstName);
		boolean firstName2 = UserRegistration.validateName("user21"); // invalid false
		Assert.assertEquals(false, firstName2);
		// test case Passed
	}

	// UC-2- Test case to validate the last Name of user starting with Capital
	@Test
	public void lastName_whenValid_returnValid() {
		boolean lastName = UserRegistration.validateName("Kumar"); // valid true
		Assert.assertEquals(true, lastName);
		boolean lastName2 = UserRegistration.validateName("lastname"); // invalid false
		Assert.assertEquals(false, lastName2);
		// test case Passed
	}

	// UC-3- Test case to validate User Email ID
	@Test
	public void email_whenValid_returnValid() {
		boolean email = UserRegistration.validateEmail("anand.kumar@bridgelab.co.in"); // valid True
		Assert.assertEquals(true, email);
		boolean email2 = UserRegistration.validateEmail("useremail.co.in"); // invalid false
		Assert.assertEquals(false, email2);
		// test case passed
	}

	// UC-4- Test cases for validating User Mobile number
	@Test
	public void phoneNo_whenValid_returnValid() {
		boolean phoneNumber = UserRegistration.validateMobile("91 8088533154"); // valid true
		Assert.assertEquals(true, phoneNumber);
		boolean phoneNumber2 = UserRegistration.validateMobile("9145896327889652"); // invalid false
		Assert.assertEquals(false, phoneNumber2);
		// test case passed
	}

	// UC-5- Test cases to validate password is with minimum 8 characters
	@Test
	public void password_whenLengthEight_returnValid() {
		boolean password = UserRegistration.validatePasswordRule1("cheGuveera"); // valid true
		Assert.assertEquals(true, password);
		boolean password2 = UserRegistration.validatePasswordRule1("abcd12"); // invalid false
		Assert.assertEquals(false, password2);
		// test case passed
	}

	// UC-6- Test cases to validate atLeast 1 UpperCase Letter in Password
	@Test
	public void password_whenFirstLetterCapital_returnValid() {
		boolean password3 = UserRegistration.validatePasswordRule1("militaryBase"); // valid true
		Assert.assertEquals(true, password3);
		boolean password4 = UserRegistration.validatePasswordRule1("alhjg"); // invalid false
		Assert.assertEquals(false, password4);
		// test case passed
	}

	// UC-7- Test cases to validate atLeast 1 Number in Password
	@Test
	public void password_atleast_onenumber_returnValid() {
		boolean password3 = UserRegistration.validatePasswordRule1("Anand123456"); // valid true
		Assert.assertEquals(true, password3);
		boolean password4 = UserRegistration.validatePasswordRule1("alhjg"); // invalid false
		Assert.assertEquals(false, password4);
		// test case passed
	}

	// UC-8- Test cases to validate atLeast 1 Special Characters in Password
	@Test
	public void password_atleast_oneSpecialCharacter_returnValid() {
		boolean password3 = UserRegistration.validatePasswordRule1("Anand@123456"); // valid true
		Assert.assertEquals(true, password3);
		boolean password4 = UserRegistration.validatePasswordRule1("dsdssd"); // invalid false
		Assert.assertEquals(false, password4);
		// test case passed
	}
	
	// UC-9- Test cases to validate all sample email Id given
	 @Test
     public void givenEmailId_WhenProper_ShouldReturnTrue(){
		 com.BridgeLabz.userRegistration.UserRegistration valid = new com.BridgeLabz.userRegistration.UserRegistration();
         assertTrue(valid.isValidEmailId("abc@yahoo.com"));
         assertTrue(valid.isValidEmailId("abc-100@yahoo.com"));
         assertTrue(valid.isValidEmailId("abc.100@yahoo.com"));
         assertTrue(valid.isValidEmailId("abc111@abc.com"));
         assertTrue(valid.isValidEmailId("abc-100@abc.net"));
         assertTrue(valid.isValidEmailId("abc.100@abc.com.au"));
         assertTrue(valid.isValidEmailId("abc@1.com"));
         assertTrue(valid.isValidEmailId("abc@gmail.com.com"));
         assertTrue(valid.isValidEmailId("abc+100@gmail.com"));
     }

     @Test
     public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
    	 UserRegistration valid = new UserRegistration();
         assertFalse(valid.isValidEmailId("abc.@gmail.com"));
         assertFalse(valid.isValidEmailId("abc@.com.my"));
         assertFalse(valid.isValidEmailId("abc123@gmail.a"));
         assertFalse(valid.isValidEmailId("abc123@.com"));
         assertFalse(valid.isValidEmailId("abc123@.com.com"));
         assertFalse(valid.isValidEmailId(".abc@abc.com"));
         assertFalse(valid.isValidEmailId("abc()*@gmail.com"));
         assertFalse(valid.isValidEmailId("abc@%*.com"));
         assertFalse(valid.isValidEmailId("abc..2002@gmail.com"));
         assertFalse(valid.isValidEmailId("abc.@gmail.com"));
         assertFalse(valid.isValidEmailId("abc@gmail.com.1a"));
         assertFalse(valid.isValidEmailId("abc@gmail.com.aa.au"));
         //testcase Passed for all the email Ids
     }
} 