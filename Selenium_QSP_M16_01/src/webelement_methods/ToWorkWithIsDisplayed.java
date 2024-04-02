package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
        Thread.sleep(9000);
		WebElement English = driver.findElement(By.partialLinkText("ENGLISH"));
//		boolean boolean_res = English.isDisplayed();
		boolean boolean_res=false;
		if(boolean_res) {
			driver.findElement(By.partialLinkText("SIGN IN")).click();
		}
        Thread.sleep(2000);
        driver.quit();
	}

}
