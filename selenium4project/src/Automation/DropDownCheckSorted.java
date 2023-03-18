package Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCheckSorted {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();

		Select drop = new Select(driver.findElement(By.name("fromPort")));

		List<WebElement> option = drop.getOptions();

		ArrayList originallist = new ArrayList();
		ArrayList templist = new ArrayList();

		for(WebElement opti:option) 
		{
			originallist.add(opti.getText());
			templist.add(opti.getText());
		}

		System.out.println("Original list :"+originallist);
		System.out.println("Temp lis :"+templist);

		Collections.sort(templist);   //sorted order

		System.out.println("Original list :"+originallist);
		System.out.println("Temp lis :"+templist);

		if(originallist.equals(templist))
		{
			System.out.println("DropDown sorted");
		}
		else
		{
			System.out.println("DropDown Unsorted");
		}

	}

}
