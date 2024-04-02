package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_02 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	File file=new File("./resources/Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
	
	int row_count = wb.getSheet("Sheet4").getPhysicalNumberOfRows();
	int data=wb.getSheet("Sheet4").getRow(0).getPhysicalNumberOfCells();
	
	String[] arr=new String[data];
	
	for(int i=0;i<data;i++) {
		arr[i]=wb.getSheet("Sheet4").getRow(0).getCell(i).toString();
	}
	
//	String fname = wb.getSheet("Sheet4").getRow(0).getCell(0).toString();
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
//	driver.findElement(By.id("FirstName")).sendKeys(fname);
	driver.findElement(By.id("FirstName")).sendKeys(arr[0]);
	driver.findElement(By.id("LastName")).sendKeys(arr[1]);
	driver.findElement(By.id("Email")).sendKeys(arr[2]);
	driver.findElement(By.id("Password")).sendKeys(arr[3]);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[4]);
	Thread.sleep(6000);
	driver.quit();
	
}
}
