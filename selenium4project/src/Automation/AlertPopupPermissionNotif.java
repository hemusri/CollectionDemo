package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupPermissionNotif {
	

	public static void main(String[] args) {

		//chrome class to notification will be stop
		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
					
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.redbus.in/");

	}

}
