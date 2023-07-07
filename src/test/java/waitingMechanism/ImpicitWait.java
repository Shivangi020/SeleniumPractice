package waitingMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWait {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		
//		Implicit wait : This will wait for every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		driver.findElement(By.linkText("Gmail")).click();
		

	}

}
