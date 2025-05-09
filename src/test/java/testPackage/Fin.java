package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fin {

	public static void main(String[] args) throws ArithmeticException {

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.google.com");
			int a=32/0;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("test")));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			driver.quit();
		}
		System.out.println("Normal flow");

	}

}
