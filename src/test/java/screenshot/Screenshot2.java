package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot2 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

	  File srcFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  File destFile = new File("./Screenshots/omayo.png");
      FileUtils.copyFile(srcFile, destFile);
	 
	}

}
