package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathDependantAndIndependant_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
        driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]/../../../..//a[@title=\"Show details for 50's Rockabilly Polka Dot Top JR Plus Size\"]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
