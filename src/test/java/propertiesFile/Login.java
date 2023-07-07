package propertiesFile;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
//		Process for reading property file
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("./src/test/java/propertiesFile/Config.properties");
//		prop.load(fis);
		
		Properties prop = LoadProperty.loadProperties();
		
/////////////////////////////////////
		
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
