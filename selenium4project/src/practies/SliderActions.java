package practies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.switchTo().frame("frame-one1434677811");
		
		driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("Slider size :"+slider.getSize());
		System.out.println(slider.getLocation());    //(825, 1378)
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slider, 200,0).perform();
	
	}

}
