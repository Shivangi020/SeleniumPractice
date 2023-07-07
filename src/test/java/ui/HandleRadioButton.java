package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

//		Implicit Waiting
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='bookFlights']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@id='redeemFlights']"));
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		
		
		
	
		

	}

}
