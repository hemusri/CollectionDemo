package Automation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkes {

	public static void main(String[] args) throws InterruptedException, IOException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println(links.size());

		for(WebElement link:links)
		{	
			String linkURL = link.getAttribute("href");

			URL url = new URL(linkURL);

			URLConnection urlConnections = url.openConnection();

			HttpsURLConnection httpConnction = (HttpsURLConnection)urlConnections;
			httpConnction.setConnectTimeout(5000);
			httpConnction.connect();

			if(httpConnction.getResponseCode() == 200)

				System.out.println(linkURL + " - "+httpConnction.getResponseMessage());
			else			
				System.out.println(linkURL+" - "+httpConnction.getResponseCode());
			httpConnction.disconnect();			
		}
		driver.quit();

	}

}
