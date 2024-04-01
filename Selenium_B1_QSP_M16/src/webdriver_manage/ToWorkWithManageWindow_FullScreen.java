package webdriver_manage;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_FullScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(6000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.quit();
	}

}
