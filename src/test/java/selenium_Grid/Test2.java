package selenium_Grid;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	public WebDriver driver;
	
	@Test
    public void testTwo() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+" from firefox");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = Helper.initializeBrowser("firefox");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
