package practies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		
		//using sendkeys method
//		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\VY187JR\\OneDrive - EY\\Desktop\\EY detalis\\Personal details\\10TH.pdf");
		
		
		WebElement upload = driver.findElement(By.id("file-upload"));
		//driver.findElement(By.xpath("//input[@type='file']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", upload);   //click Action button
		
		/*
		 1)Copy the path
		 2)CTRL+V
		 3)Enter
		 
		 */
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//put path to file in clipboard
		StringSelection ss = new StringSelection("C:\\Users\\VY187JR\\OneDrive - EY\\Desktop\\EY detalis\\Personal details\\10TH.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
