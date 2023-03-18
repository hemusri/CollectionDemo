package practies;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {


		Logger log=LogManager.getLogger(Buttons.class.getName());
		log.debug("Demo Test is excutor");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.debug("chrome is lanch");
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		log.debug("get the URL");
		driver.switchTo().frame("frame-one1434677811");

		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();

	}

}
