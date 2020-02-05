package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.TestBase;

public class ShopCartSummaryPage extends TestBase {
	

	@FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
	private WebElement ProceedtoCheckoutBtn;

	// --------- Initializing the page objects ---------

	public ShopCartSummaryPage() {
		PageFactory.initElements(driver, this);
	}

	// ------------ Functions -------------------

	
	public void clickPraceedtoCheckoutButton() {

		ProceedtoCheckoutBtn.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ProceedtoCheckoutBtn);
		

		
		
		    
	}

}
