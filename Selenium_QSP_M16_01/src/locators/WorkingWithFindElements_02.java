package locators;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements_02 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		//System.out.println(elements);//address
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
			Thread.sleep(6000);
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
