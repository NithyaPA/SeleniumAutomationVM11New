package packSix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafromProp {
	public static void main(String[] args) throws IOException {
	//C:\Users\Student\eclipse-workspace\Sixth_Oct\TestData\URLDetails.properties
	
	FileInputStream obj = new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\Sixth_Oct\\TestData\\URLDetails.properties");
	
	Properties obj2 = new Properties();
	
	obj2.load(obj);
	System.out.println(obj2.getProperty("url_qa"));
	System.out.println(obj2.getProperty("url_prod"));
	System.out.println(obj2.getProperty("user"));
	
}
}
