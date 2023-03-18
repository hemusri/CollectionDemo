package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownBoostrap {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		driver.findElement(By.id("btnDropdownDemo")).click();

		List<WebElement> alldrp = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));

		for(WebElement option:alldrp)
		{
			//String optionText = option.getText();

			if(option.getText().equals("HTML"))
			{
				option.click();
				break;
			}

		}
	}

	}
