package webdriver_manage;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_Min {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().minimize();
		Thread.sleep(6000);
		driver.quit();
	}

}
