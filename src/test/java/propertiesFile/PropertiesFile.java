package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		
//		1. Create Properties object
		Properties prop = new Properties();
		
//		2. Create input stream of your property file
		FileInputStream fis = new FileInputStream("./Config.properties");
		
//		3. Load the input stream file
		prop.load(fis);

		
		System.out.println(prop.getProperty("firstname"));

	}

}
