package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement remember_button = driver.findElement(By.id("RememberMe"));
		System.out.println("Before Selecting:" + remember_button.isSelected());
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		System.out.println("After Selecting:" + driver.findElement(By.id("RememberMe")).isSelected());
		driver.quit();

	}

}
