package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsHandleMulteiple {
		
		static WebDriver driver;
		

		public static void main(String[] args) {

			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://admin-demo.nopcommerce.com/admin/");
			WebElement email=driver.findElement(By.id("Email"));
			email.clear();
			email.sendKeys("admin@yourstore.com");
			
			WebElement pass=driver.findElement(By.id("Password"));
			pass.clear();
			pass.sendKeys("admin");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//a[@href='#']//p[contains(text(), 'Customers')]")).click();
			driver.findElement(By.xpath("//li[@class='nav-item'][1]//p[contains(text(),' Customers')]")).click();
			
			
			//Approach 1
			
//			Select date = new Select(driver.findElement(By.id("SearchDayOfBirth")));
//			date.selectByVisibleText("5");
//			
//			Select month = new Select(driver.findElement(By.id("SearchMonthOfBirth")));
//			month.selectByVisibleText("1");
			
			//Approach 2
			WebElement date = driver.findElement(By.xpath("//select[@id='SearchDayOfBirth']"));
			selectOptionDropDown(date,"5");
			
			WebElement month = driver.findElement(By.xpath("//select[@id='SearchMonthOfBirth']"));
			selectOptionDropDown(month, "1");
			

		}
		
		public static void selectOptionDropDown(WebElement ele,String value)
		{
			Select drp = new Select(ele);
			
			List<WebElement> alloption = drp.getOptions();
			
			for(WebElement option:alloption) 
			{
				if(option.getText().equals(value))
				{
				   option.click();
					break;
				}
			}

	}

}
