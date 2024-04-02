package testng_basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCheckTestNG {
	@Test
	public void m() {
		Reporter.log("hi testng!");//on report
		Reporter.log("hi testng!",true);//on console
		}

}

//TERMINOLOGIES:-
//testng class->a class with atleast 1 @Test annotated method 
//test case->a method with @Test annotation
//test steps->instructions/statements that are present inside your test case