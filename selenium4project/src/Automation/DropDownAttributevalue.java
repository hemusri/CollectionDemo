package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAttributevalue {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Select drp = new Select(driver.findElement(By.id("products")));
		
	//	List<WebElement> alldrp = drp.getOptions();
		List<WebElement> alldrp = drp.getOptions();
		
		
		for(WebElement selectdrp:alldrp)
		{
			String text = selectdrp.getAttribute("value");
			if(text.equals("Yahoo"))
			{
				selectdrp.click();
				break;
			}
		}
		

	}

}
