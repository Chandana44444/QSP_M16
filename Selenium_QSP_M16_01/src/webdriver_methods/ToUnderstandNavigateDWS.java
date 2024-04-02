package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNavigateDWS {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		//driver.get("https://demowebshop.tricentis.com/register");
		driver.navigate().back();
		System.out.println("Back:"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Forward:"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().refresh();//refreshes current webpage
		System.out.println("Refresh:"+driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
