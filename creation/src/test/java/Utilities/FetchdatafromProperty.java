package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Constants.constants;

public class FetchdatafromProperty {
	
	public static Properties fetchDataFromProperty() throws IOException {//return type of this method is Property
		
		FileReader reader = new FileReader(constants.Propertyvalue);
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
		
	}

}
