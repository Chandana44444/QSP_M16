package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firstname_field = driver.findElement(By.id("FirstName"));
		WebElement lastname_field = driver.findElement(By.id("LastName"));
		System.out.println("Tag name used for first name:"+firstname_field.getTagName());
		System.out.println("Tag name used for last name:"+lastname_field.getTagName());
		Thread.sleep(3000);
		driver.quit();

	
	}

}
