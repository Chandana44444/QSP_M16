package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWorkWithExplicitWait {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(12));
	driver.get("https://www.shoppersstack.com/");
	explicitwait.until(ExpectedConditions.urlToBe("https://www.shoppersstack.com/"));
	driver.findElement(By.xpath("//span[text()='APPLE']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	
	WebElement check_btn = driver.findElement(By.id("Check"));
//	Thread.sleep(4000);
	explicitwait.until(ExpectedConditions.elementToBeClickable(check_btn));
	check_btn.click();
	
    Thread.sleep(7000);
    driver.quit();
	
}
}
