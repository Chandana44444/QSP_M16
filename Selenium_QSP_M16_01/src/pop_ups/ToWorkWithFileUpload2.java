package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUpload2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.totaljobs.com/Account/Register");
	Thread.sleep(3000);
	if(driver.findElement(By.xpath("//div[text()='Accept All']")).isDisplayed()) {
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();
	}
	Thread.sleep(3000);
	WebElement btn = driver.findElement(By.xpath("//div[text()='Upload your CV']"));
	btn.click();
	driver.findElement(By.xpath("//label[text()='from this device']")).sendKeys("C:\\Users\\User\\Desktop\\Selenium\\Java_Selenium.pdf");
	Thread.sleep(7000);
	driver.quit();
}
}
