package testPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	@Test(priority=0)
	@Parameters("test")
	public void One(String test) {

		System.out.println("One");

	}
	@Test(priority=1,groups= {"two","three"})
	@Parameters({"test"})
	public void Two(String test) {

		System.out.println("Two "+test);

	}
	@Test(priority=3,groups="three")
	@Parameters("test")
	public void Three(String test) {

		System.out.println("Three "+test);

	}
}
