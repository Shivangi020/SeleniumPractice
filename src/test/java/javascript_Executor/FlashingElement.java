package javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingElement {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//div[@id='cart']//button"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i =0;i<12 ;i++) {
			jse.executeScript("document.querySelector('div#cart > button').style.background = 'green'");
			Thread.sleep(100);
			jse.executeScript("document.querySelector('div#cart > button').style.background = 'black'");
		}
		
		javascriptFlash(button,"pink");
		
	}
	
	
	public static void javascriptFlash(WebElement element , String colour) throws InterruptedException {
		
		String defaultColor = element.getCssValue("background-color");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(int i =0;i<15 ;i++) {
			jse.executeScript("arguments[0].style.background='"+colour+"'" , element);
			Thread.sleep(100);
			jse.executeScript("arguments[0].style.background='"+defaultColor+"'" , element);
		}
		
	}
	
	public static void javascriptclick(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element);
	}

}
