package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DWS_HardAssert {
@Test
public void DWS() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	String registerPageTitle = "Demo Web Shop. Register";
	driver.get("https://demowebshop.tricentis.com/register");
	Assert.assertEquals(driver.getTitle(), registerPageTitle,"user is in DWS Register Page");
	driver.findElement(By.id("FirstName")).sendKeys("chandana");
	WebElement gender_btn = driver.findElement(By.id("gender-female"));
	gender_btn.click();
	//Assert.assertTrue(gender_btn.isSelected(), "gender is selected");
	Assert.assertFalse(gender_btn.isSelected(), "gender is not selected");
	Thread.sleep(5000);
	driver.quit();
}
}
