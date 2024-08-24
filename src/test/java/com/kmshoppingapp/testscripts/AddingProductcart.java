package com.kmshoppingapp.testscripts;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kmshoppingapp.pom.pages.Addtocart;
import com.kmshoppingapp.pom.pages.Home;
import com.kmshoppingapp.pom.pages.Login;
import com.kmshoppingapp.pom.pages.Product;


import genericlibrarycom.shoppingapp.Propertyfile;
import genericlibrarycom.shoppingapp.Utilies;

public class AddingProductcart extends genericlibraryShoppingapp.Baseclass {
	@Test
	public void addigncart() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.loginCredtial(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
		
		Home h=new Home(driver);
		h.productSerach(Propertyfile.getpropertyfiledata("productname"));
		
		Product p=new Product(driver);
		Utilies.dropDown(p.getSerachdd(), Propertyfile.getpropertyfiledata("sortby"));
		
		Addtocart a=new Addtocart(driver);
		a.plusbutton();
		Utilies.dropDown(a.getSizedd(), Propertyfile.getpropertyfiledata("sizedd"));
		a.addingtocart();
		Assert.assertEquals(driver.getTitle(),Propertyfile.getpropertyfiledata("addtocarttitle"));
	}

}
