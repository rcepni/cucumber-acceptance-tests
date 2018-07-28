package com.prestashop.step_definitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.prestashop.pages.HomePage;

import cucumber.api.java.en.Then;

public class ProductInformationValidationsStepDefs {

	HomePage homePage = new HomePage();

	@Then("the user should be to see {string}")
	public void the_user_should_be_to_see(String productName) {
		assertTrue(homePage.item(productName).isDisplayed());
	}

	@Then("the user should be able to see following products")
	public void the_user_should_be_able_to_see_following_products(List<String> products) {
		System.out.println(products.size());
		for (String product : products) {
			System.out.println(product);
			assertTrue(homePage.item(product).isDisplayed());
		}
		// break like 10 mins

	}
}
