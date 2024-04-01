package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.name("email")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(2000);
		driver.quit();
	}

}
