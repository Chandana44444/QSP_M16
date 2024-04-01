package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_01 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	File file=new File("./resources/Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
		
    String fname = wb.getSheet("Sheet4").getRow(0).getCell(0).toString();
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.findElement(By.id("FirstName")).sendKeys(fname);
	
	Thread.sleep(6000);
	driver.quit();
	
}
}
