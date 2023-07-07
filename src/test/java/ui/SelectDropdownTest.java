package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectDropdownTest {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/demo");
		driver.manage().window().maximize();

		List<WebElement> we = driver.findElements(By.name("product_interested_in"));
		System.out.println(we);
		Select select = new Select(we.get(1));
		
        System.out.println(select.getFirstSelectedOption().getText()); // Will help to get default selcted value
		select.selectByIndex(3);
		
		Thread.sleep(2000);
		select.selectByValue("Mobile-App-Testing");
		Thread.sleep(2000);
		select.selectByVisibleText("Visual Regression Cloud");
        
		

}
}