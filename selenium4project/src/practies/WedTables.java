package practies;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1)How many rows in table
2)How Many columns in the table
3)Retrive the spicific row/column data
4)Retrive All the data from the table
5)print Release date , version No Java Language of selenium
*/

public class WedTables {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		//1)How many rows in table
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Find the rows :"+row);  //7
		
		//2)How Many columns in the table
		
		int colu = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("Find the columes :"+colu);
		
		
		//3)retrieve the spicific row/colum from the table
		
		List<WebElement> valueofRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr[4]/td"));
		for(WebElement options:valueofRow)
		{
			String opti = options.getText();
			System.out.print(opti+"       |         ");
		}
		System.err.println();
		
		
		List<WebElement> allvalue=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
		
		for(WebElement alloption:allvalue)
		{
			String alldata = alloption.getText();
			System.out.print(alldata+"  |  ");
			System.out.println();	
		}
		System.out.println();	
	}

}
