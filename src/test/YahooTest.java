package test;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest {
 
	@BeforeSuite //once before executing all tests in all java files
	public void initilizeSelenium()
	{
	System.out.println("Selenium WebDriver is initialized");
	}
	
	@AfterSuite
	public void shutdownSelenium()
	{
		System.out.println("Selenium WebDriver is destroyed");
	}
	
	 @BeforeTest //called before executing all @Test annotations
	  public void connectToDB() {
		  System.out.println("Connecting to DB");
		  //Connection with database
	  }
	  
		@AfterTest //called after executing all @test annotations
		public void disconnectToDB()
		{
			System.out.println("disconnecting to DB");
	  }
  
  @BeforeMethod //before executing every @Test
  public void openBrowser() {
	  System.out.println("Opening Browser");
	  //Opening browser can be written here
	  
  }
  
  @AfterMethod //after executing every @Test
  public void closeBroser() {
	  System.out.println("Closing Browser");
	  //Opening browser can be written here
	  
  }

 	@Test
	  public void testRecieveMail() {
		  //Selenium code
		  System.out.println("Testing Receive mail");
		  throw new SkipException("skipping the test due to know issue ACTA-22222");
	  }
	  
	  @Test
	  public void testSendMail() {
		  //Selenium code
		  System.out.println("Testing send mail");
	  }

}
