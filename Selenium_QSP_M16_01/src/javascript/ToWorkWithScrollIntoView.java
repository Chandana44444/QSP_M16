package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithScrollIntoView {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/books");
	
	Thread.sleep(3000);
	
	WebElement ele_to_scroll = driver.findElement(By.linkText("Health Book"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollIntoView(false);",ele_to_scroll );//bottom of the page
	js.executeScript("arguments[0].scrollIntoView(true);",ele_to_scroll );//top of the page
//	js.executeScript("arguments[1].scrollIntoView(true);",ele_to_scroll );//javascriptexception since nothing is stored in index "1" as i have only one web element been stored in array

	
	Thread.sleep(6000);

	driver.quit();
}
}


//arr={ele_to_scroll};
//length->1,index->0

//arr={webele1,webele2,...};

