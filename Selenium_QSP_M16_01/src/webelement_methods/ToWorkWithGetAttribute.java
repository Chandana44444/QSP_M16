package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys("Chandana");
		Thread.sleep(3000);
	    System.out.println("Data of Firstname TextField is:"+ fname.getAttribute("value"));
	    System.out.println("Data of Firstname TextField is:"+ fname.getAttribute("data-valmsg-for"));
	    //will give you null as a result bcoz no attribute name with that name is present for the element
	    driver.quit();
	}

}
