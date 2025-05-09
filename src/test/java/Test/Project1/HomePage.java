package Test.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void click(By signInelemtn) {
		driver.findElement(signInelemtn).click();
	}
}
