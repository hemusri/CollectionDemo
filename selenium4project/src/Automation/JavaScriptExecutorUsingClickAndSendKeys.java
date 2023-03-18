package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorUsingClickAndSendKeys {

	public static void main(String[] args) {


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement search = driver.findElement(By.xpath("//input[@type='text' and @class='wikipedia-search-input']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Java'", search);

		WebElement searchclick = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		js.executeScript("arguments[0].click();", searchclick);		

	}

}
