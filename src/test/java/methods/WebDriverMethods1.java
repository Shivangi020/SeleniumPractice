package methods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item']"));
	
         System.out.println(list);

//		Navigating to different website from current
		driver.navigate().to("https://demoqa.com/");
		String windowHandle = driver.getWindowHandle(); // Will get the window handle string of the current window
		System.out.println(windowHandle);
 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a")).click();
        
        Set<String> set = driver.getWindowHandles();
        System.out.println(set);
	}

}
