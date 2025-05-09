package streams;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSortVerification {

	WebDriver driver;

	@BeforeTest
	public void browserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	}

	@Test
	public void columnSortVerification() throws InterruptedException {
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		Thread.sleep(2000L);
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> alist;
		do {
		List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]"));

		alist = list1.stream().filter(s->s.getText().contains("Orange")).map(s->getPrice(s))
		.collect(Collectors.toList());
		if(alist.size() < 1) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(alist.size()>1);
		System.out.println(alist);
		
	}
	public String getPrice(WebElement e) {
		
		String price = e.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
		
	}
}
