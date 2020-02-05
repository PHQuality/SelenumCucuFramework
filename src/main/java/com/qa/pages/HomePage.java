package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[@title=\"Dresses\"]")
	private WebElement DressesTab;

	@FindBy(xpath = "//a[@title=\"Summer Dresses\"]")
	private WebElement SummerDressTab;

	// --------- Initializing the page objects ---------

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// ------------ Functions -------------------

	public void clickDressTab() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", DressesTab);
		

	}
	
	public void clickSummerDressTab() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", SummerDressTab);
		
	}

}
