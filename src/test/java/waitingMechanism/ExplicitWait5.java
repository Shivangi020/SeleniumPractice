package waitingMechanism;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// TODO : pageLoadTimeout and TimeoutException – Selenium Exception Type

public class ExplicitWait5 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		
//		Writing a timeout for page loading so that selenium do not keep waiting for a page to load forever and give us TimeoutException
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ta1")).sendKeys("wait");

		
	}

}
