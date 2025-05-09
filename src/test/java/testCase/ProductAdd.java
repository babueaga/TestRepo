package testCase;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductAdd {
		
		int productSize;
		WebDriver driver;
		String[] names = {"Cucumber", "Brocolli", "Beetroot"};
		@BeforeTest
		public void launchBrowser() throws InterruptedException {
	        WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		@Test
		public void productCheckout() {
			List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
			System.out.println(products.size());
			List<String> productNames = Arrays.asList(names);
			
			for(int i =0 ; i < products.size(); i++) {
				System.out.println(products.get(i).getText().toString());
				String[] items = products.get(i).getText().split("-");
				String name = items[0].trim();
				if(productNames.contains(name)) {
					driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				}
			}
	}
		@AfterTest
		public void CloseBrowser() throws InterruptedException {
			Thread.sleep(10000);
			driver.quit();
		}
}
