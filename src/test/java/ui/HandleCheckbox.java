package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

//		Implicit Waiting
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		driver.manage().window().maximize();
		
		
		WebElement check1 = driver.findElement(By.xpath("//input[@id='check1']"));
		WebElement check3 = driver.findElement(By.xpath("//input[@id='check3']"));
		check3.click();
		
		
		if(!check1.isSelected()) {
			check1.click();
		}
		

	}

}
