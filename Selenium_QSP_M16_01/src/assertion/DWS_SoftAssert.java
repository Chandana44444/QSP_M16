package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DWS_SoftAssert {
@Test
public void DWS() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	SoftAssert sa=new SoftAssert();
	String registerPageTitle = "Demo Web Shop. Register";
	driver.get("https://demowebshop.tricentis.com/register");
	sa.assertEquals(driver.getTitle(), registerPageTitle, "user is in register page");
	driver.findElement(By.id("FirstName")).sendKeys("chandana");
	WebElement gender_btn = driver.findElement(By.id("gender-female"));
	//gender_btn.click();
	Thread.sleep(4000);
	sa.assertTrue(gender_btn.isSelected(), "gender is selected");
	System.out.println(gender_btn.isSelected());
	//sa.assertFalse(gender_btn.isSelected(), "gender is not selected");
	//gender_btn.click();
	Thread.sleep(5000);
	driver.quit();
	sa.assertAll();
}
}
