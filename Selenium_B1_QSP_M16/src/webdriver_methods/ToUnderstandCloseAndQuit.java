package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/46");
		Thread.sleep(9000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
//        driver.close();
		driver.quit();
	}

}