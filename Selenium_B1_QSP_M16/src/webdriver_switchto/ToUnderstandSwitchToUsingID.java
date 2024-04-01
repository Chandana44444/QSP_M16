package webdriver_switchto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSwitchToUsingID {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Selenium/MultipleWindows/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(8000);
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		
		for(String id:allwindowsid) {
			System.out.println(id);
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
	}

}
