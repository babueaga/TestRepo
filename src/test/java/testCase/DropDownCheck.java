package testCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCheck {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(groups="dropDown")
	public void autoCompleteDropDown() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		element.click();
		element.sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
	}
	
	@Test(groups="dropDown")
	public void normalDropDownSelect() {
		Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		List<WebElement> eles = select.getOptions();
		for(WebElement ele : eles) {
			if(ele.getText().equalsIgnoreCase("option2")){
				ele.click();
				break;
			}
		}
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
