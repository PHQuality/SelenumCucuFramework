package com.qa.stepDefinitions;
import org.junit.Assert;

import com.qa.base.TestBase;
import com.qa.pages.AuthenticationPage;
import com.qa.pages.HomePage;
import com.qa.pages.ShopCartSummaryPage;
import com.qa.pages.SummerDressPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDefinition extends TestBase {
	
	HomePage homePage;
	AuthenticationPage authenticationPage;
	ShopCartSummaryPage shopCartSummaryPage;
	SummerDressPage summerDressPage;
	

	@Given("^user is at the home page$")
	public void user_is_at_the_home_page() {
		TestBase.intiallization();
		System.out.println("Title of home page is " + driver.getTitle());
		Assert.assertEquals("My Store", driver.getTitle());
	    
	}

	@When("^user selects Dresses tab$")
	public void user_selects_Dresses_tab() {
	    homePage = new HomePage();
	    homePage.clickDressTab();
	    

	}

	@When("^user selects \"([^\"]*)\"tab$")
	public void user_selects_tab(String arg1) {
	    
     homePage = new HomePage();
     homePage.clickSummerDressTab();
	    
	}

	@When("^user selects \"([^\"]*)\" dress item$")
	public void user_selects_dress_item(String arg1) throws Throwable {
		
		summerDressPage = new SummerDressPage();
		summerDressPage.clickDressImage();
	   
	    
	}

	@When("^user clicks add to cart button$")
	public void user_clicks_add_to_cart_button() throws Throwable {
		summerDressPage = new SummerDressPage();
		summerDressPage.clickAddtoCartButton();
	    
	}

	@When("^user clicks proceed to checkout button$")
	public void user_clicks_proceed_to_checkout_button() throws Throwable {
		summerDressPage.clickPraceedtoCheckoutButton();
	    
	}

	@When("^user clicks proceed to checkout button on cart summary page$")
	public void user_clicks_proceed_to_checkout_button_on_cart_summary_page() throws Throwable {
		shopCartSummaryPage = new ShopCartSummaryPage();
		shopCartSummaryPage.clickPraceedtoCheckoutButton();
	    
	}

	@Then("^authenticaion page is displayed$")
	public void authenticaion_page_is_displayed() throws Throwable {
		authenticationPage = new AuthenticationPage();
		authenticationPage.checkLoginButton();
	}


	
}
