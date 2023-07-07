package alertAndPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();

	}

}
