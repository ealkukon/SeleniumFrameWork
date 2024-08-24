package com.kmshoppingapp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
		//@FindBy(name="email")
		//private WebElement signin;

		@FindBy(name="email")
		private WebElement emailaddresstb;

		@FindBy(name="password")
		private WebElement passwordtb;

		@FindBy(xpath="//*[@type=\"submit\"]")
		private WebElement sumbit;

		public Login(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		public void loginCredtial(String email,String password) {
			//signin.click();
			emailaddresstb.sendKeys(email);
			passwordtb.sendKeys(password);
			sumbit.click();
		}

		}



