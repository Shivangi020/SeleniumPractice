package actionClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
	 driver.findElement(By.id("input-firstname")).sendKeys("Shiv");
//	 driver.findElement(By.id("input-lastname")).sendKeys("Singh");
	 
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys("Singh").pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys("shiv@gmail.com").pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys("1234567890").pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys("12345").pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys("12345").pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).pause(Duration.ofSeconds(1))
	 .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	 

	}

}
