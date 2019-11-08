package com.qa.stepDefinitions;

import org.junit.Assert;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	@Given("^user is in home page$")
	public void user_is_in_home_page() {
		TestBase.intiallization();
		Assert.assertEquals("BBC - Home", driver.getTitle());
		System.out.println("Title of home page is " + driver.getTitle());

	}

	@When("^user clicks Sign in$")
	public void user_clicks_Sign_in() {
		homePage = new HomePage();
		homePage.clickSignInLink();

	}

	@When("^user enter user deatils and clicks Sign-in button$")
	public void user_enter_user_deatils_and_clicks_Sign_in_button() {
		loginPage = new LoginPage();
		loginPage.loginToSite();

	}

	@Then("^user is logged in to the system$")
	public void user_is_logged_in_to_the_system() {
		String exp_userName = prop.getProperty("userDisplayName");
		String actual_userName = homePage.getUsername();
		Assert.assertEquals(exp_userName, actual_userName);
	}

}
