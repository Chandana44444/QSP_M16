package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisabledField_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/cssref/tryit.php?filename=trycss3_enabled_disabled");
	
	driver.switchTo().frame(0);
	
	WebElement disabled_element = driver.findElement(By.xpath("//input[@value=\"Disneyland\"]"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='hi all';", disabled_element);
	
	Thread.sleep(6000);
	driver.quit();
	
	//value is a method present inside your javascript which is similar to sendkeys method of selenium
   //hidden element->fb>task
}
}
