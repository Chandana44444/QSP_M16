package dataprovider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic {
	@DataProvider(name="Day_01")
public String[][] m1() {
		String[][] arr1= {{"abc","selenium","1"},
				{"cde","selenium","2"},
				{"def","selenium","2"},
		};
		return arr1;
	}

	@DataProvider(name="Day_02")
public String[][] m2() {
	String[][] arr2= new String[2][3];
	arr2[0][0]="xyz";
	arr2[0][1]="selenium";
	arr2[0][2]="1";
	
	arr2[1][0]="hji";
	arr2[1][1]="selenium";
	arr2[1][2]="1";
	
	return arr2; 
	}

@Test(dataProvider = "Day_01")
public void info_of_mock(String name,String subject,String rating) {
	Reporter.log(name,true);
	Reporter.log(subject,true);
	Reporter.log(rating,true);
}
}
