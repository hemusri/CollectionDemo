package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsHandleMulteple {


	static WebDriver driver;

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		//		Select passcount =new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		//		passcount.selectByVisibleText("3");
		//		
		//		Select DepartingFrom =new Select(driver.findElement(By.name("fromPort")));
		//		DepartingFrom.selectByVisibleText("New York");
		//		
		//		
		//		Select On = new Select(driver.findElement(By.name("fromMonth")));
		//		On.selectByVisibleText("May");
		//		
		//		Select On1 = new Select(driver.findElement(By.name("fromDay")));
		//		On1.selectByVisibleText("6");


		WebElement passcount = driver.findElement(By.name("passCount"));
		selectdropdown(passcount,"3");

		WebElement DepartingFrom = driver.findElement(By.name("fromPort"));
		selectdropdown(DepartingFrom,"New York");

		WebElement On = driver.findElement(By.name("fromMonth"));
		selectdropdown(On,"May");
		

		WebElement On1 = driver.findElement(By.name("fromDay"));
		selectdropdown(On1,"6");

	}

	public static void selectdropdown(WebElement ele,String value) 
	{
		Select optioncount = new Select(ele);
		List<WebElement> alloption = optioncount.getOptions();

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
