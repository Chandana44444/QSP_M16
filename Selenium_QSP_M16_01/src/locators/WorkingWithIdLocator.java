package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("chandana");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
