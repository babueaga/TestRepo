package testCase;

import org.testng.annotations.Test;

import data.provider.DataProvider1;

public class DataProviderClass {

	@Test(priority=2, dataProvider="dataCheck", dataProviderClass=DataProvider1.class)
	public void loginPage(String username, String password) {
		System.out.println("The username is "+username);
		System.out.println("The username is "+password);
		
	}
	@Test(priority=0)
	public void def() {
		System.out.println("The username is");
		
	}
	
	@Test(priority=1)
	public void abc() {
		System.out.println("The password is");

	}
}
