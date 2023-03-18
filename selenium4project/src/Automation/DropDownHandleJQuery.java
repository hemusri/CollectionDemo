package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleJQuery {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		driver.findElement(By.id("justAnInputBox")).click();
		
		//selectChoiceValue(driver,"choice 1");

		//selectChoiceValue(driver,"choice 1","choice 2","choice 3","choice 6 4 8","choice 6 2");

		selectChoiceValue(driver,"all");

		driver.close();
		driver.quit();
		
	}
	
	public static void selectChoiceValue(WebDriver driver,String... value) 
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceList)
			{
				String text = item.getText();

				for(String val:value)
				{
					if(text.equals(val)) 
					{
						item.click();
						break;
					}
				}
			}
		}
		
		else
			
		{
			try
			{
				for(WebElement item:choiceList) 
				{
					item.click();
				}
			}
			catch(Exception e) 
			{

			}
		}

	}

}
