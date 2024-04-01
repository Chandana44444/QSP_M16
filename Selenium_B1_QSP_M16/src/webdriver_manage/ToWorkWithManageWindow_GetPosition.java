package webdriver_manage;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_GetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
//		driver.manage().window().minimize();
//		Thread.sleep(6000);
		int x_axis = driver.manage().window().getPosition().getX();
		int y_axis = driver.manage().window().getPosition().getY();
		System.out.println(x_axis+" "+y_axis);
		Thread.sleep(3000);
//		driver.quit();
	}

}
