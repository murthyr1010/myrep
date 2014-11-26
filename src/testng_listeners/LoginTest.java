package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(testName="My Login")
	public void logIn(){
		System.out.println("Start");
		Assert.assertEquals("A","B");
		System.out.println("End");
	}
}
