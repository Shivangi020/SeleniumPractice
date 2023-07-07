package handlingiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingFrame2 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		driver.manage().window().maximize();
		
//		Accessing Frame using WebElement
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(frame);

		driver.findElement(By.linkText("Home")).click();
	}

}
