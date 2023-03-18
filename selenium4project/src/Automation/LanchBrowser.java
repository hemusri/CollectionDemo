package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanchBrowser {

	public static void main(String[] args) {
		//chromebrowser
		/*	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
			//ChromeDriver driver = new ChromeDriver();
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.close();
			*/
			
			//Edge Browser
		/*	System.setProperty("webdriver.edge.driver", "C:\\chromedriver_win32\\edgedriver_win64 (1)\\msedgedriver.exe");
			WebDriver driver1 = new EdgeDriver();
			driver1.get("https://www.google.co.in/");
			driver1.close();
			*/
			
			//Using WebDriverManager
			//Chrome browser
		    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			System.out.println("Title of the page :"+driver.getTitle());
			System.out.println("Current Url of the page :"+driver.getCurrentUrl());
			//System.out.println("Page Source of the page :"+driver.getPageSource());
			
			//Edge browser
	/*		WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.co.in/");
			System.out.println("Title of the page :"+driver.getTitle());
			System.out.println("Current Url of the page :"+driver.getCurrentUrl());
			System.out.println("Page Source of the page :"+driver.getPageSource());   */
			
			
			

	}

}
