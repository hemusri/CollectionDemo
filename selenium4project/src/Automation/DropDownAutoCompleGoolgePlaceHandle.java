package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutoCompleGoolgePlaceHandle {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/maps/@17.416192,78.462976,12z");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("searchboxinput"));
		search.clear();

		search.sendKeys("Toronte");
		Thread.sleep(300);
		String text;

		do 
		{
			search.sendKeys(Keys.ARROW_DOWN);

			text = search.getAttribute("value");

			if(text.equals("Toronoto, OH, USA")) 
			{
				search.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(300);

		}while(!text.isEmpty());


	}

}
