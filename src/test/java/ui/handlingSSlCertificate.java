package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingSSlCertificate {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");

//		DesiredCapabilities  dc= new DesiredCapabilities();
//		dc.setAcceptInsecureCerts(true);
//		coptions.merge(dc);
		
		
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);

		driver = new ChromeDriver(handlingSSL);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

	}

}
