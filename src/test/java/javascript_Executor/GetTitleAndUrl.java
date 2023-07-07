package javascript_Executor;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//        String title = jse.executeScript("return document.title").toString();
//        System.out.println(title);

		String title = javascriptGetTitle();
		System.out.println(title);

		String url = javascriptGetURL();
		System.out.println(url);
		driver.quit();
	}

	public static String javascriptGetTitle() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String title = jse.executeScript("return document.title").toString();
		return title;
	}

	public static String javascriptGetURL() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String url = jse.executeScript("return document.URL").toString();
		return url;
	}
}
