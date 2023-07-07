package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		Absolute Xpath ---> 
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("admin");;

		
//		Relative Xpath--->
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("sauce_secret");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}

}
