package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToFetchTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://demowebshop.tricentis.com/");
		String title=driver1.getTitle();
		System.out.println(title);
	}
}
