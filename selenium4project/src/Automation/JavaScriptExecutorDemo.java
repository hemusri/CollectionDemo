package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));


		//Syntax

		//		JavascriptExecutor js = (JavascriptExecutor)driver;
		//		js.executeScript(Script, args);


		//Drawing border & take screenshort

		/*		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawBorder(logo, driver);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//Screenshorts//logo.png");
		FileUtils.copyFile(src, trg);
		 */

		//Getting title of the page

		/*		String title=JavaScriptUtil.gettitleByJS(driver);
		System.out.println(title);
		 */

		//click action

		/*		WebElement reglink=driver.findElement(By.xpath("//a[text()='Register']"));
		JavaScriptUtil.clickElementByJS(reglink, driver);
		 */

		//Generate alert

		//		JavaScriptUtil.generateAlert(driver, "This is my Alert.....");


		//Refreshing the page

		//		JavaScriptUtil.refreshBrowserByJS(driver);

		//Scrolling down the page

		//		JavaScriptUtil.scrollPageDown(driver);
		//		Thread.sleep(3000);

		//Scroll Up Page

		//		JavaScriptUtil.scrollPageUP(driver);

		//Zoom Page

		//		JavaScriptUtil.zoomPageJS(driver);

		//flash

		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.flash(logo, driver);

	}

}
