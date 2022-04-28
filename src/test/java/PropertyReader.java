package com.techbeetraining.ExercisePart1;

import java.util.Properties;
import java.io.File;
import java.net.URL;
import java.io.FileInputStream;
import java.io.IOException;

public class PropertyReader {

	private Properties properties = new Properties();

	public PropertyReader() { 
		loadFile();
	}
	
	private void loadFile() {
		
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(new File(this.getClass().getResource("").getPath()).getParentFile().getParentFile().getParentFile() + "/target/test/resources/" + "config.properties");
			properties.load(fileInputStream);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String readValue(String key) {
	
		return properties.getProperty(key);
	}
}
