package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUpload3 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://interimjobs.kornferry.com/candidates/submit-your-resume");
	driver.findElement(By.id("Resume")).sendKeys("C:\\Users\\User\\Desktop\\Selenium\\Selenium introduction.pdf");
	Thread.sleep(10000);
	driver.quit();
}
}

//can use sendkeys iff built using input tag
//url:https://interimjobs.kornferry.com/candidates/submit-your-resume