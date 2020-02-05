package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//-----------    Page Factory Objects ----------------
	
		@FindBy(id="user-identifier-input") 
		WebElement username ;
		
		@FindBy(id="password-input") 
		WebElement password;
		
		@FindBy(id="submit-button") 
		WebElement submitButton;
		
		//---------    Initializing the page objects ---------
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//------------   Functions   -------------------
		
		
		
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public BBCHomePage loginToSite() {
			username.sendKeys(prop.getProperty("username"));
		    password.sendKeys(prop.getProperty("password"));
		    submitButton.click();
		    
		    return new BBCHomePage();
		}

	}



