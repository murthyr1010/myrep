package testng_listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/* 3 steps to use a custom listener
 * 1) Write a own listener class and extend using TestListenerAdapter
 * 2) Override any methods from TestListenerAdapter that you wish to use your own behaviour
 * 3) Write a TestNG class with @Test annotation and do not provide any assertion or anything
 * 4) In testng.xml file register the listener 
 * *<listeners>
*	<listener class-name="testng_listeners.CustomListener" />	
*</listeners>
 *5) register the logintest
 * 
 */

public class CustomListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr){
		//own code
		System.out.println("Test is failed "+tr.getName());
	}
	
	public void onTestSkipped(ITestResult tr){
		System.out.println("Test is skipped "+tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr){
		System.out.println("Test is Successful"+tr.getName());
	}

}
