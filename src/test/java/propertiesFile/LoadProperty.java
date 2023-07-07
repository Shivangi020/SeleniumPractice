package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    public static Properties loadProperties() throws IOException {
    	Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/test/java/propertiesFile/Config.properties");
		prop.load(fis);
		return prop;
    }

}
