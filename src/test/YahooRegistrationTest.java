package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {
  @Test(dataProvider="registerData")
  public void testRegister(String username, String password, String email, String city) {
	  //Selenium code
	  //username
	  //password
	  //email
	  //city
	  System.out.println(username+"---"+password+"----"+email+"---"+city);
	  
	  //this will exeucted as 3 test cases with 3 sets of data
  }
  
  @DataProvider
  public Object[][] registerData()
  {
	  Object[][] data = new Object[3][4];
	  //1st user
	  data[0][0]="user1";
	  data[0][1]="pass1";
	  data[0][2]="email1";
	  data[0][3]="city1";
	  
	  //2nd user
	  data[1][0]="user2";
	  data[1][1]="pass2";
	  data[1][2]="email2";
	  data[1][3]="city2";
	  
	  //3rd user
	  data[2][0]="user2";
	  data[2][1]="pass2";
	  data[2][2]="email2";
	  data[2][3]="city2";
	  
	  return data;
  }
}
