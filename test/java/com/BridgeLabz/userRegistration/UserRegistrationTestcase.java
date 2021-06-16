package com.BridgeLabz.userRegistration;


import org.junit.Assert;
import org.junit.Test;
/*******
 * 
 * @author ANAND
 * UC-1- Test case to validate  the first Name starting with Capital Letter
 */
public class UserRegistrationTestcase {
    
	// UC-1- Test case to validate the first Name starting with Capital Letter
	@Test
	public void firstName_whenValid_returnValid() {
		boolean firstName = UserRegistration.validateName("Anand"); // valid true
		Assert.assertEquals(true, firstName);
		// test case Passed
	}

	@Test
	public void firstName_whenInValid_returnInValid() {
		boolean firstName = UserRegistration.validateName("user21"); // invalid false
		Assert.assertEquals(false, firstName);
		// test case passed
	}
	    
}
