package alertAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapModal {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://getbootstrap.com/docs/4.0/components/modal/");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("(//button[@data-toggle=\"modal\"])[1]")).click();
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@data-dismiss='modal'])[4]")));
		
		 Actions action = new Actions(driver);
		 action.click(button).build().perform();
		

	}

}
