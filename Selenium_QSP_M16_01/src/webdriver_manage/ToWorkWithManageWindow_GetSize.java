package webdriver_manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_GetSize {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().minimize();
		 Dimension size = driver.manage().window().getSize();
		 System.out.println("Size:"+size);
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		Thread.sleep(3000);
		driver.quit();
	}
}
