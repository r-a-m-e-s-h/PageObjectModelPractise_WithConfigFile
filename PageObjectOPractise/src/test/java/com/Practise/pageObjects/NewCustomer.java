package com.Practise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	
	WebDriver ldriver;
	
	public NewCustomer(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath = "//li//a[text()='New Customer']")
	public static WebElement newCustomer_btn;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	public static WebElement txtUname;
	
	@FindBy(xpath = "//input[@name='rad1']")
	public static WebElement gender;
	
	
	@FindBy(xpath = "//input[@name='dob']")
	public static WebElement dob;
	
	@FindBy(xpath = "//*[@name='addr']")
	public static WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	public static WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	public static WebElement state;
	
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pincode; 
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement phn_No;
	
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='sub']")
	WebElement submit_btn;
	
	//@Findby
	
	public void Newcust_btn_Click()
	{
		newCustomer_btn.click();
		
	}
	
	public void SetUserName(String uname)
	{
		txtUname.sendKeys(uname);
	}

	public void SelectGender()
	{
		gender.click();
	}
	
	public void SetDOB(String mm, String dd, String yyyy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}
	
	public void SetAddress(String nc_address)
	{
		address.sendKeys(nc_address);
	}
	
	public void SetCity(String nc_cty)
	{
		city.sendKeys(nc_cty);
	}
	
	public void Setstate(String nc_state)
	{
		state.sendKeys(nc_state);
	}
	public void SetPincode(String pin)
	{
		pincode.sendKeys(pin);
	}
	
	public void SetPhoneNum(String pnum)
	{
		phn_No.sendKeys(pnum);
	}
	
	public void SetEmail(String Emailname)
	{
		email.sendKeys(Emailname);
	}
	
	public void Click_On_Submit_btn()
	{
		submit_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
