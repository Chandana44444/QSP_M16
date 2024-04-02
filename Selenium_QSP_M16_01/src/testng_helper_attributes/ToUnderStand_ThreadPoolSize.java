package testng_helper_attributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderStand_ThreadPoolSize {
@Test(invocationCount = 3,threadPoolSize = 2)
public void launch_DWS() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	driver.quit();
}
//sequential->one browser
//parallel->3 browser

}
