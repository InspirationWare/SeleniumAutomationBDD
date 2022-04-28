package com.techbeetraining.ExercisePart1;

public class Handler {
	private static PropertyReader propertyReader = new PropertyReader();
	private static SeleniumDriverFunctions seleniumDriverFunctions = new SeleniumDriverFunctions(new SeleniumDriver(propertyReader.readValue("edgedriver_type"), propertyReader.readValue("edgedriver_path"), 2L, 20L));
	
	protected static PropertyReader getPropertyReader() {
		return propertyReader;
	}
	
	protected static SeleniumDriverFunctions getSeleniumDriverFunctions() {
		return seleniumDriverFunctions;
	}
}