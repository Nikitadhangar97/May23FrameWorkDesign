package com.SwagLabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTestcase extends BaseClass {

	
  @Test(priority=1)
  public void verifyTitle() {
	  
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Swag"),"Title validation fail ");
	  System.out.println("Title validation Pass");
  }
  
  @Test(priority=2)
  public void verifyLogin() {
	
	  lp.dologin("standard_user", "secret_sauce");
	  Assert.assertTrue(lp.getAppcurrentUrl().contains("inventory"),"Login fail");
	  System.out.println("Login is Successfully Completed!!!");
  }
  
  @Test(priority=1)
  public void verifyCurrentUrl() {
	  String actURL=lp.getAppcurrentUrl();
	  Assert.assertTrue(actURL.contains("saucedemo"),"url not match");
	  System.out.println("Url is matched:"+actURL);
	  
	  
	  
  }
}
