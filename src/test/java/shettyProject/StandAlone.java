package shettyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) {
		WebDriver driver;
	        WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://rahulshettyacademy.com/client/");
			driver.manage().window().maximize();
			driver.findElement(By.id("userEmail")).sendKeys("babuna.1991@gmail.com");
			driver.findElement(By.id("userPassword")).sendKeys("Mehan@2020!");
			
			driver.findElement(By.id("login")).click();

			
	}

}
