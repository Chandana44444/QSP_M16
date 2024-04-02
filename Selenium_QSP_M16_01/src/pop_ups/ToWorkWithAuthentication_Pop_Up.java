package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAuthentication_Pop_Up {
public static void main(String[] args) throws AWTException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	//To Avoid
//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	Thread.sleep(2000);
	
	//To Handle
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	robot.keyPress(KeyEvent.VK_A);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	robot.keyRelease(KeyEvent.VK_A);
	Thread.sleep(1000);
	
//	Thread.sleep(10000);
	robot.keyPress(KeyEvent.VK_D);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_N);
	Thread.sleep(2000);
//	robot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(1000);
//	robot.keyPress(KeyEvent.VK_A);
//	robot.keyPress(KeyEvent.VK_D);
//	robot.keyPress(KeyEvent.VK_M);
//	robot.keyPress(KeyEvent.VK_I);
//	robot.keyPress(KeyEvent.VK_N);
//	Thread.sleep(1000);
//	robot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(1000);
//	robot.keyPress(KeyEvent.VK_ENTER);
//	
	robot.keyRelease(KeyEvent.VK_A);
//	robot.keyRelease(KeyEvent.VK_D);
//	robot.keyRelease(KeyEvent.VK_M);
//	robot.keyRelease(KeyEvent.VK_I);
//	robot.keyRelease(KeyEvent.VK_N);
//	robot.keyRelease(KeyEvent.VK_TAB);
//	robot.keyRelease(KeyEvent.VK_ENTER);
//	
//	Thread.sleep(5000);
//	driver.quit();	
	
}
}
