package com.prestashop.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@smoke",
		features="src/test/resources/com/prestashop/features", 
		glue="com/prestashop/step_definitions"
//		dryRun = false
		)
public class CukesRunner {
	
}
