package waitingMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// TODO : Waiting for an Element to be click-able
public class ExplicitWait2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://verifalia.com/validate-email");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='inputData']")).sendKeys("ankitaxxxxxxxxxxxxxxxxxxxxxxxx");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']")));
		btn.click();

	}

}

//Sometimes, we have to wait for the UI element to be clickable, as it won’t be clickable by default
