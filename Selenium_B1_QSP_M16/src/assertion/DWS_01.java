package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_01 {
@Test
public void DWS() {
	ChromeDriver driver=new ChromeDriver();
	String registerPageTitle = "Demo Web Shop";
	driver.get("https://demowebshop.tricentis.com/register");
	if(driver.getTitle().equals(registerPageTitle)) {
		System.out.println("user is in DWS Register Page");
	}
	else {
		System.out.println("user is not in DWS Register Page");
	}
	driver.findElement(By.id("FirstName")).sendKeys("chandana");
}
}
