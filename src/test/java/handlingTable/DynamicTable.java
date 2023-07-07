package handlingTable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		
//		Implicit wait for every WebElement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.opencart.com/admin");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		driver.findElement(By.xpath("//li[@id='menu-sale']//a[1]")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-4']//a[1]")).click();
		
		

		
//		Using Loop to Locate the desire data in table
		String name = "dsadasd sadasda";
		
		List<WebElement> namelist = driver.findElements(By.xpath("//form[@id='form-order']//tbody//tr//td[4]"));
		System.out.println(namelist);
		
		for(int i = 0;i<namelist.size() ;i++) {
			
			if(namelist.get(i).getText().equals(name)) {
				String xpathText = "//table[@class='table table-bordered table-hover']/tbody/tr["+(i+1)+"]/td[1]";
				driver.findElement(By.xpath(xpathText)).click();
				break;
			}
		}
		
//		Using xpath axes to locate the desire data
		String xpath = "//form[@id='form-order']//tbody//td[text()='"+name+"']//preceding-sibling::td[3]//input[@type='checkbox']";
		System.out.println(xpath);
		driver.findElement(By.xpath(xpath)).click();

		
	}

}
