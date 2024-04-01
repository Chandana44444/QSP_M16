package actions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClick {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement forgot_pswd = driver.findElement(By.linkText("Forgotten password?"));
		
		Actions a=new Actions(driver);
		a.click(forgot_pswd).perform();
		driver.quit();
	}

}
