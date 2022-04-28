package com.techbeetraining.ExercisePart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class SeleniumDriver {
	
	private WebDriver driver = null;
	private Wait<WebDriver> wait = null;
	
	public SeleniumDriver(String type, String path, long polling, long timeout) {
		
		setDriver(type, path);
		setWait(polling, timeout);
	}
	
	public void setDriver(String type, String path) {
		
		final String [] drivers = new String[] {
			"webdriver.edge.driver", "webdriver.firefox.driver", "webdriver.chrome.driver"
		};
		
		if (type.equals("edge")){
			System.setProperty(drivers[0], path);
			driver = new EdgeDriver();
		}
		else if (type.equals("firefox")) {
			System.setProperty(drivers[1], path);
			driver = new FirefoxDriver();
		}
		else if (type.equals("chrome")){
			System.setProperty(drivers[2], path);
			driver = new ChromeDriver();
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setWait(long polling, long timeout) {
		wait = new FluentWait(driver).pollingEvery(Duration.ofSeconds(polling)).withTimeout(Duration.ofSeconds(timeout));
	}
	
	public Wait getWait(){ 
		return wait;
	}
	
}