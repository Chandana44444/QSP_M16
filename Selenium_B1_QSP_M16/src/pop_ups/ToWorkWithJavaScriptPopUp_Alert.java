package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithJavaScriptPopUp_Alert {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
	
	Thread.sleep(3000);
	driver.quit();
}
}
