package com.kmshoppingapp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedd;

	public WebElement getSizedd() {
		return sizedd;
	}
	
	@FindBy(name="Green")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;
	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void plusbutton() {
		plusbtn.click();
	}
	
	public void addingtocart() {
		color.click();
		addtocart.click();
		proceedtocheckout.click();
	}
	
	

}



