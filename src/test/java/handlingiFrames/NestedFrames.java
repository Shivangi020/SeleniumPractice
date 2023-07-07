package handlingiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Shiva");
		driver.findElement(By.name("lname")).sendKeys("Patel");
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.name("email")).sendKeys("email");
		

	}

}
