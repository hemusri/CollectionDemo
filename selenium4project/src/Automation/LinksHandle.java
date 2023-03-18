package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksHandle {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.xpath("//a[text()='Books']")).click();     //xpath finding
		
		//driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.partialLinkText("Boo")).click();
		
		//How to capture all the links
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Number of links present :"+links.size());
		
		//Normal for loop
		
/*		for(int i=0; i<=links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		*/
		
		for(WebElement link:links) 
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

}
