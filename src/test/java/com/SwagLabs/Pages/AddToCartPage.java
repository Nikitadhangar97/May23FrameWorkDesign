package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddToCartPage {

	//declare WebDriver
		private WebDriver driver;
		
		//Initialization for driver


	  public  AddToCartPage(WebDriver driver) {
		  this.driver=driver;
	  }
	 // locators
	  private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
	  private By removebtn=By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
	  private By continuebtn=By.xpath("//button[@class='btn btn_secondary back btn_medium']");
	  private By checkoutbtn=By.xpath("//button[@class='btn btn_action btn_medium checkout_button']");

	//public methods
	public void getApp() {
		
		driver.findElement(cartbtn).click();
		System.out.println("*************Cart Page Open********************");
	}

	public void doRemove() {
		driver.findElement(removebtn).click();
		System.out.println("After Removing the product we are on same cart page!!");
	}

	public void doContinue() {
		driver.findElement(continuebtn).click();
		System.out.println("After contiune we are on Inventory Page!!!");
	}

	public void docheckout() {
		driver.findElement(checkoutbtn).click();
		System.out.println("After CheckOut we are on Checkout Page!!");
	}

}
