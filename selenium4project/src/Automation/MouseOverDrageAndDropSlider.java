package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverDrageAndDropSlider {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement min_valu= driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));

		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("Slider size :"+slider.getSize());    // (571, 15)

		System.out.println("Location of the min slider :"+min_valu.getLocation());  //(0,4)
		System.out.println("Height & and Width of the element :"+min_valu.getSize());

		Actions act = new Actions(driver);
		act.dragAndDropBy(min_valu, 200, 2).perform();

	}

}
