package robotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		Robot robot = new Robot();
		robot.mouseWheel(100); // Scroll down

//		Delaying using delay alternative for Thread.sleep()
		robot.delay(2000);

		robot.mouseWheel(-50); // Scroll up
	}

}
