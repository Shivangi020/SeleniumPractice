package ui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshBrowser {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com");
		driver.manage().window().maximize();
		
//		1. Refresh Command -->
		driver.navigate().refresh();
		
//		2. get Command --->
		driver.get(driver.getCurrentUrl());
			
//		3. To Command --->
		driver.navigate().to(driver.getCurrentUrl());
		
//		4. Action class and sendKeys not working
		Actions action = new Actions(driver);
		action.keyDown(Keys.F5).keyUp(Keys.F5).build().perform();
		
//		5. Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

//		robot.keyPress(KeyEvent.VK_WINDOWS);
//		robot.keyRelease(KeyEvent.VK_WINDOWS);
		

	}

}
