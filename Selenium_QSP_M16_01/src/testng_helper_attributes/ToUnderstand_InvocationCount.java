package testng_helper_attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstand_InvocationCount {

	@Test(invocationCount = 5 )
	public void m1() {
		Reporter.log("from m1",true);
		Reporter.log("***********",true);
	}
	
	@Test(invocationCount = 0)
	public void m2() {
		Reporter.log("from m2",true);
	}
	
	@Test()
	public void m3() {
		Reporter.log("from m3",true);
	}
	
	//by default invocationCount = 1
	//based on ascii value
}
