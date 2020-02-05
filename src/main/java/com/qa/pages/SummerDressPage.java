package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class SummerDressPage extends TestBase {
	
	
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement AddtoCartBtn;

	@FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
	private WebElement ProceedtoCheckoutBtn;
	
	//div[@class="product-image-container"]
	@FindBy(xpath = "//a[@class=\"product_img_link\"]")
	private WebElement DressImage;

	// --------- Initializing the page objects ---------

	public SummerDressPage() {
		PageFactory.initElements(driver, this);
	}

	// ------------ Functions -------------------

	public void clickAddtoCartButton() {
		WebDriverWait wait = new WebDriverWait(driver, 5L);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add to cart']")));

		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", AddtoCartBtn);
		//executor.executeScript("arguments[0].click();", AddtoCartBtn);
		

	}
	
	public void clickDressImage(){
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", DressImage);
		//DressImage.click();	
	}
	
	public void clickPraceedtoCheckoutButton() {

		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ProceedtoCheckoutBtn);
		

	}

}
