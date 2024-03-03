package com.kmshoppingapp.testscripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import genericlibrarycom.shoppingapp.Baseclass;
import genericlibrarycom.shoppingapp.Utilies;

public class Sample extends Baseclass {
	@Test
	public void demo() throws AWTException, InterruptedException {
		Utilies.robot();
		Thread.sleep(50000);
		Utilies.switchWindow(driver);
		driver.get("https://www.flipkart.com/");
	}
	

}
