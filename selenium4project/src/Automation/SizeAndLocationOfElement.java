package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));

		//Location - method1
		System.out.println("Location of (x,y)  :"+logo.getLocation());
		System.out.println("Location of (x)  :"+logo.getLocation().getX());
		System.out.println("Location of (y)  :"+logo.getLocation().getY());


		//Location  - method2
		System.out.println("Location of x  :"+logo.getRect().getX());
		System.out.println("Location of y  :"+logo.getRect().getY());

		//Size -  method1 
		System.out.println("Size (Width,Height) :"+logo.getSize());
		System.out.println("Size (width) :"+logo.getSize().getWidth() );
		System.out.println("Size (Hight) :"+logo.getSize().getHeight());

		//Size - method2
		System.out.println("Size of the Width :"+logo.getRect().getDimension().getWidth());
		System.out.println("Size of the Height :"+logo.getRect().getDimension().getHeight());


	}

}
