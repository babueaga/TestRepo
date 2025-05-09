package testPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		String url = null;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		driver.get("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(WebElement link : links) {
			url = link.getAttribute("href");
			System.out.println(url);
			verify(url);
		}
	}

	private static void verify(String url) throws IOException {
		URL link = new URL(url);
		HttpURLConnection con = (HttpURLConnection)link.openConnection();
		con.setConnectTimeout(3000);
		con.connect();
		
		if(con.getResponseCode() == 200 ) {
			System.out.println(con.getResponseMessage());
			
		}else{
			System.out.println(con.getResponseMessage());
		}
	}
}
