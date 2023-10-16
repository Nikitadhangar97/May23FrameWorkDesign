package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage {

	private WebDriver driver;
	
	public OverViewPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
private By data=By.id("checkout_summary_container");
private By finishbtn =By.id("finish");
private By msg=By.xpath("//h2[text()='Thank you for your order!']");
	
	//Method
public void getDetails() {
	String text=driver.findElement(data).getText();
	System.out.println(text);
	
}
public void dofinish() {
	driver.findElement(finishbtn).click();
	System.out.println(driver.findElement(msg).getText());
}

	
	
	
}
