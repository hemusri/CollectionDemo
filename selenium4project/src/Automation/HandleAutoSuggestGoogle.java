package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestGoogle {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		
		System.out.println("size of the goole search :"+list.size());
		
		for(WebElement listiems:list) 
		{
			if(listiems.getText().contains("point")) 
			{
				listiems.click();
				break;
			}
		}

	}

}
