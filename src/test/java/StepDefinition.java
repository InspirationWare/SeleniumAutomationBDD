package com.techbeetraining.ExercisePart1;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.junit.Assert;

public class StepDefinition {
	
	@BeforeAll
	public static void setup() {
		Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().manage().window().maximize();
		Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().manage().deleteAllCookies();
	}
	
	@AfterAll
	public static void close() {
		Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().quit();
	}
	
	@Before
	public void goHome() {
		Handler.getSeleniumDriverFunctions().goToURL(Handler.getPropertyReader().readValue("home_path"));
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		Assert.assertEquals(Handler.getPropertyReader().readValue("home_path"), Handler.getSeleniumDriverFunctions().getURL());
	}
	
	@When("^user selects products page link$")
	public void user_selects_products_page_link() {
		Handler.getSeleniumDriverFunctions().clickOn(Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().findElement(By.xpath(Handler.getPropertyReader().readValue("spend&savelink_xpath"))));
	}
	@Then("^user should see products image$")
	public void user_should_see_products_image() {
		Assert.assertTrue(Handler.getSeleniumDriverFunctions().findDisplayed(Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().findElement(By.xpath(Handler.getPropertyReader().readValue("productsimage_xpath")))));
	}
	
	@When("^user selects button for standard$")
	public void user_selects_button_for_standard() {
		Handler.getSeleniumDriverFunctions().clickOn(Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().findElement(By.xpath(Handler.getPropertyReader().readValue("aspirationbutton_xpath"))));
	}
	@Then("^email address input field loads for standard$")
	public void email_address_input_field_loads_for_standard() {
		Assert.assertTrue(Handler.getSeleniumDriverFunctions().findDisplayed(Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().findElement(By.xpath(Handler.getPropertyReader().readValue("aspirationpopup_xpath")))));
	}
	
	@When("^user selects button for plus$")
	public void user_selects_button_for_plus() {
		Handler.getSeleniumDriverFunctions().clickOn(Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().findElement(By.xpath(Handler.getPropertyReader().readValue("aspirationplusbutton_xpath"))));
	}
	@Then("^email address input field loads for plus$")
	public void email_address_input_field_loads_for_plus() {
		Assert.assertTrue(Handler.getSeleniumDriverFunctions().findDisplayed(Handler.getSeleniumDriverFunctions().getSeleniumDriver().getDriver().findElement(By.xpath(Handler.getPropertyReader().readValue("aspirationpopup_xpath")))));
	}
}