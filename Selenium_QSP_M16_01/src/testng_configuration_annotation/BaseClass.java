package testng_configuration_annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
@BeforeSuite
public void beforesuite() {
	Reporter.log("From BeforeSuite",true);//once
	Reporter.log("connect to server of DB",true);
}
@BeforeTest
public void beforetest() {
	Reporter.log("From BeforeTest",true);
	Reporter.log("connect to database",true);
}
@BeforeClass
public void beforeclass() {
	Reporter.log("From BeforeClass",true);
	Reporter.log("opening browser",true);
}
@BeforeMethod
public void beforemethod() {
	Reporter.log("From BeforeMethod",true);
	Reporter.log("login",true);
}

@AfterMethod
public void aftermethod() {
	Reporter.log("From AfterMethod",true);
	Reporter.log("logout",true);
}
@AfterClass
public void afterclass() {
	Reporter.log("From AfterClass",true);
	Reporter.log("closing of browser",true);
	
}
@AfterTest
public void aftertest() {
	Reporter.log("From AfterTest",true);
	Reporter.log("dis-connect from server of DB",true);
}
@AfterSuite
public void aftersuite() {
	Reporter.log("From AfterSuite",true);
	Reporter.log("disconnect from database",true);
}
}
