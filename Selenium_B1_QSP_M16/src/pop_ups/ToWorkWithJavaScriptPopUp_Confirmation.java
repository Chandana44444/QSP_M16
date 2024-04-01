package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithJavaScriptPopUp_Confirmation {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://licindia.in/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Close']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[title='Pay Premium Online']")).click();
	
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();//ok
//	a.dismiss();//cancel
	Thread.sleep(3000);
	driver.quit();
	}
}
