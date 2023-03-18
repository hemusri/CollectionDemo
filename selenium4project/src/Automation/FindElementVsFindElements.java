package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fregisterresult%2F1");

		//findElement    

		/*		//senior 1      singlewebElement ...> returens single Element
		WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("XYZ");

		//senior 2     multiplewebElement ...>returens first Element
		WebElement eleme=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(eleme.getText());

		//senior 3    Element not present Throws NoSuchElementException
		WebElement search = driver.findElement(By.xpath("//button[@type='login']"));
		 */

		//findElements()   ....>returens multiple Elements


		//senior  1     ..>mutiple webelement returens all elements
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements capture :"+links.size());

		//iterate method
		
		for(WebElement ele:links) 
		{
			System.out.println(ele.getText());
		}

		//senior 2    ...>single webelemet returens single element
		
		List<WebElement> log = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Number of elements caputer2 :"+log.size());
           


		//senior 3  ...>   Element not present
		
//		List<WebElement> login = driver.findElements(By.xpath("//a[text()='Log i]"));
//		System.out.println(login.size());


	}

}
