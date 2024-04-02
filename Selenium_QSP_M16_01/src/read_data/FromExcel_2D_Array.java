package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FromExcel_2D_Array {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File file=new File("./resources/Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
	
	int row_count = wb.getSheet("Sheet5").getPhysicalNumberOfRows();
	System.out.println(row_count);
	int cell_count = wb.getSheet("Sheet5").getRow(0).getPhysicalNumberOfCells();
	System.out.println(cell_count);
	
	String[][] arr=new String[row_count][cell_count];
	
	for(int i=0;i<row_count;i++) {
		for(int j=0;j<cell_count;j++) {
			arr[i][j]=wb.getSheet("Sheet5").getRow(i).getCell(j).toString();
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
}
}
