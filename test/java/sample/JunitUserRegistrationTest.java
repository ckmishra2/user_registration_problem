package sample;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class JunitUserRegistrationTest {
	JunitUserRegistration JunitUserRegistration = new JunitUserRegistration();
//@RunWith(Parameterized.class)
//public class JunitUserRegistrationTest {
//	 String emailId;
//	 Boolean expectedResult;
//	 JunitUserRegistration JunitUserRegistration;
//
//	@Before
//	public void initialize() {
//		JunitUserRegistration = new JunitUserRegistration();
//	}
//
//	public JunitUserRegistrationTest(String emailId, Boolean expectedResult) {
//		this.emailId = emailId;
//		this.expectedResult = expectedResult;
//	}
////Parameterised Test to validate multiple entry for the Email Address.
//	@Parameterized.Parameters
//		   public static Collection emailId() {
//		      return Arrays.asList(new Object[][] {
//		         {"abc.xyz@bl.co.in", true},
//		         {"abc-100@yahoo.com", true},
//		         {"abc.100@yahoo.com", true},
//		         {"abc111@abc.com", true},
//		         {"xyz",false}
//		      });
//		   }
//	
//	@Test
//	public void isemailIdProperReturnTrue() {
//		  System.out.println("email id is : " + emailId);
//	      Assert.assertEquals(expectedResult, JunitUserRegistration.validateEmailId(emailId));
//		
//	}

	@Test
	public void givenFirstNameIsProperReturnTrue() {
		boolean actualResult=true;
		try {
			if(actualResult = JunitUserRegistration.firstName("Chandrakala"));
			System.out.println("Regex for first name is "+actualResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstNameIsProperReturnFalse() {
		boolean actualResult=false;
		try {
			if(actualResult = JunitUserRegistration.firstName("chandrakala"));
			System.out.println("Regex for first name is "+actualResult);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(false, actualResult);
	}
	@Test
	public void givenLastNameIsProperReturnTrue() {
		boolean actualResult=true;;
		try {
			if(actualResult = JunitUserRegistration.lastName("Mishra"));
			System.out.println("Regex for Last Name is "+actualResult);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertEquals(true, actualResult);
		}
	}

	@Test
	public void givenlastNameIsProperReturnFalse() {
		boolean actualResult = false;
		try {
		if	(actualResult = JunitUserRegistration.lastName("mishra"));
		System.out.println("Regex for Last Name is "+actualResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenemailIdIsProperReturnTrue() {
		boolean actualResult = false;
		try{
		if(actualResult = JunitUserRegistration.validateEmailId("abc.xyz@bl.co.in"));
		System.out.println("Regex for emailid is "+actualResult);
		}catch(Exception e) {
		Assert.assertEquals(true, actualResult);
	}
	}

	@Test
	public void givenemailIdIsProperReturnFalse() {
		boolean actualResult = true;
		try{
			if(actualResult = JunitUserRegistration.validateEmailId("abc.xyz@bl.co.in."));
			System.out.println("Regex for emailid is "+actualResult);
		}catch(Exception e) {
		Assert.assertEquals(true, actualResult);
	}
	}
	@Test
	public void givenmobileNumberProperReturnTrue() {
		boolean actualResult = false;
		try {
			if(actualResult = JunitUserRegistration.mobileNumber("91 9919819801"));
			System.out.println("Regex for mobile number is "+actualResult);
		}catch(Exception e) {
		Assert.assertEquals(false, actualResult);
	}
	}

	@Test
	public void givenmobileNumberProperReturnFalse() {
		boolean actualResult = true;
		try{
			if(actualResult = JunitUserRegistration.mobileNumber("919919819801"));
			System.out.println("Regex for mobile number is "+actualResult);
		}catch(Exception e) {
		Assert.assertEquals(false, actualResult);
	}
	}
	@Test
	public void givenPasswordProperReturnTrue() {
		boolean actualResult = true;
		try{
			if(actualResult = JunitUserRegistration.password("ab@Aj8jr"));
			System.out.println("Regex for password  is "+actualResult);
		}catch(Exception e) {
		Assert.assertEquals(true, actualResult);
	}
	}
	@Test
	public void givenPasswordProperReturnFalse() {
		boolean actualResult = false;
		try {
		if(actualResult = JunitUserRegistration.password("fgftr"));
		System.out.println("Regex for password  is "+actualResult);
		}catch(Exception e) {
		Assert.assertEquals(false, actualResult);
	}
}
}