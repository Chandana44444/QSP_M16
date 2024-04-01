package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		driver.quit();
	}

}
