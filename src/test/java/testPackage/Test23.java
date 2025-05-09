package testPackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {

	public static void main(String[] args) {
		By SearchButton = By.xpath("//input[@name='q']");
		By selectMobile = By.xpath("//div[text()='Xiaomi 14 (Jade Green, 512 GB)']");
		By buttonAddToCard = By.xpath("//button[normalize-space()='Add to cart']");

		WebDriver driver = new ChromeDriver();
		String searchText = "mobiles 5g";

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search = driver.findElement(SearchButton);
		search.click();
		search.clear();
		search.sendKeys(searchText);

		search.sendKeys(Keys.ENTER);
		String parentWindow = driver.getWindowHandle();

		WebElement selectProduct = driver.findElement(selectMobile);

		selectProduct.click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(driver.getWindowHandles().size());

		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
			}
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");

		WebElement addToCart = driver.findElement(buttonAddToCard);
		addToCart.click();

	}
}