package SingleDPwithDifferentData;

import org.testng.annotations.Test;

public class TestsWithSingleDP {

	@Test(dataProviderClass=MySingleDataProvider.class,dataProvider="commondataprovider")
	public void loginTest(String user, String password){
		System.out.println(user+"--"+password);
	}
	
	@Test(dataProviderClass=MySingleDataProvider.class,dataProvider="commondataprovider")
	public void registerTest(String user, String password, String email){
		System.out.println(user+"--"+password+"--"+email);
	}
}
