package practies;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

//public class TestBarCode {
//
//	public static void main(String[] args) {

		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.switchTo().frame("frame-one1434677811");
//		
//		WebElement element = driver.findElement(By.xpath("//h2[text()='Bar Codes']//..//div//img[1]"));
//		
//		String src = element.getAttribute("src");
//		
//		URL url = new URL(src);
//		
//		BufferedImage img = ImageIO.read(url);
//		
//		LuminanceSource ls = new BufferedImageLuminanceSource(img);
//		
//		BinaryBitmap b = new BinaryBitmap(new HybridBinarizer(ls));
//		
//		Result result = new MultiFormatReader().decode(b);
//		
//		System.out.println(result.getText());
//	}
//
//	public static void main(String[] args) throws IOException, NotFoundException {
//
//		testBarcodeImage();
//		
//		
//		
//	}
//
//}
