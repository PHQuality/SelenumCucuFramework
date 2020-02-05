package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.TestBase;

public class AuthenticationPage extends TestBase {
	
	
	
	@FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
	private WebElement LoginBtn;

	

	// --------- Initializing the page objects ---------

	public AuthenticationPage() {
		PageFactory.initElements(driver, this);
	}

	// ------------ Functions -------------------

	public void checkLoginButton() {

		LoginBtn.isDisplayed();
		

	}

}
