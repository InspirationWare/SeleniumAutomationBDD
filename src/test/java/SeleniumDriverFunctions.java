package com.techbeetraining.ExercisePart1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumDriverFunctions {

	private SeleniumDriver seleniumDriver = null;
	private WebElement element = null;
	private Actions action = null;
	
	public SeleniumDriverFunctions(SeleniumDriver seleniumDriver) {
		setSeleniumDriver(seleniumDriver);
	}
	
	public void setSeleniumDriver(SeleniumDriver seleniumDriver) {
		this.seleniumDriver = seleniumDriver;
	}
	
	public SeleniumDriver getSeleniumDriver() {
		return seleniumDriver;
	}
	
	public void goToURL(String address) {
		seleniumDriver.getDriver().get(address);
	}
	
	public String getURL() {
		return seleniumDriver.getDriver().getCurrentUrl();
	}
	
	public boolean findClickable(WebElement element) {
		seleniumDriver.getWait().until(ExpectedConditions.elementToBeClickable(element));
		return element.isEnabled();
	}

	public boolean findDisplayed(WebElement element) {
		seleniumDriver.getWait().until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	public void clickOn(WebElement element) {
		seleniumDriver.getWait().until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void hover(WebElement element) {
		action = new Actions(seleniumDriver.getDriver());
		seleniumDriver.getWait().until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).perform();
	}
 }