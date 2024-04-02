package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(4000);

		WebElement multi_select_list = driver.findElement(By.id("cars"));

		Select multi = new Select(multi_select_list);
	
		multi.selectByValue("399");
		multi.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		multi.selectByIndex(0);
	
		Thread.sleep(3000);
		
		System.out.println("first selected option:"+multi.getFirstSelectedOption());
		
		System.out.println("first selected option:"+multi.getFirstSelectedOption().getText());
		
		int total = multi.getOptions().size();
		multi.selectByIndex(total-1);
		

//		multi.deselectByIndex(0);
//		multi.deselectByValue("399");
//		multi.deselectByVisibleText("INR 100 - INR 199 ( 16 )");

		//multi.deselectAll();


	}

}
