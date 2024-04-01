package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkText_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
//		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.partialLinkText("DIGITAL DOWNLOADS")).click();
		driver.quit();

		
	}

}
