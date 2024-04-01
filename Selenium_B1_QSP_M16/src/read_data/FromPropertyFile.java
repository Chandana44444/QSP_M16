package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FromPropertyFile {
public static void main(String[] args) throws IOException {
	File file=new File("./resources/Properties_File_01.properties");
	FileInputStream fis=new FileInputStream(file);
	
	Properties prop=new Properties();
	
	prop.load(fis);
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("na"));//null
	System.out.println(prop.getProperty("subject"));
	
}
}
