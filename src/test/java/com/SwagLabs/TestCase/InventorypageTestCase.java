package com.SwagLabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class InventorypageTestCase extends BaseClass{

  @Test(priority=1)
  public void verifyTotalProductCount() {       
	  int count=ip.gettotalProductCount();
	  Assert.assertEquals(count, 6,"Cpunt is not Matched!!!");
	  System.out.println("Total products are:"+count);
	  
  }
  
 @Test(priority=2)
 public void verifyProductName() {
	 ip.getProductName();
	 
 }
 @Test(priority=3)
 public void verifyAddToacrtTest() {
	ip.addProductToCart("Sauce Labs Fleece Jacket");
	
 }
}
