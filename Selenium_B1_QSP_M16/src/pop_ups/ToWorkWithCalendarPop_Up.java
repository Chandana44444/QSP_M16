package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWithCalendarPop_Up {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://in.via.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.id("wzrk-cancel")).click();
	
	driver.findElement(By.xpath("(//div[@class='calendar-icon'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[text()='15'])[1]")).click();
//	driver.findElement(By.xpath("(//div[@data-date='9'])[1]")).click();
//	driver.findElement(By.xpath("//div[text()='6']")).click();
//	driver.findElement(By.xpath("//div[contains(text(),\"20\")]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class=\"element return-element\"]")).click();
//	driver.findElement(By.xpath("(//div[@class='calendar-icon'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[text()='12'])[4]")).click();
	Thread.sleep(4000);
	driver.quit();
	
	
}
}
