package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("day"));
		Select date_select=new Select(date) ;
//		date_select.selectByValue("15");
//		date_select.selectByVisibleText("31");
		date_select.selectByIndex(14);//15
//		date_select.deselectByIndex(14);//multi select list box
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
