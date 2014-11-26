import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/* This example is to demonstrate how to keep a single DataProvider class shared 
 * among multiple TestNG files
 *Steps 
 *1)  Create a custom class(Data_Provider) and define the getDatamethod in that file and mark it as static
 *2) Provide name for DataProvider method(getData) using @DataProvider(name="getRegistrationData")
 *3) In the calling script for @Test annotation give the Data provider calss name using "dataProviderClass" and the data provider method name given in the above step
 *
 */

public class SampleTest {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="getRegistrationData")
	public void testDP(String username, String password, String city)
	{
		System.out.println(username+"--"+password+"--"+city);
	}
	
	
	
	

}
