package practies;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class ReadingQRCode {

	public static void main(String[] args) {

		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe"); 
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		
//		driver.get("https://testautomationpractice.blogspot.com/");
//		
//		String qrCodeURL = driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
//		System.out.println(qrCodeURL);
//		
//		URL url = new URL(qrCodeURL);
//		
//		BufferedImage bufferimg = ImageIO.read(url);
//		
//		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferimg);
//		
//		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
//		
//		Result result = new MultiFormatReader().decode(binaryBitmap);
//		
//		System.out.println("QR Code Date :"+result.getText());
		
	}


}
