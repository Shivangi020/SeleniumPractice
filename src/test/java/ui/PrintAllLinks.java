package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list);
		
		for(int i =0;i<list.size() ;i++) {
			System.out.println(list.get(i).getAttribute("href"));
		}

	}

}
