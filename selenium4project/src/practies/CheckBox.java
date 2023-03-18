package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.id("monday")).click();
		
		List <WebElement> allcheckboxvalue = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println("Check box size :"+allcheckboxvalue.size());
		
//		for(int i=0; i<=allcheckboxvalue.size(); i++)
//		{
//			allcheckboxvalue.get(i).click();
//		}
		
		//All values
	/*	for(WebElement checkbox:allcheckboxvalue)
		{
			checkbox.click();
		}*/
		
		
		//3)select by checkboxs by choise 
	
	/*	for(WebElement checkbox:allcheckboxvalue)
		{
			String checkele = checkbox.getAttribute("id");
			if(checkele.equals("monday") || checkele.equals("sunday"))
			{
				checkbox.click();
			}
		}
		*/
		
		//4)Select by last 2 check boxes 
		//Totalnumber of check boxes - no of check boxs to select = starting index
		//7-2=5
		
		int totalcheckbox = allcheckboxvalue.size();
		/*
		for(int i=totalcheckbox-2; i<totalcheckbox; i++)
		{
			allcheckboxvalue.get(i).click();
		}
		*/
		
		for(int i=0; i<totalcheckbox; i++)
		{
			if(i<2)
			{
				allcheckboxvalue.get(i).click();
			}
		}
		
	

}


}
