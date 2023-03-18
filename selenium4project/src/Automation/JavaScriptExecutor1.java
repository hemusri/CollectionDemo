package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//border highlity
		WebElement ele=driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
		
		//js.executeScript("arguments[0].style.border='3px solid bule", args);
		
		//title of the page
		
		String title = js.executeScript("return document.title").toString();
		System.out.println("print title :"+title);
		
		//click of the element
		WebElement search = driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']"));
//		js.executeScript("arguments[0].click();", search);
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		
//		js.executeScript("history.go[0]");
//		Thread.sleep(3000);
		
		//scroll down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//scroll up
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		//zoom
		js.executeScript("document.body.style.zoom='50%'");

	}

}
