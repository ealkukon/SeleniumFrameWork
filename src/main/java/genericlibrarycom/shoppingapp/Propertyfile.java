package genericlibrarycom.shoppingapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile implements Autoconstant {
	
	public static String getpropertyfiledata(String keys) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath));
		return p.getProperty(keys);
		
		
}

}
