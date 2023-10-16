package com.SwagLabs.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddToCartPageTestCase extends BaseClass
{
	@Test(priority=1)
	public void verifyAppOpenState() {
		ap.getApp();

	
}

	@Test(priority=2)
	public void verifyRemove() {
    ap.doRemove();
    waitstep();
    
}

	@Test(priority=3)
	public void verifyContiune() {

	ap.doContinue();
	waitstep();
	ip.addProductToCart("Sauce Labs Fleece Jacket");
	waitstep();
	ap.getApp();
	waitstep();
}

	@Test(priority=4)
	public void verifyCheckOut() {

	ap.docheckout();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}