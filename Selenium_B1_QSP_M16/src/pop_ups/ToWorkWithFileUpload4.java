package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUpload4 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://resume.naukri.com/cv-submission");
	driver.findElement(By.id("infile")).sendKeys("C:\\Users\\User\\Desktop\\Selenium\\selenium notes online.pdf");
	Thread.sleep(10000);
	driver.quit();
}
}

//can use sendkeys iff built using input tag
//url:https://interimjobs.kornferry.com/candidates/submit-your-resume