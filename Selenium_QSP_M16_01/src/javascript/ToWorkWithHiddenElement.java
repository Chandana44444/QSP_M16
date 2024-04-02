package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithHiddenElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(3000);
    WebElement hidden_ele = driver.findElement(By.cssSelector("input[name='custom_gender']"));
//    hidden_ele.sendKeys("kjhj");//ElementNotInteractableException
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='selenium';",hidden_ele);
	Thread.sleep(7000);
	driver.quit();
	
}
}
