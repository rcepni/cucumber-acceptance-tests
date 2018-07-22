package com.prestashop.step_definitions;

import com.prestashop.pages.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductInformaitonStepDefs {
	
	HomePage homePage = new HomePage();
	
	@When("the user selects Printed Summer Dress")
	public void the_user_selects_Printed_Summer_Dress() {
		homePage.item("Printed Dress").click();
	}

	@Then("product information page should be displayed")
	public void product_information_page_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("product name should be Printed Summer Dress")
	public void product_name_should_be_Printed_Summer_Dress() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
