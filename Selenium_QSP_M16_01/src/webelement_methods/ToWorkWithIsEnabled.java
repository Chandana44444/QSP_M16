package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement log_in_button = driver.findElement(By.cssSelector("button[type='submit']"));
		boolean boolean_res = log_in_button.isEnabled();
		System.out.println("is Login button enabled?:" + boolean_res);
		Thread.sleep(2000);

		System.out.println("**************************");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		WebElement login_button = driver.findElement(By.cssSelector("input[value='Log in']"));
		boolean DWS_Boolean_res = login_button.isEnabled();
		System.out.println("is Login button enabled?:" + DWS_Boolean_res);
		Thread.sleep(2000);
		driver.quit();

	}

}
