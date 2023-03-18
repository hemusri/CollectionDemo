package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClick {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame(0);

		WebElement firstname = driver.findElement(By.xpath("//input[@type='text' and @name='RESULT_TextField-1']"));
		firstname.sendKeys("krishna");
		firstname.clear();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='krishna'", firstname);

		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
		//js.executeAsyncScript("arguments[0].click();", submit);

	}

}
