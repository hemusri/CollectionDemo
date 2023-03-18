package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleAutoSuggest {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://www.bing.com/?toWww=1&redig=5873E1B847DC4D4CBE96D8F6CC4E3732");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		System.out.println("Size of Auto suggestions :"+list.size());
		
		for(WebElement listitems:list) 
		{
			if(listitems.getText().contains("download"))
			{
				listitems.click();
				break;
			}
		}

	}

}
