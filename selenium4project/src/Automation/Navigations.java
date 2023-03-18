package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
				RemoteWebDriver driver = new ChromeDriver();    //getmethod implementation code
				
				driver.get("https://www.snapdeal.com/");
				//driver.get("https://www.amazon.in/");
				driver.navigate().to("https://www.amazon.in/");
				
				driver.navigate().back();  //snapdeal
				Thread.sleep(2000);
				driver.navigate().forward();      //amazon
				Thread.sleep(2000);
				driver.navigate().refresh();    //refersh and reload page
				

	}

}
