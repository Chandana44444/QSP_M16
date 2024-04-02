package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWithNotification_Pop_up {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeOptions settings=new ChromeOptions();//avoid
	settings.addArguments("--disable-notifications");
	
	ChromeDriver driver=new ChromeDriver(settings);
	driver.get("https://in.puma.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
//	driver.quit();
	
//	Robot robot=new Robot();//handling
//	robot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(2000);
//	robot.keyPress(KeyEvent.VK_ENTER);
//	Thread.sleep(6000);
//	
//	robot.keyRelease(KeyEvent.VK_TAB);
//	robot.keyRelease(KeyEvent.VK_ENTER);
//	
	Thread.sleep(2000);
     
	driver.quit();	
}
}
