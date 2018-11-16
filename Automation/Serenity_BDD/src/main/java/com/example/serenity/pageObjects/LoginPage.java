package com.example.serenity.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{

	@FindBy(id = "login_field")
	WebElementFacade username;
	
	@FindBy(id = "password")
	WebElementFacade password;
	
	@FindBy(css = "input[value='Sign in']")
	WebElementFacade signInButton;

	public void enterUsername() {
		element(username).sendKeys("ishwar-sukhani");
	}

	public void enterPassword() {
		element(password).sendKeys("ishu8070");
	}

	public void clickSubmit() {
		element(signInButton).click();
	}
	
	
	
}
