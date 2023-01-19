package samm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
     public static Properties property;
     private static String configpath="sam/Config.properties";
	public static void initializePropertyFile() {
		property = new Properties();
    try {
		InputStream input = new FileInputStream(configpath);
		try {
			property.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
	}

	}
