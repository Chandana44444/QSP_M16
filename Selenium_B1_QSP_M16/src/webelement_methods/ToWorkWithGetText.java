package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement error_msg = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
		System.out.println("Error Message Text:"+error_msg.getText());
		driver.quit();

	}

}
