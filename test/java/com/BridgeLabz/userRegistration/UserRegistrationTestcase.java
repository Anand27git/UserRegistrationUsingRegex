package com.BridgeLabz.userRegistration;


import org.junit.Assert;
import org.junit.Test;
/*******
 * 
 * @author ANAND
 * UC-1- Test case to validate  the first Name starting with Capital Letter
 * UC-2- Test case to validate the last Name of user starting with Capital Letter
 *
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

}
