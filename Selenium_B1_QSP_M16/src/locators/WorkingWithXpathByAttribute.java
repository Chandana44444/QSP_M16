package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sso.godaddy.com/");
		Thread.sleep(8000);
//		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
//		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
