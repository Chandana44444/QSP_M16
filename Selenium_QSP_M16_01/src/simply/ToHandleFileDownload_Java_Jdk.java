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

public class ToHandleFileDownload_Java_Jdk {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.oracle.com/java/technologies/downloads/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'https://download.oracle')]")).click();
		Thread.sleep(3000);

        driver.quit();
        
	}
}
