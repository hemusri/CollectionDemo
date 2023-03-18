package Automation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		//How To Capture cookies from browser
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of the Cookies :"+cookies.size());

		//How To print cookies from browser?
		for(Cookie eachcookies:cookies) 
		{
			System.out.println(eachcookies.getName()+"  :  "+eachcookies.getValue());

		}


		//How To Add the Cookies In browser
		System.out.println("After Adding the Cookies in browser.........");


		Cookie cookieobject = new Cookie("MyCookies123","123456");
		driver.manage().addCookie(cookieobject);

		Set<Cookie> cookiess2 = driver.manage().getCookies();
		System.out.println("Size After Adding the Cookies :"+cookiess2.size());

		for(Cookie eachaddcookie:cookiess2) 
		{
			System.out.println(eachaddcookie.getName()+ "   :  "+eachaddcookie.getValue());
		}


		//How To delete spicfic Cookie from the browser
		//		driver.manage().deleteCookie(cookieobject);
		//		cookies = driver.manage().getCookies();
		//		System.out.println("detele Cookies After print :"+cookies.size());


		//How To delete the spicific name of the cookies
		driver.manage().deleteCookieNamed("MyCookies123");
		cookies = driver.manage().getCookies();
		System.out.println("detele Cookies After print :"+cookies.size());

		//delete the all cookies 
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("detele Cookies After print :"+cookies.size());

		driver.quit();

	}

}
