package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firstname_field = driver.findElement(By.id("FirstName"));
		WebElement lastname_field = driver.findElement(By.id("LastName"));
		System.out.println("*************************************");
		System.out.println("Height of Fname:"+firstname_field.getSize().getHeight());
		System.out.println("Width of Fname:"+firstname_field.getSize().getWidth());
		System.out.println("*************************************");
		System.out.println("Height of Lname:"+lastname_field.getSize().getHeight());
		System.out.println("Width of Lname:"+lastname_field.getSize().getWidth());
		Thread.sleep(3000);
		driver.quit();		

	
	}

}
