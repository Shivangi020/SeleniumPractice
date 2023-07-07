package waitingMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// TODO : Waiting for an Element to be displayed on the page

public class ExplicitWait {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		

		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement gmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		gmail.click();
	}

}
