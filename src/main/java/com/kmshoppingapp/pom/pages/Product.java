package com.kmshoppingapp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	@FindBy(id="selectProductSort")
	private WebElement serachdd;
	
	@FindBy(xpath="(//a[@title='Printed Chiffon Dress'])[2]")
	private WebElement dress;
	
	public Product(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSerachdd() {
		return serachdd;
	}
	
	public void dressimg() {
		dress.click();
	}
	
	

}



