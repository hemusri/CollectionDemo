package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeInner {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();


		WebElement outerframe= driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);

		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);

		//SendKeys by using JavaScriptExecutor

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Welcome");
		WebElement find = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		js.executeScript("arguments[0].value='Welcome'", find);



	}

}
