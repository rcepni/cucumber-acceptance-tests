package com.prestashop.pages;

import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class SearchResultsPage {
	public SearchResultsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
}
