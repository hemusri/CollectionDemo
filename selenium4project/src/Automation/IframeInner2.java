package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeInner2 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");    //swith to outter iframe

		driver.switchTo().frame(0);     //swith to the innter ifram
		String innertext=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		System.out.println("Inner Iframe text print :"+innertext);

		Thread.sleep(2000);

		driver.switchTo().parentFrame();  //go to the parent frame are outer frame

		String outtertext=driver.findElement(By.xpath("//p[contains(text(),'You can use the ')]")).getText();
		System.out.println("Print Outer text :"+outtertext);


	}

}
