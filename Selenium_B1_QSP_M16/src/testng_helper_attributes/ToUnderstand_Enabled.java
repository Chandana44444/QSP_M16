package testng_helper_attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class ToUnderstand_Enabled {

	@Test(enabled = true )
	public void m1() {
		Reporter.log("from m1",true);
		Reporter.log("***********",true);
	}
	
	@Test(enabled = false)
	public void m2() {
		int a=10/0;//exception 
		Reporter.log("from m2",true);
	}
	
	@Test(enabled=true,priority = -1)
	public void m3() {
		Reporter.log("from m3",true);
	}
	
	//by default enabled = true
	//ascii value
}
