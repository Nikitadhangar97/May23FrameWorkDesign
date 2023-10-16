package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    //declare WebDriver
	private WebDriver driver;
	
	//Initialize driver
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Locators
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By contiunebtn=By.id("continue");
	
	//public methods
	public void doCancel() {
		driver.findElement(cancelbtn).click();
	}
	
	public void doCheckout(String f,String l,String zip) {
		driver.findElement(fname).sendKeys(f);
		driver.findElement(lname).sendKeys(l);
		driver.findElement(zipcode).sendKeys(zip);
		driver.findElement(contiunebtn).click();
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
