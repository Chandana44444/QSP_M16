package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFrames {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.dream11.com/");
	driver.manage().window().maximize();
	
//	driver.switchTo().frame(0);
//	driver.switchTo().frame("send-sms-iframe");
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.id("regEmail")).sendKeys("87587878689");
	
//	driver.switchTo().parentFrame();//to its immediate parent frame
	driver.switchTo().defaultContent();//main frame
	Thread.sleep(2000);
	driver.findElement(By.id("hamburger")).click();
	
	Thread.sleep(4000);
	driver.quit();
}
}
