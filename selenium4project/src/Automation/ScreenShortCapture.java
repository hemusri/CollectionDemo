package Automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShortCapture {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		//Full page screenshot

		/*		TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(".//ScreenShort//homepage.png");
        FileUtils.copyFile(src, trg);
		 */



		//Screenshort of the Section/portion of the page

		/*		WebElement section = driver.findElement(By.xpath("//div[contains(@class,'product-grid home-page-produ')]"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File(".//ScreenShort//homepage.png");
        FileUtils.copyFile(src, trg);
		 */

		//Screenshort of section/portion of the page

		WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store')]"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//ScreenShort//log.png");
		FileUtils.copyFile(src, trg);

		driver.close();

	}

}
