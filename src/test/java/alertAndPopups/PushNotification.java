package alertAndPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PushNotification {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
//	
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("–disable-notifications");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver(options);	
		
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
	
		
		

	}

}
