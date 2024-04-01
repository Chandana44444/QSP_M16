package actions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement dsty = driver.findElement(By.id("droppable"));
	
	Actions a=new Actions(driver);
	Thread.sleep(4000);
	a.dragAndDrop(src, dsty).perform();
	Thread.sleep(4000);
	driver.quit();
	
	
}
}
