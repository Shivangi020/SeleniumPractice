package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot3 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
        
//		Taking screenshot of only desired webelement
		WebElement login = driver.findElement(By.id("content"));
		File srcFile = login.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Screenshots/login.png");
		
		FileUtils.copyFile(srcFile, DestFile);
		
		driver.quit();
	 
	}

}
