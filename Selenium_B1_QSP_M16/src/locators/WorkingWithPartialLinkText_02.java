package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkText_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.partialLinkText("Study & Office")).click();
		Thread.sleep(3000);
		driver.quit();

		
	}

}
