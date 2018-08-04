package com.prestashop.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.prestashop.pages.SearchResultsPage;
import com.prestashop.utilities.BrowserUtils;
import com.prestashop.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {

	SearchResultsPage searchPage = new SearchResultsPage();

	@Given("the user clicks on link Dresses")
	public void the_user_clicks_on_link_Dresses() {
		searchPage.dresses.click();
	}

	@When("user sorts by {string}")
	public void user_sorts_by(String option) {
		searchPage.sortBy().selectByVisibleText(option);
		BrowserUtils.waitFor(1);
	}

	@Then("following product should be displayed on top")
	public void following_product_should_be_displayed_on_top(Map<String, String> product) {
		Actions action = new Actions(Driver.getDriver());
		action.sendKeys(Keys.ARROW_DOWN).perform();
		String expectedName = product.get("name");
		String expectedPrice = product.get("price");
		String actualName = searchPage.getProductName(1).getText();
		String actualPrice = searchPage.getProductPrice(1).getText();

		assertEquals(expectedName, actualName);
		assertEquals(expectedPrice, actualPrice);
	}
}
