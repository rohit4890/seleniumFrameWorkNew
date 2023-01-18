package aptara.utility;


import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	FileReader fileReader;
	
	/*
	 * This method is used to return key from the properties file config.prperties
	 * @param: key
	 */
public String getDataFromPropertiesFile(String key) {
	
	try {
		fileReader = new FileReader(System.getProperty("user.dir")+"/scr/test/resources/config.properties");
		prop = new Properties();  
		prop.load(fileReader);  
	} catch (Exception e) {
		e.printStackTrace();
	}  
	return prop.getProperty(key);		
}

}
