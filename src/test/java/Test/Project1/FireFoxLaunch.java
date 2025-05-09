package Test.Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxLaunch {
	By signInbutton = By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/div[2]/div[1]/a/span");
	@Test
	public void firefoxLaunch() {
		System.out.println("The thread ID for clickOffers Firefox is " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.browserstack.com/guide/selenium-commands");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		HomePage obj =new HomePage(driver);
		
		//WebElement element = driver.findElement(signInbutton);
		//element.click();
		
		obj.click(signInbutton);
		
		/*
		 * if(element.isDisplayed()) { if(element.isEnabled()) {
		 * 
		 * } }
		 */
		//driver.quit();
		
	}
}
