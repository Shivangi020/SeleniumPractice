package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryRightClick {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightClickBtn = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickBtn).perform();
		
		WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
		
		action.click(quit).perform();

	}

}
