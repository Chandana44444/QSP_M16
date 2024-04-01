package webdriver_manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_SetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(4000);
		Point p=new Point(47, 50);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
//		driver.quit();
	}

}
