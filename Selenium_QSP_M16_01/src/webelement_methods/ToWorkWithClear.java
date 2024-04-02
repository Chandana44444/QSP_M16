package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("a", "b", "c", "d");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(3000);
		driver.quit();

	}

}
