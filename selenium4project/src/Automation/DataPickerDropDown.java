package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPickerDropDown {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://bookonwardticket.com/dummy-ticket/?gclid=EAIaIQobChMIg_Xaht7E-gIVmyQrCh1foAAYEAAYAiAAEgKYI_D_BwE");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.findElement(By.xpath("//input[@type='text' and@id='dummy-departure-date']")).click();


		//month & year
		
		Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("2023");
		
		
		Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Jan");


		String date = "20";


		//date selection
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement ele:alldates)
		{
			String dat = ele.getText();
			if(dat.equals(date))
			{
				ele.click();
				break;
			}

		}

	}

}
