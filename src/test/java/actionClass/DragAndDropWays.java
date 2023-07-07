package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropWays {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		action.clickAndHold(oslo).moveToElement(norway).release().build().perform();
		
		
		
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement US = driver.findElement(By.id("box103"));
		
		Thread.sleep(2000);
		action.dragAndDrop(washington, US).perform();
		

	}

}
