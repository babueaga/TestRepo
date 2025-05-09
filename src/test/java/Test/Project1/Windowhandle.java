package Test.Project1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.cssSelector("button[id='openwindow']"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		//driver.findElement(RelativeLocator.with(By.className("name")).above(element));
		
		//button[id='openwindow']
		
		String parent = driver.getWindowHandle();
		
		element.click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		
		Iterator<String> it  = windowHandle.iterator();
		while(it.hasNext()) {
			String window = it.next();
			
			if(!parent.equals(window)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
			}else {
				System.out.println("else block called");
			}
		}
		driver.close();
		
	}

}
