package pop_ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithChildWindow_Pop_Up {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Google+")).click();
	Thread.sleep(4000);
	
	Set<String> all_windows_id = driver.getWindowHandles();
	//System.out.println(all_windows_id);
	
	for(String id:all_windows_id) {
		driver.switchTo().window(id);
		Thread.sleep(3000);
		if(driver.getTitle().contains("Demo Web Shop")) {
			driver.close();
		}
		
		
	}
}
}
