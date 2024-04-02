package testng_helper_attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstand_DependsOnMethod_AlwaysRun {

@Test(dependsOnMethods = "register",alwaysRun = true)
public void login() {
	int a=9/0;
	Reporter.log("from login",true);
}
@Test()
public void register() {
	int a=10/0;
	Reporter.log("from register",true);
}
}
