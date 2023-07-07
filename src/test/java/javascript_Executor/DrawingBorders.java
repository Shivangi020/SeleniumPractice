package javascript_Executor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DrawingBorders {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//div[@id='cart']//button"));
		WebElement navbar = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']"));
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].style.border='2px solid red'", button);
//		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/highlightedElement.png");
//		FileHandler.copy(srcFile, destFile);
//		jse.executeScript("arguments[0].style.border=''", button);
		
		highlightAndScreenshot(button,"highlightButton");
		highlightAndScreenshot(navbar,"highlightNavbar");
		
		driver.quit();

	}
	
	public static void highlightAndScreenshot(WebElement element,String screenshotname) throws IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", element);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+screenshotname+".png");
		FileHandler.copy(srcFile, destFile);
		jse.executeScript("arguments[0].style.border=''", element);
	}

}
