package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement dropdowncoun = driver.findElement(By.xpath("//select[@name='country_id']"));
		Select drpcun = new Select(dropdowncoun);
		
//		drpcun.selectByVisibleText("India");
//		drpcun.selectByValue("12");
//		drpcun.selectByIndex(19);
		
		List<WebElement> allopetions = drpcun.getOptions();
		
		for(WebElement option:allopetions) 
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}
		

	}

}
