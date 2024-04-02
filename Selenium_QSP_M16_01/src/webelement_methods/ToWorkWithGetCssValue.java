package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement error_msg = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
		System.out.println("Error Message Text Color:"+error_msg.getCssValue("color"));
		System.out.println("Error Message Text font style:"+error_msg.getCssValue("font-family"));
		System.out.println("Error Message Text Background color:"+error_msg.getCssValue("background color"));
		//will not fetch any value bcoz no property name is present with that name for the particular element
		driver.quit();

	}

}
