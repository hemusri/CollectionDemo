package Automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlebrowserWindow {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//getWindowHandle()

		//		String windowID = driver.getWindowHandle();   //return ID of the single browser window
		//		System.out.println(windowID); 

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();    //open other browser chiled window

		//getWindowhandles()

		Set<String>	windowsIDS = driver.getWindowHandles();   //return ID's of the multiple browser windows
		
		//First method - iterator()
		
	/*	Iterator<String> it = windowsIDS.iterator();
		String parentWindowID = it.next();
		String chiledWindowID = it.next();
		
		System.out.println("parent Window IDS :"+parentWindowID);
		System.out.println("chiled Window IDS :"+chiledWindowID);        */
		
		//second method - using List/ArrayList
		
		List<String> windowIDsList = new ArrayList(windowsIDS);     //converting Set ....>List
		
	/*	String parentWindowID = windowIDsList.get(0);
		String chiledWindowID = windowIDsList.get(1);
		
		System.out.println("parent Window IDS :"+parentWindowID);    //parent window ID
		System.out.println("chiled Window IDS :"+chiledWindowID);    //chiled window ID
       */
		
		//using for loop get windows title
		
	/*	for(String wind:windowIDsList)
		{
			//System.out.println(wind);
			String title = driver.switchTo().window(wind).getTitle();
			System.out.println(title);		
		}   */

//		driver.close();    //close single browser window driver which pining
//		driver.quit();    //close all the browser windows
		
		//pertical window close
		
   	   	for(String wind:windowIDsList)
		{
			String title = driver.switchTo().window(wind).getTitle();
			
			if(title.equals("OrangeHRM")) 
			{
				driver.close();
			}
		}
	}

}
