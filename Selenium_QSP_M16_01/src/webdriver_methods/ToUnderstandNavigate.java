package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNavigate {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/46");
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.get("https://www.skillrary.com/");
		driver.navigate().back();
		System.out.println("Back:"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Forward:"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://www.naukri.com/");
		driver.quit();
		
	}

}
