package handlingMultipleWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewWindow {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("ta1")).sendKeys("ankita singh you fucked up for real");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testwisely.com/demo");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		
	
		
	}

}
