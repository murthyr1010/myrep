package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {

@Test
public void testNews() {
		  System.out.println("Before test news is done");
		  //Assert.assertEquals("Good", "BAD");
		  
		  System.out.println("----Before Test-----");
		  Assert.assertTrue(4>3, "Error Message 4>3");
		  try{
		  Assert.assertFalse(1<9, "Error Message 1<9");//only passes if 1>9 false
		  }
		  catch(Throwable t)
		  {
			  System.out.println("Error is caught");
		  }
		  System.out.println("----After Test-----");
	  }
	  
@BeforeTest
public void xyz() {
	System.out.println("xyz test");
}
	
  
  

}
