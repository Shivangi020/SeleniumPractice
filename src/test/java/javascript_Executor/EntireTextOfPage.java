package javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntireTextOfPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();


		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String entireText = jse.executeScript("return document.documentElement.innerText").toString();
		System.out.println(entireText);
		
		driver.quit();

}
}
