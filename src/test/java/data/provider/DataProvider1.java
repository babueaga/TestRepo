package data.provider;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

	@DataProvider(name="dataCheck")
	public Object[][] loginData(){
		
		return new Object[][] {{"Mehan", "test@123"},
							   {"Babu", "test@123"}
							};
	}
}
