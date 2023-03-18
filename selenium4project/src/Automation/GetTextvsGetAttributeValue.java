package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsGetAttributeValue {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement emailbox = driver.findElement(By.xpath("//input[@id='Email']"));

		//capaturing the vale inputbox

		System.out.println("capaturing the vaule getAttribute() :"+emailbox.getAttribute("value"));   //admin@yourstore.com
		System.out.println("capaturing the value getText():"+emailbox.getText());

		/*	emailbox.clear();
		emailbox.sendKeys("admin123@gmail.com");    */


		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println(button.getAttribute("type"));    //submit
		System.out.println(button.getAttribute("class"));     //button-1 login-button

		System.out.println(button.getText());     //LOG IN

		//		WebElement lable=driver.findElement(By.xpath("//div[@class='page login-page']//h1"));
		//		System.out.println(lable.getAttribute("class"));
		//		System.out.println(lable.getText());

		String lable=driver.findElement(By.xpath("//div[@class='page login-page']//h1")).getText();
		System.out.println(lable);    //Admin area demo

		System.out.println(driver.getTitle());

	}

}
