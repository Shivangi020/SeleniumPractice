package alertAndPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert1")).click();
		
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
	
//		alert.accept();
		alert.dismiss();

	}

}
