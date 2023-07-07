package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		
		WebElement doubleClick = driver.findElement(By.id("testdoubleclick"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).perform();
		

	}

}
