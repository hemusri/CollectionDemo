package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/*

  1)How many rows in table
  2)How Many columns in the table
  3)Retrive the spicific row/column data
  4)Retrive All the data from the table
  5)print Release date , version No Java Language of selenium

 */


public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/ecosystem/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

		//1)How many rows in table
		int rows = driver.findElements(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr")).size();

		System.out.println("Total number of rows in a table :"+rows);   //8

		//2)How many columns in the table

		int cols = driver.findElements(By.xpath("/html/body/div/main/div[4]/div/table/thead/tr/th")).size();
		System.out.println("Total number of column in the table :"+cols);    //3

		//3)Retrieve the spicific row/column data	
		String value = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table//tr[2]/td[1]")).getText();
		System.out.println("The value is :"+value);


		System.out.println("Data from the table ..........");
		//4)Retrieve all the date from the table

		for(int r=1; r<=rows; r++) 
		{
			for(int c=1; c<=cols; c++)
			{
				String data = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data+"    ");
				Thread.sleep(300);
			}
			System.out.println();
		}


		//		for(int r=1; r<=rows; r++) 
		//		{
		//			String langu = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table//tr["+r+"]/td[1]")).getText();
		//			if(langu.equals("perl"))
		//			{
		//				String languge = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table//tr["+r+"]/td[2]")).getText();
		//				String author = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table//tr["+r+"]/td[3]")).getText();
		//				System.out.print(langu+"    "+languge+"    "+author);
		//				Thread.sleep(300);
		//			}
		//			System.out.println();
		//		}

		driver.quit();


	}

}
