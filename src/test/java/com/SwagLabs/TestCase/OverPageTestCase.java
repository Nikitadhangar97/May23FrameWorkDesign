package com.SwagLabs.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverPageTestCase extends BaseClass{
  @Test(priority=1)
  public void verifyProductDetails() {
	 
	op.getDetails();
  }
  @Test(priority=2)
  public void verifyFinish() {
	 
	op.dofinish();;
  }
}
