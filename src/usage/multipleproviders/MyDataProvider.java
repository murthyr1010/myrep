package usage.multipleproviders;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
	
	@DataProvider(name="logindataprovider")
	public static Object[][] getLoginData(){
		
	
	Object[][] data = new Object[3][3];
	
	data[0][0] = "U1";
	data[0][1] = "P1";
	data[0][2] = "C1";
	
	data[1][0] = "U2";
	data[1][1] = "P2";
	data[1][2] = "C2";

	data[2][0] = "U3";
	data[2][1] = "P3";
	data[2][2] = "C3";
   
	return data;
	}
	
	@DataProvider(name="registrationdataprovider")
	public static Object[][] getReginstartionData(){
		
	
	Object[][] data = new Object[4][4];
	
	data[0][0] = "UR1";
	data[0][1] = "PR1";
	data[0][2] = "CR1";
	data[0][3] = "EMR1";
	
	data[1][0] = "UR2";
	data[1][1] = "PR2";
	data[1][2] = "CR2";
	data[1][3] = "EMR2";

	data[2][0] = "UR3";
	data[2][1] = "PR3";
	data[2][2] = "CR3";
	data[2][3] = "EMR3";
	
	data[3][0] = "UR4";
	data[3][1] = "PR4";
	data[3][2] = "CR4";
	data[3][3] = "EMR4";

   
	return data;
	}

}
