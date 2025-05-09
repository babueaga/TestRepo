package Test.Project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select select =new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
		
		List<WebElement> option = select.getOptions();
		
		System.out.println(option.size());
		for(int i =0; i< option.size();i++) {
			System.out.println(option.get(i).getText());
		}
		
		List<WebElement> chkbox = driver.findElements(By.cssSelector("div[id='checkbox-example']"));
		System.out.println(chkbox.size());
		
		for(WebElement arr : chkbox) {
			System.out.println(arr.getText());
		}
		
		Thread.sleep(3000L);
		driver.quit();
		
	}

}
