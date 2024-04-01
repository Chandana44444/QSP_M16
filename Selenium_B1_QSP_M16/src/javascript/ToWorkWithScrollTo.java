package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithScrollTo {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,500);");
	Thread.sleep(3000);
	js.executeScript("window.scrollTo(0,600);");
	Thread.sleep(3000);
//	js.executeScript("window.scrollTo(0,500);");//not possible since scrollTo can scroll only once
//	Thread.sleep(2000);
//	js.executeScript("window.scrollTo(0,-500);");
	js.executeScript("window.scrollTo(0,400);");//scroll up
	js.executeScript("window.scrollTo(0,700);");//scroll down



	
	Thread.sleep(6000);

	driver.quit();
}
}
