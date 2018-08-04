package com.prestashop.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class SearchSteps {

	@Given("the user clicks on link Dresses")
	public void the_user_clicks_on_link_Dresses() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("user sorts by {string}")
	public void user_sorts_by(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("following product should be displayed on top")
	public void following_product_should_be_displayed_on_top(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new PendingException();
	}
}
