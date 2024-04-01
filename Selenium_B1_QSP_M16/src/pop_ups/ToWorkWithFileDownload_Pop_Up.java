package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileDownload_Pop_Up {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'https://download.oracle')]")).click();
	
//	Thread.sleep(4000);
//	driver.quit();

}
}
