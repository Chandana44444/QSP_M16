package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWS {
	@DataProvider(name="login_01",parallel = true)
public String[][] login_01() throws EncryptedDocumentException, IOException {
	File file=new File("./resources/Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
	
	int rowcount = wb.getSheet("Sheet7").getPhysicalNumberOfRows();
	int cellcount = wb.getSheet("Sheet7").getRow(0).getPhysicalNumberOfCells();
	
	String[][] arr=new String[rowcount][cellcount];
	
	for(int i=0;i<rowcount;i++) {
		for(int j=0;j<cellcount;j++) {
			arr[i][j]=wb.getSheet("Sheet7").getRow(i).getCell(j).toString();
		}
	}
	return arr;
	}
	
	@Test(dataProvider = "login_01")
	public void DWS_Login(String[] arr) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(arr[0]);
		driver.findElement(By.id("Password")).sendKeys(arr[1]);
		Thread.sleep(8000);
		driver.close();
		
	}
}
	
	

