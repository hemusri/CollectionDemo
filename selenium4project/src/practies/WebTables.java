package practies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("https://testautomationpractice.blogspot.com/");

		//		List<WebElement> allheaders= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		//		
		//		for(WebElement ele:allheaders)
		//		{
		//			String value = ele.getText();
		//			System.out.print("Print the All Headers :"+value);
		//		}
		//		


		//1)How many rows in table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

		System.out.println("Total number of rows in a table :"+rows);   //8

		//2)How many columns in the table

		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("Total number of column in the table :"+cols);    //3
		String firstpart = "//*[@name='BookTable']//tr[";
		String secondpart = "]/td[";
		String thirdpart = "]";

		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				String finalpart=firstpart+i+secondpart+j+thirdpart;
				String text = driver.findElement(By.xpath(finalpart)).getText();
				System.out.print(text+"   |   ");
			}
			System.out.println();
		}

	}

}
