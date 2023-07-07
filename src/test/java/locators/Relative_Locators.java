package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		By usernameLocator = RelativeLocator.with(By.tagName("input")).above(passwordElement);
		driver.findElement(usernameLocator).sendKeys("standard_user");
		passwordElement.sendKeys("secret_sauce");
	}

}
