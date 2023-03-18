package Automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practies {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		WebElement passcount =driver.findElement(By.name("passCount"));
		selectmain(passcount, "2");
		
		WebElement dapertment = driver.findElement(By.name("fromPort"));
		selectmain(dapertment, "Frankfurt");
		
		WebElement onmonth = driver.findElement(By.name("fromMonth"));
		selectmain(onmonth, "February");
		
		
	}
	
	
	
	
	public static void selectmain(WebElement ele,String value)
	{
		Select option = new Select(ele);
		List <WebElement> allele = option.getOptions();
		
		for(WebElement optionele:allele)
		{
			if(optionele.getText().equals(value))
			{
				optionele.click();
				break;
			}
		}
		
	}

}
