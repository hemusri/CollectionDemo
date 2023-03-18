package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,10000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
