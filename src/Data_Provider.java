import org.testng.annotations.DataProvider;


public class Data_Provider {
	
	@DataProvider(name="getRegistrationData")
	public static Object[][] getData(){
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
	
	

}
