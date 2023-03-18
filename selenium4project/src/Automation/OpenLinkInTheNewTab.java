package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInTheNewTab {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);

		driver.findElement(By.xpath("//a[text()='Register']")).sendKeys(tab);

		String tab1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Log in']")).sendKeys(tab1);

	}

}
