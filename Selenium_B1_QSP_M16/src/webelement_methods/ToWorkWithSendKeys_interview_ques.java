package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSendKeys_interview_ques {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search_box = driver.findElement(By.id("small-searchterms"));
		//search_box.sendKeys("a", "b", "c", "d");
		search_box.sendKeys("a", "b", "c", "d",Keys.CONTROL+"a");
		search_box.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(5000);
		search_box.clear();
		search_box.sendKeys(Keys.CONTROL+"v");

		Thread.sleep(2000);
		driver.quit();

	}

}
