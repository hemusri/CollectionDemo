package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandles {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement selectProduct = driver.findElement(By.xpath("//select[@id='products']"));
		selectele(selectProduct, "Iphone");

		WebElement selectFile = driver.findElement(By.xpath("//select[@id='files']"));
		selectele(selectFile, "DOC file");

		WebElement selectNumber = driver.findElement(By.xpath("//select[@id='number']"));
		selectele(selectNumber, "3");

		WebElement selectAnimal = driver.findElement(By.xpath("//select[@id='animals']"));
		selectele(selectAnimal, "Cat");

		WebElement selectspeed = driver.findElement(By.xpath("//select[@id='speed']"));
		selectele(selectspeed, "Fast");	

	}

	public static void selectele(WebElement ele,String value)
	{
		Select drp = new Select(ele);
		List<WebElement> alloptions = drp.getOptions();

		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}

		}

	}
}