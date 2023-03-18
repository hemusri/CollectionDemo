package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsAutoSuggestGoogle {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		List<WebElement> spanele = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		System.out.println("size :"+spanele.size());

		for(WebElement option:spanele) 
		{
			if(option.getText().contains("download"))
			{
				option.click();
				break;	
			}
		}
		
		

	}

}
