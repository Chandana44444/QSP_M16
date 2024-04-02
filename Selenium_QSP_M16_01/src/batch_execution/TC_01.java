package batch_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01 {
	@Test
	public void launch_Mi() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/");
		Reporter.log("From Mi",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
