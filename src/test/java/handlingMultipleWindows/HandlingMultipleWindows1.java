package handlingMultipleWindows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows1 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
      
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		driver.findElement(By.linkText("Open a popup window")).click();  // First Child Window
		driver.findElement(By.linkText("Blogger")).click();  // Second Child Window
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		Iterator<String> itr = allWindowHandles.iterator();
		
		while(itr.hasNext()) {
			String handle = itr.next();
			driver.switchTo().window(handle);
			if(driver.getTitle().equals("Basic Web Page Title")) {
				System.out.println(driver.findElement(By.id("para1")).getText());
//				driver.close();
			}else if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
//				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.className("classone")).sendKeys("ankita");
		
		driver.quit();
		
	}

}
