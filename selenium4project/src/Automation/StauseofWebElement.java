package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StauseofWebElement {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fregisterresult%2F1");

		//is displayed() And id Enabled() Method

		WebElement searchel =driver.findElement(By.xpath("//input[@type='text' and @id='small-searchterms']"));

		System.out.println("Displayed the status :"+searchel.isDisplayed());   //true
		System.out.println("Enabled the status :"+searchel.isEnabled());   //true

		//is Selected()

		WebElement male=driver.findElement(By.xpath("//input[@value='M']"));

		WebElement Female=driver.findElement(By.xpath("//input[@value='F']"));

		System.out.println(male.isSelected());    //false
		System.out.println(Female.isSelected());   //false

		male.click();    //select the male radio button

		System.out.println(male.isSelected());     //true
		System.out.println(Female.isSelected());     //false

		Female.click();
		System.out.println(male.isSelected());     //false
		System.out.println(Female.isSelected());       //true

	}

}
