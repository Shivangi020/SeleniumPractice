package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuosuggessionDropdown {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();

		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Tokyo");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
	}

}
