package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();

		//1st iframe 
		driver.switchTo().frame("packageListFrame");   //name of the frame
		driver.findElement(By.xpath("//li//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();    //go back to the main page
		Thread.sleep(2000);


		//2nd Iframe
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//li//a//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();    //go back to the main page

		Thread.sleep(2000);

		//3rd Iframe

		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//header//nav//div[1]//ul//li[8]/a")).click();    //Help

	}

}
