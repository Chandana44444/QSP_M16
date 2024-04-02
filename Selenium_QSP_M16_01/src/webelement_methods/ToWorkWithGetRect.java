package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetRect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firstname_field = driver.findElement(By.id("FirstName"));
		WebElement lastname_field = driver.findElement(By.id("LastName"));
		System.out.println("X axis of first name field:"+firstname_field.getRect().getX());
		System.out.println("Y axis of first name field:"+firstname_field.getRect().getY());
		System.out.println("*************************************");
		System.out.println("X axis of last name field:"+lastname_field.getRect().getX());
		System.out.println("Y axis of last name field:"+lastname_field.getRect().getY());
		System.out.println("*************************************");
		System.out.println("Height of Fname:"+firstname_field.getRect().getHeight());
		System.out.println("Width of Fname:"+firstname_field.getRect().getWidth());
		System.out.println("*************************************");
		System.out.println("Height of Lname:"+lastname_field.getRect().getHeight());
		System.out.println("Width of Lname:"+lastname_field.getRect().getWidth());
		Thread.sleep(3000);
		driver.quit();

	
	}

}
