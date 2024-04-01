package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FromFile {
public static void main(String[] args) throws IOException {
	
	File file=new File("./resources/File_01.txt");//giving location of file
	FileInputStream fis=new FileInputStream(file);
	
//	System.out.println(fis.read());//integer
//	System.out.println((char)fis.read());//character-->typecasting
	
	int var = fis.read();
	
	while(var !=-1) {
		System.out.print((char)var);
		var=fis.read();
	}
	
}
}
