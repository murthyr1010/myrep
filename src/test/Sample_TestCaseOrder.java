package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample_TestCaseOrder {
	
	@Test(priority=1)
	public void testLogin(){
		//Assert.assertEquals("A", "B");
		System.out.println("Login Test");
	}
//the following methods executes based on testLogin
	@Test(priority=2,dependsOnMethods={"testLogin"})
	public void testChangePassword(){
		Assert.assertEquals("A", "B");
		System.out.println("Change Password Test");
	}
	
	@Test(priority=3,dependsOnMethods={"testLogin","testChangePassword"})
	public void testLogout(){
		System.out.println("Logout Test");
	}
}
