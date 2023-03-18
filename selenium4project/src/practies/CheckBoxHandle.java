package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame("frame-one1434677811");

		//1)Select single check box
		//	driver.findElement(By.xpath("//label[text()='Sunday']")).click();

		//2)select All checkbox

		//input[@type='checkbox']//..//label      //input[@type='checkbox' and @class='multiple_choice']
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']//..//label"));


		System.out.println("Total No of Check boxes :"+allcheckbox.size());

		//using normal for loop
		//		for(int i=0; i<=allcheckbox.size(); i++)
		//		{
		//			allcheckbox.get(i).click();
		//			Thread.sleep(2000);
		//		}

		for(WebElement option:allcheckbox)
		{

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", option);
			//			System.out.println(alloption);
			//			option.click();    //click option is not working using java script executor

		}

		
	}
}
