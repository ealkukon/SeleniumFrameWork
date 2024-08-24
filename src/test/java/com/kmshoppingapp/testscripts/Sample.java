package com.kmshoppingapp.testscripts;

import genericlibrarycom.shoppingapp.Utilies;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class Sample extends genericlibraryShoppingapp.Baseclass {
	@Test
	public void demo() throws AWTException, InterruptedException {
		Utilies.robot();
		Thread.sleep(50000);
		Utilies.switchWindow(driver);
		driver.get("https://www.flipkart.com/");
	}
	

}
