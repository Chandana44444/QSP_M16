package cross_browser_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_04 {
	@Parameters("browsername")
	@Test
	public void launch_Amazon(String browsername) throws InterruptedException {
		WebDriver driver=null;//upcasting
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser name");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("From Amazon",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
