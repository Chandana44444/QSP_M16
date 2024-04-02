package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firstname_field = driver.findElement(By.id("FirstName"));
		WebElement lastname_field = driver.findElement(By.id("LastName"));
		System.out.println("*************************************");
		System.out.println("X axis of Fname:"+firstname_field.getLocation().getX());
		System.out.println("Y axis of Fname:"+firstname_field.getLocation().getY());
		System.out.println("*************************************");
		System.out.println("X aixs of Lname:"+lastname_field.getLocation().getX());
		System.out.println("Y axis of Lname:"+lastname_field.getLocation().getY());
		Thread.sleep(3000);
		driver.quit();		

	
	}

}
