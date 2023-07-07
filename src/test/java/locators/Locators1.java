package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

//		Locating by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
//		Locating by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
//		Locating by class
		driver.findElement(By.className("submit-button")).click();
		
//		Locating by cssSelector
		driver.findElement(By.cssSelector("#item_4_title_link > div")).click();
		
//		Locating by tagName ; if more than one tag present on page then it will locate first one
		driver.findElement(By.tagName("Button")).click();
		
//		Locating by xpath
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		

//		driver.close();

	}

}
