package actions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		driver.manage().window().maximize();
        
		WebElement plus_button = driver.findElement(By.id("add"));
		WebElement minus_button = driver.findElement(By.id("minus"));

		Actions a=new Actions(driver);
		a.doubleClick(plus_button).perform();//2
		a.doubleClick(plus_button).perform();//3
		Thread.sleep(3000);
		a.doubleClick(minus_button).perform();//2
		a.doubleClick(minus_button).perform();//1
		Thread.sleep(3000);
        driver.quit();
		
		
	}

}
