package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.xpath("//a[text()=\"compendiumdev\"]"));
		
		Actions action = new Actions(driver);
	    action.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).build().perform();
		

	}

}
