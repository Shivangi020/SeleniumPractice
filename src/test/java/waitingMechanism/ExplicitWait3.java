package waitingMechanism;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// TODO : Waiting for an Alert to be present

public class ExplicitWait3 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
	}

}
