package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathDependantAndIndependant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		driver.findElement(By.xpath("//a[contains(text(),'Blue')]/../../..//img[contains(@title,'Show')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Blue')]/../../..//input[@type='button']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
