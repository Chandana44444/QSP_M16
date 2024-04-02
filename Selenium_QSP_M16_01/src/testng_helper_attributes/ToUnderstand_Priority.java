package testng_helper_attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstand_Priority {

	@Test(priority = 0)
	public void m1() {
		Reporter.log("from m1",true);
	}
	
	@Test(priority = -1)
	public void m2() {
		Reporter.log("from m2",true);
	}
	
	@Test(priority = -6)
	public void m3() {
		Reporter.log("from m3",true);
	}
	
	//by default priority = 0
	//lowest to highest
	//m-109 1-49 =>158
	//m-109 2-50 =>159
	//m-109 3-60 =>169
}
