package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sso.godaddy.com/");
		Thread.sleep(8000);
//		driver.findElement(By.xpath("//label[text()='Keep me signed in on this device']")).clear();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Keep me signed in on this device']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
