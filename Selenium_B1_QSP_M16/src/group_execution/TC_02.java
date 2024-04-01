package group_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02 {
	@Test(groups = "Phone")
	public void launch_Vivo() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivo.com/in/");
		Reporter.log("From Vivo",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
