package actions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithMouseHover_MoveToEle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement computer = driver.findElement(By.partialLinkText("COMPUTERS"));

		Actions a = new Actions(driver);
		a.moveToElement(computer).perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
