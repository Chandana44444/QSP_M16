package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUpload {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	Thread.sleep(3000);
	WebElement btn = driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]"));
	//WebElement btn=driver.findElement(By.xpath("  //p[contains(text(),\"I have work \")]"));
	//driver.executeScript("window.scrollBy(0,700)");
	btn.click();
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\User\\Desktop\\Selenium\\Java_Selenium.pdf");
	Thread.sleep(7000);
	driver.quit();
}
}
