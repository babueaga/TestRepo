package Test.Project1;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import junit.framework.Assert;

public class TableVerification {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		

		/*
		 * List<WebElement> tab = driver.findElements(By.cssSelector(".table-display"));
		 * int sum = 0; System.out.println("The table row size is " +tab.size());
		 * 
		 * for(int i =0 ; i < tab.size(); i++) { if(i == 2) { String ins =
		 * driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[1]")).getText(
		 * ); String Course =
		 * driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[2]")).getText(
		 * ); String Price =
		 * driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[3]")).getText(
		 * ); System.out.println(ins+ " "+Course+" " +Price);
		 * 
		 * } sum = sum + Integer.parseInt(tab.get(i).getText()); }
		 * 
		 * int total =
		 * Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText()
		 * .split(":")[1].trim());
		 * 
		 * Assert.assertEquals(sum, total);
		 */

		List<WebElement> tab1 = driver.findElements(By.xpath("//*[@class='table-display']/tbody/tr"));
		String num =null;
		String text = driver.findElement(By.xpath("//*[@class='table-display']/tbody/tr[3]/td")).getText();
		System.out.println(text);
		
		System.out.println(tab1.size());
		
		
		
		WebElement cell = tab1.get(0).findElement(By.xpath("td"));
		for(int i =0 ; i < tab1.size(); i++) {
			
			System.out.println(cell.getText());
			/*
			 * if(i == 2) { num = tab1.get(i).getText(); }
			 */
		}
		System.out.println(num);

		Thread.sleep(5000L);
		driver.quit();
		
	}

}
