package practies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("datepicker")).click();
		
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println("Month And Year Values :"+monthyear);    //October 2022
		
		String month = monthyear.split(" ")[0].trim();
		String year  = monthyear.split(" ")[1].trim();
		
		while(!(month.equals("February") && year.equals("2023")))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			System.out.println("Month And Year Values :"+monthyear);    //October 2022
	
		    month = monthyear.split(" ")[0].trim();
		    year  = monthyear.split(" ")[1].trim();
		    
		}
		
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
	}

}
