package handlingiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingFrame3 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		int noOfFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(noOfFrame);
		
		driver.switchTo().frame(0);
		WebElement text = driver.findElement(By.xpath("//body[@id='tinymce']//p"));
		text.clear();
		text.sendKeys("Please study bro");

	}

}
