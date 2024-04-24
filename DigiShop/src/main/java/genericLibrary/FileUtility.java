package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public static String getProperty(String key) {
		
		//Step 1: Get the Java representation of Physical file
		FileInputStream fis =null;
		
	 try {
		fis= new FileInputStream(FrameworkConstants.PROPERTIES_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 //Step 2: Create the object of properties class
	 Properties pObj=new Properties();
	 
	 //Step 3: Load key and values to the properties object
	 try {
		pObj.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	 //Step 4: 
      return pObj.getProperty(key);		
		
	}
}
