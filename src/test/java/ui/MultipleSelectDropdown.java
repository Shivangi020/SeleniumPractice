package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


     
public class MultipleSelectDropdown {
    public static WebDriver driver;
    
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement we = driver.findElement(By.id("multi-select"));
		
		Select select = new Select(we);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(3);
		
		List<WebElement> list = select.getAllSelectedOptions();
		System.out.println(list);
	}

}
