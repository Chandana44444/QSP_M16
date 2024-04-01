package launching_browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingDiffBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver1 = new ChromeDriver();
		Thread.sleep(3000);
		driver1.close();
		EdgeDriver driver2 = new EdgeDriver();
		Thread.sleep(3000);
		driver2.close();
		FirefoxDriver driver3 = new FirefoxDriver();
		Thread.sleep(3000);
		driver3.close();

	}

}
