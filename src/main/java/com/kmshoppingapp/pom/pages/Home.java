package com.kmshoppingapp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement sumbitbtn;
	
	@FindBy(xpath="//a[text()='Dresses']")
	private WebElement dresstab;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningdress;
	
	public WebElement getDresstab() {
		return dresstab;
	}

	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void productSerach(String product) {
		serachtb.sendKeys(product);
		sumbitbtn.click();
	}
	
	public void eveningdree() {
		eveningdress.click();
	}

}



