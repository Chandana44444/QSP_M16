package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisabledField {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/index.php");
	
	WebElement disabled_element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='hi all';", disabled_element);
	
	Thread.sleep(6000);
	driver.quit();
	
	//value is a method present inside your javascript which is similar to sendkeys method of selenium
   //hidden element->fb>task
}
}
