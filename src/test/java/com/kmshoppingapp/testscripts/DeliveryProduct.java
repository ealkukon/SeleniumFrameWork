package com.kmshoppingapp.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kmshoppingapp.pom.pages.EveningDress;
import com.kmshoppingapp.pom.pages.Home;
import com.kmshoppingapp.pom.pages.Login;

import genericlibrarycom.shoppingapp.Baseclass;
import genericlibrarycom.shoppingapp.Propertyfile;
import genericlibrarycom.shoppingapp.Utilies;

public class DeliveryProduct extends Baseclass {
	@Test 
	public void productdeliver() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.loginCredtial(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
		
		Home h=new Home(driver);
		Utilies.mouseHover(driver,h.getDresstab());
		h.eveningdree();
		
		EveningDress e=new EveningDress(driver);
		e.deliveryproduct();
		Assert.assertEquals(driver.getTitle(),Propertyfile.getpropertyfiledata("deliverytitle"));
		
	}

}
