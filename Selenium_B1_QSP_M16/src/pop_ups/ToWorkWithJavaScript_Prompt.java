package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToWorkWithJavaScript_Prompt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
//		a.dismiss();
		System.out.println(a.getText());
		a.sendKeys("Chandana");//sendKeys->supports only few browsers not all
//		a.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
