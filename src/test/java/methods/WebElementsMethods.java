package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\BrowserDriver");
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/demo");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='orgname']")).sendKeys("ABC");
		String nameAtr = driver.findElement(By.xpath("//input[@id='orgname']")).getAttribute("class");
		System.out.println(nameAtr);

		String cssValue = driver.findElement(By.xpath("//input[@id='orgname']")).getCssValue("letter-spacing");
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.xpath("//input[@id='orgname']")).getSize();
		System.out.println(size);
		
		Point location = driver.findElement(By.xpath("//input[@id='orgname']")).getLocation();
		System.out.println(location);
		
		System.out.println(driver.findElement(By.xpath("//input[@id='orgname']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//input[@id='orgname']")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//input[@id='orgname']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='orgname']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@id='orgname']")).isSelected());
		
	}

}
