package robotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot2 {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		Robot robot = new Robot();

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(d);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.)
		
		Thread.sleep(1000);
	
		BufferedImage srcFile  = robot.createScreenCapture(rec);
		ImageIO.write(srcFile, "PNG", new File("./Screenshots/robot6.png"));
		
		driver.quit();

	}

}
