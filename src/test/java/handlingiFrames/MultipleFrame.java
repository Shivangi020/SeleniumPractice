package handlingiFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		
		
		List<WebElement> list = driver.findElements(By.tagName("frame"));
		
		int s; 
		int index = 0;
		for(int i =0;i<list.size() ;i++) {
			driver.switchTo().frame(i);
			s = driver.findElements(By.xpath("//a[text()='Description']")).size();
			
			if(s>0) {
				index = i;
				driver.switchTo().parentFrame();
				break;
			}	
			
			driver.switchTo().parentFrame();
	}
		driver.switchTo().frame(index);
		driver.findElement(By.xpath("//a[text()='Description']")).click();
	}

}
