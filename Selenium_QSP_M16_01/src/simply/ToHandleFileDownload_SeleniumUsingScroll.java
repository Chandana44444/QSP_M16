package simply;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileDownload_SeleniumUsingScroll {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='4.17.0 (January 23, 2024)'])[3]")).click();
		Thread.sleep(4000);
		
//		Runtime.getRuntime().exec("./AutoItScripts/FileDownload.exe");
//		Thread.sleep(3000);
        driver.quit();
        
	}
}
