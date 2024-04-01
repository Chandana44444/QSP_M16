package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithHiddenElement_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
	Thread.sleep(3000);
    WebElement hidden_ele = driver.findElement(By.cssSelector("input[name='custom_gender']"));
//    hidden_ele.sendKeys("kjhj");//ElementNotInteractableException
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='selenium';",hidden_ele);
	Thread.sleep(7000);
	driver.quit();
	
}
}
