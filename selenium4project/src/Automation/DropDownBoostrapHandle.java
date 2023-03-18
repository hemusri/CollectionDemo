package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownBoostrapHandle {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
		List<WebElement> value=driver.findElements(By.xpath("//ul//li/a//label//input"));
		
		System.out.println(value.size());
		
		
//		for(int i=0; i<value.size(); i++)
//		{
//			if(value.get(i).getText().equals(" jQuery")) 
//			{
//				value.get(i).click();
//				break;
//			}
//		}
		
		
		for(WebElement ele:value) 
		{
			if(ele.getText().equals("jQuery"))
			{
				ele.click();
				break;
			}
		}
		

	}

}
