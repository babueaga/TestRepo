package testCase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableClass {
	WebDriver driver;
	@BeforeClass
	public void beforeClassMethod() {
        WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().window().maximize();
	}

	@Test(groups="smoke")
	public void webTable() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> elements=null;
		try {
			elements = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
		}
//		}catch(NoSuchElementException e1) {
//			System.out.println("catch " );
//
//			System.out.println("no such element : " + e1.getMessage());
//		}
		catch(Exception e){
			System.out.println("exception only : " + e.getMessage());

		}
		System.out.println(elements.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr/th"));
		System.out.println(cols.size());
		List<String> li = new ArrayList<String>();
		for(int i = 2; i < elements.size(); i++) {
				String name = driver.findElement(By.xpath("//table[@class='tg']/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(name);

				if(name.equals("John White")) {
					for(int j = 1 ; j < cols.size(); j++) {
					String value = driver.findElement(By.xpath("//table[@class='tg']/tbody/tr["+i+"]/td["+j+"]")).getText();
					li.add(value);
					}
					break;
				}
		}
		System.out.println(li);
	}
	@AfterClass()
	public void close() {
		driver.quit();
	}
}
