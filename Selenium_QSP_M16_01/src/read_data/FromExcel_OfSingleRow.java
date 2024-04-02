package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FromExcel_OfSingleRow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	File file=new File("./resources/Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
	
//	System.out.println(wb.getSheet("Sheet2").getPhysicalNumberOfRows());
//	System.out.println(wb.getSheet("Sheet3").getPhysicalNumberOfRows());
	
	int row_size = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
	int info=wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
	
	System.out.println(info);
	
//	int[] arr=new int[2];
	String[] arr=new String[info];
	
	for(int i=0;i<info;i++) {
		arr[i]=wb.getSheet("Sheet2").getRow(0).getCell(i).toString();
		System.out.println(wb.getSheet("Sheet2").getRow(0).getCell(i).toString());
		//System.out.println(arr[i]);
	}
	
//	for(int i=0;i<info;i++) {
//		System.out.println(arr[i]);
//	}
	
}
}
