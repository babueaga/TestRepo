package Test.Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngParallel {
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	@Test
	@Parameters({"emailid","password"})
	public void launchUrl(String email, String pwd) {
		
		System.out.println("The thread ID for clickOffers Firefox is " + Thread.currentThread().getId());
		System.out.println(email + " "+pwd);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void printStatement() {
		System.out.println("The thread ID for clickOffers Firefox is " + Thread.currentThread().getId());
		System.out.println("print statement 1");
	}
	
	@Test
	public void printStatement2() {
		System.out.println("The thread ID for clickOffers Firefox is " + Thread.currentThread().getId());
		System.out.println("print statement 2");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
