package com.SwagLabs.TestCase;

import org.testng.annotations.Test;

public class CheckoutpageTestCase  extends BaseClass{
  @Test(priority=1,enabled=false)
  public void verifyCancel() {
	  
	  cp.doCancel();
  }
  
  @Test(priority=2)
  public void verifyCheckout() {
	  
	  cp.doCheckout("Krishna", "Choudhari", "411052");
	  
  }
  
  
}
