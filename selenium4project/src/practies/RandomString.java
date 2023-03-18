package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomString {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
//		String ranname = RandomStringUtils.randomAlphanumeric(8);
//		
//		String email = ranname+"Gamail.com";
//		
//		System.out.println("Random Email Genaration :"+email);
//		
//		driver.findElement(By.id("email_create")).sendKeys(email);
//		
//		driver.findElement(By.xpath("//button[@id='SubmitCreate']//span")).click();

	}

}
