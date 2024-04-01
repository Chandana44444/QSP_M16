package testng_helper_attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstand_Groups {

	@Test(groups = "functional")
	public void TC_01() {
		//int a=7/0;//fail
		Reporter.log("From TC_01",true);
	}
	@Test(groups = "functional")
	public void TC_02() {//passed
		//int a=2/0;
		Reporter.log("From TC_02",true);
	}
	@Test(groups = "integration",dependsOnGroups = "functional")
	public void TC_03() {//skipped
		Reporter.log("From TC_03",true);
	}
}
