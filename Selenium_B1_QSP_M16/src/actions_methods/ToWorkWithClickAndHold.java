package actions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement Alphabet_C = driver.findElement(By.name("C"));
		
		Actions a=new Actions(driver);
		a.clickAndHold(Alphabet_C).perform();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
