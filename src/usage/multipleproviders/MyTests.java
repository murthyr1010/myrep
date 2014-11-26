package usage.multipleproviders;

import org.testng.annotations.Test;

public class MyTests {
	
	@Test(dataProviderClass=MyDataProvider.class,dataProvider="logindataprovider",priority=1)
	public void testLoginTest(String user, String password, String city)
	{
		System.out.println("Login Test Data:");
		System.out.println(user+"--"+password+"--"+city);
	}
	
	@Test(dataProviderClass=MyDataProvider.class,dataProvider="registrationdataprovider",priority=2)
	public void testRegistrationTest(String user, String password, String city, String email)
	{
		System.out.println("Login Test Data:");
		System.out.println(user+"--"+password+"--"+city+"--"+email);
	}

}
