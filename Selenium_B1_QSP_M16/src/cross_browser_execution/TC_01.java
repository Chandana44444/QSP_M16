package cross_browser_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_01 {
//	WebDriver driver;//upcasting
	String browsername="chrome";
	
	@Parameters("browsername")
	@Test
	public void launch_Mi(String browsername) throws InterruptedException {
		//Reporter.log(browsername,true);
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
		driver.get("https://in.event.mi.com/in/");
		Reporter.log("From Mi",true);
		Thread.sleep(4000);
		driver.quit();
	}

}