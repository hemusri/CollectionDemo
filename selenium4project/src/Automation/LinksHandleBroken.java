package Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksHandleBroken {

	public static void main(String[] args) throws MalformedURLException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links= driver.findElements(By.tagName("a"));

		int brokenlink = 0;

		for(WebElement elment:links) 
		{

			String url = elment.getAttribute("href");
			
			if(url==null  || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}

			URL link = new URL(url);
			try 
			{
				HttpsURLConnection httpconn = (HttpsURLConnection)link.openConnection();
				httpconn.connect();

				if(httpconn.getResponseCode()>=400)
				{
					System.out.println(httpconn.getResponseCode()+url+"    is"+"    Broken link");
					brokenlink++;
				}
				else
				{
					System.out.println(httpconn.getResponseCode()+url+ "  is"+"  Valid Link");
				}


			} catch (Exception e)
			{


			}
		}
		System.out.println("Number of broken links :"+brokenlink);
		driver.quit();

	}

}
