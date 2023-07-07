package robotClass;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	 public static WebDriver driver;
	 
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		
		Robot robot = new Robot();
		
        Rectangle rec  = new Rectangle(25,0,1000,3000); // (x,y,width,height)
        BufferedImage srcImage =  robot.createScreenCapture(rec);
        ImageIO.write(srcImage,"PNG", new File("./Screenshots/robot2.png"));
	}

}
