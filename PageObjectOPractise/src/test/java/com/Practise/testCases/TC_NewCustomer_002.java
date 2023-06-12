package com.Practise.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Practise.pageObjects.LoginDemoGuru;
import com.Practise.pageObjects.NewCustomer;

public class TC_NewCustomer_002 extends BaseClass {
	
	@Test
	public void NewCutomer_Test() throws InterruptedException, IOException
	{
		LoginDemoGuru d = new LoginDemoGuru(driver);
		
		d.Login_UserName(User_ID);
		d.Login_pwd(User_pwd);
		d.login_btn_click();
		
		NewCustomer nc = new NewCustomer(driver);
		
		
		
		nc.Newcust_btn_Click();
		
		Thread.sleep(2000);
		
		logger.info("New Customer Button is clicked");
		
		nc.SetUserName(nc_username1);
		
		Thread.sleep(2000);
		
		logger.info("Username is entered ");
		
		nc.SelectGender();
		
		logger.info("Gender is selected");
		
		nc.SetDOB(nc_dd, nc_mm, nc_yyyy);
		Thread.sleep(2000);
		
		logger.info("Date of Birth is Selected");
		
		nc.SetAddress(nc_address1);
		Thread.sleep(2000);
		
		logger.info("Address is Entered");
		
		nc.SetCity(nc_city1);
		Thread.sleep(2000);
		
		logger.info("City name is Entered");
		
		nc.Setstate(nc_State1);
		Thread.sleep(2000);
		
		logger.info("State name is entered");
		
		nc.SetPincode(nc_pin);
		Thread.sleep(2000);
		
		logger.info("Pin number is entered");
		
		nc.SetPhoneNum(nc_pnum);
		Thread.sleep(2000);		
		logger.info("Phone number is entered");
		
		nc.SetEmail(nc_Email);
		Thread.sleep(5000);
		
		logger.info("Email id is entered");
		
		nc.Click_On_Submit_btn();
		Thread.sleep(2000);
		
		
		logger.info("NewCustomer Submit button is clicked");
		
		Thread.sleep(2000);
		
		captureScreenshot(driver, "NewCustomer-TC");
		
		logger.info(" Screenshot Taken ");
		
		clickAlert(driver);
		
		
				
	}

}
