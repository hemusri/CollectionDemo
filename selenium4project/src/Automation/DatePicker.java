package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIkNKtydrE-gIV7JNmAh0BLwDOEAAYAiAAEgIZWPD_BwE");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		String year = "2022";
		String month = "Nov";
		String date = "20";

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();


			String mon = monthyear.split(" ")[0].trim();
			String yr = monthyear.split(" ")[1].trim();

			//			String arr[] = monthyear.split(" ");
			//						
			//			String mon = arr[0];
			//			String yr = arr[1];

			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				driver.findElement(By.xpath("//td[@class='next']//button")).click();

			
		}

		//Date Selection

		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

		for(WebElement ele:alldates)
		{
			String dt = ele.getText();
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}

	}

}
