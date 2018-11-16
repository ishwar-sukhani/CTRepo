package com.example.serenity.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.example.serenity.pageObjects.LoginPage;

import net.thucydides.core.annotations.Steps;

public class LoginSteps {
	
	@Steps
	LoginPage loginPage;

	public void openLoginPage() {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\chromedriver_win32\\chromedriver.exe");
		loginPage.setDriver(new ChromeDriver());
		loginPage.setDefaultBaseUrl("https://github.com/login");
		loginPage.open();
	}

	public void enterUsername() {
		loginPage.enterUsername();
	}

	public void enterPassword() {
		loginPage.enterPassword();
	}

	public void clickSubmit() {
		loginPage.clickSubmit();
	}

	public void verifySuccessfulLogin() {
		System.out.println("Verifying Whether Login is Successful");
	}

}
