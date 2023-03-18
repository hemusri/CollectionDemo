package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert window with ok button
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		*/
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();     //close the alert by using OK button
		driver.switchTo().alert().dismiss();      //close alert by using cancle button
		
		*/
		//Alert window with input box , capature text from alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("The massage displayed on the alert :"+alertwindow.getText());
		
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();

	}

}
