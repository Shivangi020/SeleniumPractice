package actionClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScroll {

	 public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");
		driver.manage().window().maximize();
		
		WebElement  facebook = driver.findElement(By.xpath("//div[text()='Facebook']"));
		
		Actions action = new Actions(driver);
		action.scrollToElement(facebook).scrollByAmount(0, 200).build().perform();
		
	
		
	}

}
