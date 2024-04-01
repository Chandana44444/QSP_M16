package webdriver_manage;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_Max {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	}

}
