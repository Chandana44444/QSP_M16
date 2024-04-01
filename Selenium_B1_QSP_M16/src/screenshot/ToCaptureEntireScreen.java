package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntireScreen {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");	
	File source = driver.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	File destiny=new File("./screenshots/PageSnap.png");
	try {
		FileHandler.copy(source, destiny);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
}
}
