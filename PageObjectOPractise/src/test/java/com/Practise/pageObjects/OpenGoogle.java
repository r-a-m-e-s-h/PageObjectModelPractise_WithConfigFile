package com.Practise.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenGoogle {
	
	WebDriver ldriver;
	
	public OpenGoogle(WebDriver rdriver) {
		
		// TODO Auto-generated constructor stub
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="q")
	public static WebElement textbox;
	
	
	public void searchTerm(String stext)
	{
		textbox.sendKeys(stext+Keys.ENTER);
	}
	

}
