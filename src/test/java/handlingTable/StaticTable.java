package handlingTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class StaticTable {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "Browser\\chromedriver_113.exe");
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
//		Getting table all headings
//		List<WebElement> tableHeading = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));	
//		for(int i =0;i<tableHeading.size();i++) {
//			System.out.println(tableHeading.get(i).getText());
//		}

//		Getting all the data of table
//		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//tr//td"));	
//		for(int i = 0; i<tableData.size() ;i++) {
//			System.out.println(tableData.get(i).getText());
//		}
		
//		Getting all the data of first row
//		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td"));
//		for(int i =0 ;i<firstRow.size() ;i++) {
//			System.out.println(firstRow.get(i).getText());
//		}
		
//		Getting data of third row and second coloumn
//	    String x = driver.findElement(By.xpath("//table[@id='table1']//tr[3]//td[2]")).getText();
//	    System.out.println(x);
	    
//	    Getting the data of third coloumn
//		List<WebElement> thirdCol = driver.findElements(By.xpath("//table[@id='table1']//tr/td[3]"));
//		for(int i =0 ;i<thirdCol.size() ;i++) {
//			System.out.println(thirdCol.get(i).getText());
//		}
	
//	   Finding No. of Rows in table body
//		List<WebElement> bodyRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
//	    System.out.println(bodyRow.size());
	    
//     Finding all the rows in table 
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
//	    System.out.println(rows.size());
	
//	    Finding no. of coloumns
//		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
//	    System.out.println(col.size());
	    
//	    Program to print complete Table
//	    List<WebElement> all = driver.findElements(By.xpath("//table[@id='table1']//tr/th  |  //table[@id='table1']//tr/td"));
//	    for(int i = 0;i<all.size() ;i++) {
//	    	System.out.println(all.get(i).getText());
//	    }
	    
		
//		Printing data row and column wise
		int row = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr")).size();
		int col = driver.findElements(By.xpath("//table[@id=\"table1\"]//th")).size();
		
		
		for(int i = 1;i<=row;i++) {
			if(i==1) {
				for(int j = 1;j<=col ;j++) {
					String xpath = "//table[@id=\"table1\"]//th["+j+"]";
					WebElement heading = driver.findElement(By.xpath(xpath));
					System.out.print(heading.getText()+" ");
				}
			}else {
				for(int j = 1;j<=col ;j++) {
					String xpath = "//table[@id=\"table1\"]//tr["+(i-1)+"]//td["+j+"]";
					WebElement data = driver.findElement(By.xpath(xpath));
					System.out.print(data.getText()+" ");
				}
			}
			
		System.out.println();
		}
		
	}

}
