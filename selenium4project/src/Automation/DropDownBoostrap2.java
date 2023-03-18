package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownBoostrap2 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

		List<WebElement> alldrp = driver.findElements(By.xpath("//ul//li//a//label//input"));
		System.out.println(alldrp.size());

		for(WebElement options:alldrp)
		{
			//select the check box in built option are reseving
			//String allOptions = options.getText();
			String allOptions = options.getAttribute("value");

			System.out.println("Print The All Value Of The BoostrapDropDown :"+allOptions);

		}

	}

}
