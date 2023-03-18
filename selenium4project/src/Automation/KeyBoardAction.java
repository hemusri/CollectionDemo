package Automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/key_presses");

		Actions act = new Actions(driver);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.SHIFT).perform();

	}

}
