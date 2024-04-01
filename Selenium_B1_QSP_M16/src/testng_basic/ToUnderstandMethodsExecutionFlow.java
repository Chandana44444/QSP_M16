package testng_basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandMethodsExecutionFlow {
	@Test
	public void a0() {
		Reporter.log("from a0",true);
	}

	@Test
	public void b9() {
		Reporter.log("from b9",true);
	}
	
	@Test
	public void b4() {
		Reporter.log("from b4",true);
	}
	
	
	//ascii value
	//m:109  1:49-->low :158  2
	//m:109  2:50-->high :159  3
	//m:109  0:48-->low :157  1
	
	//low-high:a0,b4,b9

}
