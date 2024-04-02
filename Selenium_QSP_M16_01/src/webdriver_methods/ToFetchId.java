package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		String Id=driver.getWindowHandle();
		System.out.println(Id);
		Thread.sleep(2000);
		driver.quit();
	}

}
