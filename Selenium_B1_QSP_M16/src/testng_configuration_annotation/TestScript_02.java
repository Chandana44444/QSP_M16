package testng_configuration_annotation;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_02 extends BaseScript {
@Test
public void method_01() throws InterruptedException {
	Reporter.log("from test script-02",true);
	driver.findElement(By.id("small-searchterms")).sendKeys("books");
	Thread.sleep(4000);
}
}
