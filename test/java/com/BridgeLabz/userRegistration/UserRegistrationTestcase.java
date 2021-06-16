package com.BridgeLabz.userRegistration;


import org.junit.Assert;
import org.junit.Test;
/*******
 * 
 * @author ANAND
 * UC-1- Test case to validate  the first Name starting with Capital Letter
 * UC-2- Test case to validate the last Name of user starting with Capital Letter
 * UC-3- Test case to validate User Email ID
 * UC-4- Test case to validate User Mobile number
 */
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

	// UC-4- test cases for validating User Mobile number
	@Test
	public void phoneNo_whenValid_returnValid() {
		boolean phoneNumber = UserRegistration.validateMobile("91 8088533154"); // valid true
		Assert.assertEquals(true, phoneNumber);
		boolean phoneNumber2 = UserRegistration.validateMobile("9145896327889652"); // invalid false
		Assert.assertEquals(false, phoneNumber2);
		// test case passed
	}
    
}
    