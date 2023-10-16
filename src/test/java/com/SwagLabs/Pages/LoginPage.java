package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//Encapsulation = data+Function
	
	//declare webDriver
	private WebDriver driver;
	//Initialization
	
	//Indentification - By Locators 
	
    public LoginPage(WebDriver driver) {//Base class driver
		this.driver=driver;
	}

	private	By username=By.id("user-name");
	private By password=By.id("password");
	private By login=By.id("login-button");
	
	//Public method to access that data
	public void dologin(String un ,String psw) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(login).click();
		
	}
	public String getAppTitle() {
		 return driver.getTitle();
	}
	
   public String getAppcurrentUrl() {
	return driver.getCurrentUrl();
	
    }
	
	
	
	
	
	
	
	
	
}
