package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WabTablesHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowData = rows.size();
		System.out.println("print the Row Data :"+rowData);
		
		List<WebElement> colm = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
		int colData = colm.size();
		System.out.println("print the Row Data :"+colData);
		
		String coloumFirst ="//table[@id='customers']//tr[";
		String coloumLast ="]/td[";
		String coloumthrid="]";
		
		for(int r=1; r<rowData; r++)
		{
			for(int c=1; c<colData; c++)
			{
				String finalPart = coloumFirst+r+coloumLast+c+coloumthrid;
				
				String text = driver.findElement(By.xpath(finalPart)).getText();
				
				System.out.print(text+"  |  ");
			}
			System.out.println();
		}

	}

}
