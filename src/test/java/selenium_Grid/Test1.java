package selenium_Grid;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver;
	
	@Test
    public void testOne() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+" from chrome browser");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = Helper.initializeBrowser("chrome");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
