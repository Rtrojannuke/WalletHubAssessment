package baseContainer;

import java.io.FileInputStream;
import java.util.Properties;

public class utility {

	String projectlocation = System.getProperty("user.dir");
	
	public String fetchconfig(String key) throws Exception{
		// parentName childName = new parentName();
		FileInputStream file = new FileInputStream(projectlocation+"/propertyfiles/config.properties");
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}
	
	public String fetchLocators(String key) throws Exception{
		// parentName childName = new parentName();
		FileInputStream file = new FileInputStream(projectlocation+"/propertyFiles/OR.propperties");
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}
	
	public String fetchData(String key) throws Exception{
		// parentName childName = new parentName();
		FileInputStream file = new FileInputStream(projectlocation+"/propertyFiles/data.properties");
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}

}
