package com.qa.pages;


	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

	public class HomePage extends TestBase {
		
		@FindBy(id="idcta-link") 
		WebElement Signin;
		
		@FindBy(id="idcta-username")
		WebElement Displayusername;
		
		//---------    Initializing the page objects ---------
		
				public HomePage() {
					PageFactory.initElements(driver, this);
				}
				
		//------------   Functions   -------------------
				
				public String getUsername() {
				return Displayusername.getText();
				}
				
				public void clickSignInLink() {
					Signin.click();
				}
	}


