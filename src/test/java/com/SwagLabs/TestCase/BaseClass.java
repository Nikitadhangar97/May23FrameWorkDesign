package com.SwagLabs.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.AddToCartPage;
import com.SwagLabs.Pages.CheckOutPage;
import com.SwagLabs.Pages.InventoryPage;
import com.SwagLabs.Pages.LoginPage;
import com.SwagLabs.Pages.OverViewPage;
import com.SwagLabs.Utility.PropertiesUtil;
import com.SwagLabs.Utility.Utility;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OverViewPage op;
	public PropertiesUtil p1;
	@BeforeTest
	public void SetUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		p1=new PropertiesUtil();
	    lp=new LoginPage(driver);
	    ip=new InventoryPage(driver);
	    ap=new AddToCartPage (driver);
	    cp=new CheckOutPage(driver);
	    op=new OverViewPage(driver);
	    
	}
	@BeforeClass
	public void pagesSetUp() {
		System.out.println("***************Login Test*************");
		System.out.println("Verified title:"+lp.getAppTitle());
		Utility.screenshot(driver);
		lp.dologin(p1.getData("un"),p1.getData("psw"));
		Utility.screenshot(driver);
		waitstep();
		System.out.println("Verified Current url:"+lp.getAppcurrentUrl());
		System.out.println("********************Inventory Test******************");
		System.out.println("Total products are:"+ip.gettotalProductCount());
		Utility.screenshot(driver);
		ip.getProductName();
		waitstep();
		Utility.screenshot(driver);
		ip.addProductToCart(p1.getData("pname"));
		Utility.screenshot(driver);
		System.out.println("**********************Add To Cart Test*********************");
		waitstep();
		ap.getApp();
		Utility.screenshot(driver);
		waitstep(); 
		ap.doRemove();
		Utility.screenshot(driver);
		waitstep();
		ap.doContinue();
		waitstep();
		ip.addProductToCart(p1.getData("pname2"));
		waitstep();
		ap.getApp();
		waitstep();
		ap.docheckout();
		System.out.println("***********************Checkout Test**********************");
		Utility.screenshot(driver);
		cp.doCheckout(p1.getData(" fname"),p1.getData("lname"),p1.getData("zcode"));
		Utility.screenshot(driver);
		
	}
	public void waitstep() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
