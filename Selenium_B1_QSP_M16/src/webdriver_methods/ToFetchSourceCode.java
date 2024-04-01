package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		String code=driver.getPageSource();
		System.out.println(code);
		driver.quit();
	}

}
