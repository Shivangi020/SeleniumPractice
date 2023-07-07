package handlingiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrame {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		
//		Switching to parent top frame
		driver.switchTo().frame("frame-top");
		
//		Switching to child left frame
		driver.switchTo().frame("frame-left");
		
		String leftFrameText = driver.findElement(By.tagName("Body")).getText();
		System.out.println(leftFrameText);
		
		
//		Switching to child middle frame but first switch to parent frame
		driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame-middle");
		
		String middleText = driver.findElement(By.tagName("Body")).getText();
		System.out.println(middleText);
		
//		Switching to child right frame  so first switch to parent frame
		driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame-right");
		
		String rightText = driver.findElement(By.tagName("Body")).getText();
		System.out.println(rightText);
		
		
//		Switch back directly to pagelevel
		driver.switchTo().defaultContent();
		
//		Switching to parent bottom frame
		driver.switchTo().frame("frame-bottom");
		String bottomText = driver.findElement(By.tagName("Body")).getText();
		System.out.println(bottomText);

	}

}
