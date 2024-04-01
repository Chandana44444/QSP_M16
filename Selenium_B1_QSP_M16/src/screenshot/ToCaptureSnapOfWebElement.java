package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureSnapOfWebElement {
public static void main(String[] args) throws IOException {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement icon = driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
	File source = icon.getScreenshotAs(OutputType.FILE);
	System.out.println(source);//temp
	LocalDateTime time=LocalDateTime.now();
	String date = time.toString();
	File destiny=new File("./screenshots/"+date+"IconSnap.png");
	
	try {
		FileHandler.copy(source, destiny);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
