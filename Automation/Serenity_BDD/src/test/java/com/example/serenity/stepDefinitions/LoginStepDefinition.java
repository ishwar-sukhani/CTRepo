package com.example.serenity.stepDefinitions;

import com.example.serenity.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

	@Steps
	LoginSteps loginSteps;
	
	@Given("^the application$")
	public void the_application() throws Throwable {
		loginSteps.openLoginPage();
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		loginSteps.enterUsername();
		loginSteps.enterPassword();
	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		loginSteps.clickSubmit();
	}

	@Then("^Login should be sucessful$")
	public void login_should_be_sucessful() throws Throwable {
		loginSteps.verifySuccessfulLogin();
	}
}
