package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class FromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
	File file=new File("./resources/Excel.xlsx");//giving location of file
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb_1=WorkbookFactory.create(fis);
//	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(2).getCell(5).getBooleanCellValue());
//	System.out.println("***************************");
//	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue());
//	System.out.println("***************************");
//	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(4).getCell(7).getNumericCellValue());
//	System.out.println("***************************");
//	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(4).getCell(3).getLocalDateTimeCellValue());
//	System.out.println("***************************");
//	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(4).getCell(3).getDateCellValue());
//	System.out.println("***************************");
	
	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(2).getCell(5).toString());
	System.out.println("***************************");
	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(3).getCell(1).toString());
	System.out.println("***************************");
	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(4).getCell(7).toString());
	System.out.println("***************************");
	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(4).getCell(3).toString());
	System.out.println("***************************");
	System.out.println("boolean value:"+wb_1.getSheet("Sheet1").getRow(4).getCell(3).toString());
	
	System.out.println("***************************");
	
//	XSSFWorkbook wb_2=new XSSFWorkbook(fis);
//	System.out.println(wb_2.getSheet("Sheet1").getRow(2).getCell(5).getBooleanCellValue());
}
}
