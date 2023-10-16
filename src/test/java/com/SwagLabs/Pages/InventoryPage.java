package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	
	private WebDriver driver;
	//Initialization of driver 
	public InventoryPage(WebDriver driver) {
		this .driver=driver;
		
	}
	//locators
	private By totalProduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By productName=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	private By addToCartbtn=By.xpath("//button[text()='Add to cart']");
	
	//methods
	public int  gettotalProductCount() {
		int count=driver.findElements(totalProduct).size();
		return count;
	}
	public void getProductName() {
		List<WebElement>allproduct=driver.findElements(productName);
		System.out.println("*****************Product Names are***********************");
		for(WebElement i:allproduct) {
			System.out.println(i.getText());
		}
	}
    public void addProductToCart(String pname) {
    	List<WebElement>allproducts=driver.findElements(productName);
        for(WebElement i:allproducts) {
        	if(i.getText().contains(pname))
        	{
        		i.click();
        		break;
        	}
        }
        driver.findElement(addToCartbtn).click();
        System.out.println("Selected Product added to cart");
			
		}
	}

