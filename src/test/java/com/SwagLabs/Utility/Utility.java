package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public static void screenshot(WebDriver driver) {
		
		TakesScreenshot ts = ( TakesScreenshot)driver;
		File temp=  ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\screenshot\\SwagLabs"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
		public static void selectbasedropdown(WebElement ele,String value) {
			
			
		    Select dd=new Select(ele);
		    System.out.println("Is dropDown support multiple selection?:"+dd.isMultiple());
			
		    List<WebElement>allOptions=dd.getOptions();
		    System.out.println("Total options are:"+allOptions.size());
		    
	for(WebElement i: allOptions) {
				
				System.out.println(i.getText());
				if(i.getText().contains(value)) {
					i.click();
				break;
		}
	}
		}
	

		
		public static WebElement waitForVisibility1(WebDriver driver,By loc) {
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		    
		}
	    public static WebElement WaitForPresence(WebDriver driver,By loc1) {
	    	 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
	 		 return wait2.until(ExpectedConditions.presenceOfElementLocated(loc1));

	    }
	    
	    public static WebElement waitForElementToClick(WebDriver driver,By loc2) {
	    	WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
			 return wait2.until(ExpectedConditions.presenceOfElementLocated(loc2));

	    }
	}


