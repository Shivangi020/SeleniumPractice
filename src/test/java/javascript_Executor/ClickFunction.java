package javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickFunction {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//		One way ------>
//		jse.executeScript("document.getElementById('alert1').click()");
		
//		Second way ---->
		WebElement alert = driver.findElement(By.id("alert1"));
		jse.executeScript("arguments[0].click()", alert);

	}

}
