package testng_configuration_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseScript {
	WebDriver driver;
	@Parameters("browsername")
@BeforeClass
public void launch_browser(String browsername) {
	Reporter.log("from before class",true);
	if(browsername.equals("chrome")) {
	driver=new ChromeDriver();}
	else { 
		driver=new EdgeDriver();}
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
}
@AfterClass
public void closing_browser() {
	Reporter.log("from afterclass",true);
	driver.quit();
}
@BeforeMethod
public void login() {
	Reporter.log("from before method",true);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("xyzabc");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
}
@AfterMethod
public void logout() {
	Reporter.log("from after method",true);
	driver.findElement(By.linkText("Log out")).click();
}
}
