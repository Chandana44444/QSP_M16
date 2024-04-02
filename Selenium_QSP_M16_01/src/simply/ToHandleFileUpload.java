package simply;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUpload {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.totaljobs.com/Account/Register");
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[text()='Accept All']")).isDisplayed()) {
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();}
		driver.findElement(By.id("btnCVUpload")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='from this device']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoItScripts/FileUpload.exe");
		Thread.sleep(6000);
        driver.quit();
        
	}
}
