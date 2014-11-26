package SingleDPwithDifferentData;

import java.lang.reflect.Method;
/*The following DataProvider is flexible to server data for multiple test cases based on test case name
 * Steps:
 * 1. Create a single data provider and for the method overload with Method m - reflection API
 * 2. based on m.getName() compare with test case name and then supply the data
 * 
 * 
 */

import org.testng.annotations.DataProvider;

public class MySingleDataProvider {
	
	@DataProvider(name="commondataprovider") 
	public static Object[][] getData(Method m){
		Object[][] data=null;
		if(m.getName().equals("loginTest")){
		 data = new Object[2][2];
		data[0][0]="U1";
		data[0][1]="P1";
		
		data[1][0]="U2";
		data[1][1]="P2";
		}
		else
		if(m.getName().equals("registerTest")){
			data = new Object[2][3];
			data[0][0]="UR1";
			data[0][1]="PR1";
			data[0][2]="Email1";
			
			data[1][0]="UR2";
			data[1][1]="PR2";
			data[1][2]="Email2";
			
		}
		
		return data;
	}

}
