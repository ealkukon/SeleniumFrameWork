package com.kmshoppingapp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress {
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement sizecb;
	
	@FindBy(id="layered_id_feature_16")
	private WebElement stylec;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement delierybtn;
	
	public EveningDress(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void deliveryproduct() {
		sizecb.click();
		stylec.click();
		delierybtn.click();
	}

}



