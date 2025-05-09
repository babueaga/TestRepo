package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String args[]) throws InterruptedException {
		By fromLoc = By.xpath("//input[@id='src']");
		By toLoc = By.xpath("//input[@id='dest']");
		By searchButton = By.xpath("//button[@id='search_button']");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement from = driver.findElement(fromLoc);
		from.click();
		from.sendKeys("Salem");
		from.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000L);

		WebElement to = driver.findElement(toLoc);
		to.click();
		to.sendKeys("Chennai");
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000L);

		WebElement search = driver.findElement(searchButton);
		
		search.click();
		
		Thread.sleep(5000L);
	//	driver.close();
	}
}
