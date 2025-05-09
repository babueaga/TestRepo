package testPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {

	public static void main(String[] args) {
//1. Navigate to www.saucedemo.com
//2. Count the total number of username displayed on the screen and print the count and the usernames
//3. Validate the login for 1st two username from the list i.e. “standard_user” and “locked_out_user”
		//System.setProperty("webdriver.chrome.driver", "driverPath");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.tagName("br"));
		System.out.println(element.size());
		
		for(WebElement ele : element) {
			System.out.println("loop");
			String elem = ele.getText();
			System.out.println(elem);
		}
		}
	
	
		
	}
